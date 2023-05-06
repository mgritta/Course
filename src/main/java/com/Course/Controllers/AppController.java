package com.Course.Controllers;
import com.Course.Theme;
import com.Course.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Контроллер приложения.
 */
@Controller
public class AppController {
    /**
     * Сервис для работы с темами.
     */
    @Autowired
    private ThemeService service;

    /**
     * Отображение главной страницы с темами.
     * @param model   объект модели
     * @param keyword ключевое слово для поиска темы
     * @return имя шаблона главной страницы
     */
    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Theme> listTheme = service.listAll(keyword);
        model.addAttribute("listTheme", listTheme);
        model.addAttribute("keyword", keyword);
        return "index";
    }

    /**
     * Отображение страницы авторов.
     * @return имя шаблона страницы авторов
     */
    @RequestMapping("/author")
    public String authorSession() {
        return "/author";
    }

    /**
     * Отображение страницы теории для определенной темы.
     * @param model объект модели
     * @param id    идентификатор темы
     * @return имя шаблона страницы теории
     */
    @RequestMapping("/theme{id}/theory")
    public String theorySession(Model model, @PathVariable(name = "id") Long id) {
        return "/theme" + id + "/theory";
    }

    /**
     * Отображение страницы первого задания для определенной темы.
     * @param model объект модели
     * @param id    идентификатор темы
     * @return имя шаблона страницы первого задания
     */
    @RequestMapping("/theme{id}/task1")
    public String task1Session(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("themeid", id);
        model.addAttribute("taskid", 1);

        return "/theme" + id + "/task1";
    }

    /**
     * Отображение страницы второго задания для определенной темы.
     * @param model объект модели
     * @param id    идентификатор темы
     * @return имя шаблона страницы первого задания
     */

    @RequestMapping("/theme{id}/task2")
    public String task2Session(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("themeid", id);
        model.addAttribute("taskid", 2);
        return "/theme" + id + "/task2";

    }

    /**
     * Отображение страницы третьего задания для определенной темы.
     * @param model объект модели
     * @param id    идентификатор темы
     * @return имя шаблона страницы первого задания
     */

    @RequestMapping("/theme{id}/task3")
    public String task3Session(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("themeid", id);
        model.addAttribute("taskid", 3);
        return "/theme" + id + "/task3";
    }

    /**
     * Отображение страницы четвертого задания для определенной темы.
     *
     * @param model объект модели
     * @param id    идентификатор темы
     * @return имя шаблона страницы первого задания
     */

    @RequestMapping("/theme{id}/task4")
    public String task4Session(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("themeid", id);
        model.addAttribute("taskid", 4);
        return "/theme" + id + "/task4";

    }
}
