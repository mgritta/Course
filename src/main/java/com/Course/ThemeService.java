package com.Course;

import com.Course.Theme;
import com.Course.ThemeRepository;
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
     *
     * @param keyword строка поискового запроса для фильтрации списка тем
     * @return список всех тем, если keyword = null, и список отфильтрованных тем, если keyword != null
     */
    public List<Theme> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }
}
