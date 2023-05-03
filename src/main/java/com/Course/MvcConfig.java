package com.Course;

import org.springframework.context.annotation.Configuration; // обединение методов в одно приложение
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 Класс MvcConfig - конфигурационный класс для настройки MVC (Model-View-Controller).
 Реализует интерфейс WebMvcConfigurer.
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     Метод addViewControllers() настраивает контроллеры для отображения view без необходимости написания контроллера.
     @param registry объект ViewControllerRegistry, который хранит все зарегистрированные ViewController'ы
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}

//---------------------//
//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//
//    }
//}