package com.example.annotations.RequiresRole;

import java.lang.reflect.Method;

public class RoleProcesseur {
	public static Object invoke(Object obj, Method method, User user) throws Exception {
		if (method.isAnnotationPresent(RequiresRole.class)) {
			RequiresRole annotation = method.getAnnotation(RequiresRole.class);
			String roleRequis = annotation.role();
			String roleUser = user.getRole();

			if (!roleRequis.equals(roleUser)) {
				throw new SecurityException("Acces refuse  (requis: " + roleRequis + ", user: " + roleUser + ")");
			}
		}

		return method.invoke(obj);
	}

	public static void main(String[] args) {
		Service service = new Service();
		User user = new User("USER");
		User admin = new User("ADMIN");

		Method[] methods = service.getClass().getDeclaredMethods();
		for (Method method : methods) {
			try {
				System.out.println("\nUSER appelle " + method.getName());
				RoleProcesseur.invoke(service, method, user);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				System.out.println("ADMIN appelle " + method.getName());
				RoleProcesseur.invoke(service, method, admin);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
