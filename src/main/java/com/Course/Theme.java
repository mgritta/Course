package com.Course;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

/**
 */
@Entity
@Table(name="theme", schema="warehouse")
public class Theme {

    /**
     Уникальный идентификатор темы.
     */
    private Long ID;
    /**

     Тип темы.
     */
    private String type;
    /**

     Количество заданий в теме.
     */
    private int tasks;
    /**

     Создает новый объект класса Theme.
     */
    protected Theme(){
    }
    /**

     Получает уникальный идентификатор темы.
     @return уникальный идентификатор темы
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID() {
        return ID;
    }
    /**

     Устанавливает уникальный идентификатор темы.
     @param ID уникальный идентификатор темы
     */
    public void setID(Long ID) {
        this.ID = ID;
    }
    /**

     Получает тип темы.
     @return тип темы
     */
    public String getType() {
        return type;
    }
    /**

     Устанавливает тип темы.
     @param type тип темы
     */
    public void setType(String type) {
        this.type = type;
    }
    /**

     Получает количество заданий в теме.
     @return количество заданий в теме
     */
    public int getTasks() {
        return tasks;
    }
    /**

     Устанавливает количество заданий в теме.
     @param tasks количество заданий в теме
     */
    public void setTasks(int tasks) {
        this.tasks = tasks;
    }

}

