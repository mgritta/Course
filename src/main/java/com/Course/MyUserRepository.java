/**

 Интерфейс репозитория для работы с объектами класса MyUser в базе данных
 */
package com.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MyUserRepository extends JpaRepository<MyUser, Long>{
        /**
         * Поиск пользователей по ключевому слову
         * @param user_keyword - ключевое слово
         * @return список найденных пользователей
         */
        @Query("SELECT p FROM MyUser p WHERE CONCAT(p.ID, ' ', p.surname, ' ', p.age, ' ', p.email) LIKE %?1%")
        List<MyUser> search(String user_keyword);
}

