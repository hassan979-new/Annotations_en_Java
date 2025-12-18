package com.example.annotations.ConfigValue;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConfigProcesseur {
	public static void inject(Object obj, String filePath) throws Exception {
		List<String> lines = Files.readAllLines(Paths.get(filePath));

		Field[] fields = obj.getClass().getDeclaredFields();

		int index = 0;
		for (Field field : fields) {
			if (field.isAnnotationPresent(ConfigValue.class)) {
				field.setAccessible(true);
				String value = lines.get(index++);

				if (field.getType() == int.class) {

					field.setInt(obj, Integer.parseInt(value));

				} else if (field.getType() == boolean.class) {

					field.setBoolean(obj, Boolean.parseBoolean(value));

				} else if (field.getType() == String.class) {

					field.set(obj, value);
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			AppConfig config = new AppConfig();
			ConfigProcesseur.inject(config, "src/com/example/annotations/ConfigValue/config");

			System.out.println(config);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
