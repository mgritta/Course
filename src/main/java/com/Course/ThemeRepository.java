package com.Course;

import com.Course.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**

 Репозиторий для доступа к данным сущности Theme.

 Использует Spring Data JPA для реализации CRUD-операций.
 */
public interface ThemeRepository extends JpaRepository<Theme, Long> {

    /**
     Поиск тем по заданным ключевым словам.
     Использует JPQL запрос для поиска в полях type, tasks и percentage.
     @param keyword ключевые слова для поиска.
     @return список найденных тем, удовлетворяющих запросу.
     */
    @Query("SELECT p FROM Theme p WHERE CONCAT(p.type, ' ', p.tasks) LIKE %?1%")
    List<Theme> search(String keyword);
}
