/**

 Сервис для работы с сущностью MyUser. Содержит методы для получения списка всех MyUser, поиска по ключевому слову,
 сохранения, удаления и получения конкретного MyUser по его ID.
 */
package com.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserService {
    @Autowired
    private MyUserRepository rep;

    /**
     * Получает список всех MyUser, если keyword_u == null, иначе выполняет поиск по ключевому слову.
     * @param keyword_u ключевое слово для поиска
     * @return список всех MyUser, если keyword_u == null, иначе список найденных MyUser
     */
    public List<MyUser> listAll(String keyword_u) {
        if (keyword_u != null) {
            return rep.search(keyword_u);
        }
        return rep.findAll();
    }

    /**
     * Сохраняет объект MyUser.
     * @param myUser объект MyUser, который необходимо сохранить
     */
    public void save(MyUser myUser) {
        rep.save(myUser);
    }

    /**
     * Получает объект MyUser по его ID.
     * @param id ID искомого объекта MyUser
     * @return объект MyUser с указанным ID
     */
    public MyUser get(Long id){
        return rep.findById(id).get();
    }

    /**
     * Удаляет объект MyUser по его ID.
     * @param id ID удаляемого объекта MyUser
     */
    public void delete(Long id){
        rep.deleteById(id);
    }
}
