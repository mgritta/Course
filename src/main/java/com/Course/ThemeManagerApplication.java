package com.Course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**

 Главный класс приложения ThemeManager.
 Он используется для запуска приложения и конфигурации Spring Boot.
 */
@SpringBootApplication
public class ThemeManagerApplication extends SpringBootServletInitializer{

	/**

	 Метод main() является точкой входа в приложение ThemeManager.
	 Он запускает Spring Boot приложение.
	 @param args аргументы командной строки
	 */
	public static void main(String[] args) {
		SpringApplication.run(ThemeManagerApplication.class, args);
	}
}

