package com.epam;
import java.util.Arrays;
public class Student {
    /*Определить конструкторы и методы setТип(), getТип(), toString().*/

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int dateBith;
    private String address;
    private String phoneNumber;
    private int faculty;
    private int course;
    private int group;


    public Student(int id, String surname, String name, String patronymic, int dateBith,
                   String address, String phoneNumber, int faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBith = dateBith;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDateBith() {
        return dateBith;
    }

    public void setDateBith(int dateBith) {
        this.dateBith = dateBith;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateBith='" + dateBith + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty=" + faculty +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }



    /*1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.*/
    public static Student[] addStudents() {
        Student[] student = new Student[6];

    student[0] = new Student(1, "Ivanov", "Ivan", "Ivanovich", 25_08_1990, "Saksaganskogo str, 31", "375295546752", 15, 5,115210);
    student[1] = new Student(2, "Petrov", "Petr", "Petrovich", 25_05_1991, "Saksaganskogo str, 31", "375295546753", 14, 4,115210);
    student[2] = new Student(3, "Sidorov", "Vasia", "Ivanovich", 21_04_1992, "Saksaganskogo str, 31", "375295546754", 13, 3,113310);
    student[3] = new Student(4, "Kozlov", "Sasha", "Ivanovich", 25_03_1992, "Saksaganskogo str, 31", "375295546754", 15, 3,115312);
    student[4] = new Student(5, "Baranov", "Ilia", "Ivanovich", 25_05_1995, "Saksaganskogo str, 31", "375295546754", 14, 1,114310);
    student[5] = new Student(6, "Rakov", "Kolia", "Ivanovich", 11_02_1994, "Saksaganskogo str, 31", "375295546754", 13, 3,113310);
        return student;
}
}
