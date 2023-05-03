package com.Course;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

/**
 */
@Entity
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

     Количество выполненных заданий.
     */
    private int percentage;
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
    /**

     Получает процент выполнения темы.
     @return процент выполнения темы
     */
    public int getPercentage() {
        return percentage;
    }
    /**

     Устанавливает процент выполнения темы.
     @param percentage процент выполнения темы
     */
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}



//------------------------------------------------//
//@Entity
//public class Theme {
//    private Long ID;
//    private String type;
//    private int tasks;
//    private int percentage;
//
//    protected Theme(){
//
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Long getID() {
//        return ID;
//    }
//
//    public void setID(Long ID) {
//        this.ID = ID;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(int tasks) {
//        this.tasks = tasks;
//    }
//
//    public int getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(int percentage) {
//        this.percentage = percentage;
//    }
//
