package com.Course;

import jakarta.persistence.*;

/**

 Класс MyUser представляет объект пользователя, содержащий ID, возраст, фамилию и email.
 */
@Entity
@Table(name = "myuser", schema = "warehouse")
public class MyUser {

    /**

     Поле ID является первичным ключом таблицы myuser в базе данных.
     */
    private Long ID;
    /**

     Поле age хранит возраст пользователя.
     */
    private int age;
    /**

     Поле surname хранит фамилию пользователя.
     */
    private String surname;
    /**

     Поле email хранит адрес электронной почты пользователя.
     */
    private String email;
    /**

     Конструктор без параметров для создания объекта MyUser.
     *

    /**

     Геттер для поля ID.
     @return ID пользователя.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID() {
        return ID;
    }
    /**

     Сеттер для поля ID.
     @param ID ID пользователя.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }
    /**

     Геттер для поля surname.
     @return Фамилию пользователя.
     */
    public String getSurname() {
        return surname;
    }
    /**

     Сеттер для поля surname.
     @param surname Фамилия пользователя.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**

     Геттер для поля age.
     @return Возраст пользователя.
     */
    public int getAge() {
        return age;
    }
    /**

     Сеттер для поля age.
     @param age Возраст пользователя.
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**

     Геттер для поля email.
     @return Адрес электронной почты пользователя.
     */
    public String getEmail() {
        return email;
    }
    /**

     Сеттер для поля email.
     @param email Адрес электронной почты пользователя.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
