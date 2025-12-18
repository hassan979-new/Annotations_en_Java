package com.example.annotations.loggable;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

public class LoggableProcess {
	public static Object invoke(Object obj, Method method, Object... args) throws Exception {
		System.out.println("======" + obj.getClass().getName() + "====== : ");
		System.out.println("======" + method.getName() + "====== : ");
		if (method.isAnnotationPresent(Loggable.class)) {
			System.out.println("- heure d'appel: "
					+ LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
			System.out.println("- parametres: " + Arrays.toString(args));
			System.out.println("- types parametres: " + Arrays.toString(method.getParameterTypes()));
		}

		Object result = method.invoke(obj, args);

		if (method.isAnnotationPresent(Loggable.class)) {
			System.out.println("- Valeur de retour : " + result);
		}

		return result;
	}

	public static void main(String[] args) {
		try {
			LoggableClass obj = new LoggableClass();

			Method[] methods = obj.getClass().getDeclaredMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(Loggable.class) && method.getParameterCount() == 2) {
					LoggableProcess.invoke(obj, method, 3, 5);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
