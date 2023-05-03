package com.Course;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
     *
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
     * Сохранение темы в сессии.
     *
     * @param theme объект темы
     * @return имя шаблона главной страницы
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSession(@ModelAttribute("Session") Theme theme) {
        service.save(theme);
        return "redirect:/";
    }

    /**
     * Отображение страницы авторов.
     *
     * @return имя шаблона страницы авторов
     */
    @RequestMapping("/author")
    public String authorSession() {
        return "/author";
    }

    /**
     * Отображение страницы теории для определенной темы.
     *
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
     *
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
     *
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
     *
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

//--------------------------------------//

//@Controller
//public class AppController {
//
//    @Autowired
//    private ThemeService service;
//
//    @RequestMapping("/")
//    public String viewHomePage(Model model, @Param("keyword") String keyword) {
//        List<Theme> listTheme = service.listAll(keyword);
//        model.addAttribute("listTheme", listTheme);
//        model.addAttribute("keyword", keyword);
//        return "index";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveSession(@ModelAttribute("Session") Theme theme) {
//        service.save(theme);
//        return "redirect:/";
//    }
//
//
//
//    @RequestMapping("/author")
//    public String authorSession() {
//        return "/author";
//    }
//
//
//    @RequestMapping("/theme{id}/theory")
//    public String theorySession(Model model, @PathVariable(name = "id") Long id) {
//        return "/theme" + id + "/theory";
//    }
//
//
//    // Маршрут для задания 1 в теме 1
//    @RequestMapping("/theme{id}/task1")
//    public String task1Session(@PathVariable(name = "id") Long id, Model model) {
//        model.addAttribute("themeid", id);
//        model.addAttribute("taskid", 1);
//
//        return "/theme" + id + "/task1";
//    }
//
//    // Маршрут для задания 2 в теме 1
//    @RequestMapping("/theme{id}/task2")
//    public String task2Session(@PathVariable(name = "id") Long id, Model model) {
//        model.addAttribute("themeid", id);
//        model.addAttribute("taskid", 2);
//        return "/theme" + id + "/task2";
//
//    }

//    // Маршрут для задания 3 в теме
//    @RequestMapping("/theme{id}/task3")
//    public String task3Session(@PathVariable(name = "id") Long id, Model model) {
//        model.addAttribute("themeid", id);
//        model.addAttribute("taskid", 3);
//        return "/theme" + id + "/task3";
//
//    }
//    @RequestMapping("/theme{id}/task4")
//    public String task4Session(@PathVariable(name = "id") Long id, Model model) {
//        model.addAttribute("themeid", id);
//        model.addAttribute("taskid", 4);
//        return "/theme" + id + "/task4";
//
//    }
//}

//------------------------------------------------//

//    @PostMapping("/theme{id}/task{taskId}")
//    public String handleAnswer(@PathVariable(name = "id") Long id,
//                               @PathVariable(name = "taskId") Long taskId,
//                               @RequestParam(name = "answer") String answer,
//                               HttpSession session) {
//
//        System.out.println(id);
//        System.out.println(taskId);
//        System.out.println(answer);
//
//        // Обрабатываем ответ пользователя
////        boolean isCorrect = checkAnswer(taskId, answer);
////
////        // Получаем текущий номер задания и увеличиваем его на 1
//        int nextTask = (int) (taskId + 1);
//
//        return "redirect:/theme" + id + "/task" + taskId;
//    }

//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditCarFrom(@PathVariable(name = "id") Long id){
//        ModelAndView mav = new ModelAndView("edit_car");
//        Car car = service.get(id);
//        mav.addObject("Car", car);
//        return mav;

// Маршрут для теории в теме 1
//    @RequestMapping("/theory_test")
//    public String theoryTest() {
//        return "/theory_test";
//    }

//    @RequestMapping("/delete/{id}")
//    public String deleteSession(@PathVariable(name = "id") Long id){
//        service.delete(id);
//        return "redirect:/";

//    }
//-------------------------------------------------//
