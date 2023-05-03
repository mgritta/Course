package com.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис для работы с объектами тем вопросов.
 */
@Service
public class ThemeService {
    @Autowired
    private ThemeRepository repo;

    /**
     * Возвращает список всех тем вопросов.
     * @param keyword строка поискового запроса для фильтрации списка тем
     * @return список всех тем, если keyword = null, и список отфильтрованных тем, если keyword != null
     */
    public List<Theme> listAll(String keyword){
        if (keyword != null){
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    /**
     * Сохраняет тему вопроса.
     * @param theme объект темы вопроса
     */
    public void save(Theme theme){
        repo.save(theme);
    }

    /**
     * Возвращает тему вопроса по её ID.
     * @param id ID темы вопроса
     * @return объект темы вопроса
     */
    public Theme get(Long id){
        return repo.findById(id).get();
    }

    /**
     * Удаляет тему вопроса по её ID.
     * @param id ID темы вопроса
     */
    public void delete(Long id){
        repo.deleteById(id);
    }
}


//--------------------------------------------//
//@Service
//public class ThemeService {
//    @Autowired
//    private ThemeRepository repo;
//
//    public List<Theme> listAll(String keyword){
//        if (keyword != null){
//            return repo.search(keyword);
//        }
//        return repo.findAll();
//    }
//
//    public void save(Theme theme){
//        repo.save(theme);
//    }
//
//    public Theme get(Long id){
//        return repo.findById(id).get();
//    }
//
//    public void delete(Long id){
//        repo.deleteById(id);
//    }
//}