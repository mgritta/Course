package com.Course.Controllers;

import com.Course.MyUser;
import com.Course.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Контроллер для работы с объектами MyUser.
 */
@Controller
public class UserController {
    /**

    *Сервис для работы с объектами MyUser.
    */
    @Autowired
    private MyUserService user_service;

    /**
     * Отображает страницу со списком всех MyUser.
     * @param model_user   модель для отображения данных в представлении
     * @param user_keyword строка, по которой осуществляется поиск пользователей
     * @return имя представления для отображения списка MyUser
     */
    @RequestMapping("/myuser")
    public String userIndex(Model model_user, @Param("user_keyword") String user_keyword) {
        List<MyUser> listMyUser = user_service.listAll(user_keyword);
        model_user.addAttribute("listMyUser", listMyUser);
        model_user.addAttribute("keyword", user_keyword);
        return "myuser";
    }

    @RequestMapping("/new_user")
    public String NewUser(Model model){
        MyUser myUser = new MyUser();
        model.addAttribute("myUser", myUser);
        System.out.println(1);
        return "new_user";

    }

    /**
     * Сохраняет объект MyUser в базу данных.
     * @param myUser объект MyUser для сохранения
     * @return перенаправляет на страницу списка MyUser
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveMyUser(@ModelAttribute("myUser") MyUser myUser) {
        user_service.save(myUser);
        return "redirect:/myuser";
    }

    /**
     * Отображает страницу для редактирования объекта MyUser.
     * @param id идентификатор объекта MyUser для редактирования
     * @return объект ModelAndView с представлением для редактирования MyUser
     */
    @RequestMapping("/edit_user/{id}")
    public ModelAndView showEditUser(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_user");
        MyUser myUser = user_service.get(id);
        mav.addObject("myUser", myUser);
        return mav;
    }

    /**
     * Удаляет объект MyUser из базы данных.
     * @param id идентификатор объекта MyUser для удаления
     * @return перенаправляет на страницу списка MyUser
     */
    @RequestMapping("/delete/{id}")
    public String deleteCar(@PathVariable(name = "id") Long id) {
        user_service.delete(id);
        return "redirect:/myuser";
    }
}
