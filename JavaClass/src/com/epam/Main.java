package com.epam;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

/* a) список студеzнтов заданного факультета (15);*/
        Student[] student = Student.addStudents();
        System.out.println("Students faculty 15");
        int numberStudent=0;
        for (int i =0; i<student.length; i++){
            if (student[i].getFaculty() ==15){
                numberStudent++;
                System.out.println(numberStudent +". " + student[i].getName()+ " "+ student[i].getSurname());
            }
        }
/*  b) списки студентов для каждого факультета и курса;*/
        for (int faculty=13; faculty<16; faculty++){
            numberStudent = 0;
            System.out.println("students faculty number" + " " + faculty);
             for (int i =0; i<student.length; i++){
                 if (student[i].getFaculty() == faculty) {
                     numberStudent++;
                     System.out.println(numberStudent +". " + student[i].getName()+ " "+ student[i].getSurname());
                 }
             }
        }
        for (int course=1; course<6; course++){
            numberStudent = 0;
            System.out.println("students cours number" + " " + course);
            for (int i =0; i<student.length; i++){
                if (student[i].getCourse() == course) {
                    numberStudent++;
                    System.out.println(numberStudent +". " + student[i].getName()+ " "+ student[i].getSurname());
                }

            }
        }

/*  c) список студентов, родившихся после заданного года (1991);*/
        numberStudent=0;
        System.out.println("students born after 1991");
       for (int i =0; i<student.length; i++){
            if (student[i].getDateBith() % 10000 > 1991){
                numberStudent++;
                System.out.println(numberStudent +". " + student[i].getName()+ " "+ student[i].getSurname());
            }
        }
/*d) список учебной группы.*/
        numberStudent=0;
        System.out.println("students study gruop 113310");
        for (int i =0; i<student.length; i++){
            if (student[i].getGroup() == 113310){
                numberStudent++;
                System.out.println(numberStudent +". " + student[i].getName()+ " "+ student[i].getSurname());
            }
        }

    }

}
