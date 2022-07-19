package Revision;

public class Student{
    // instance variables
    int id;
    String name;
    int age;
    boolean paid;
    int year;

    // constructor
    Student(int id_num, String name, int age, int year){
        id = id_num;
        this.name = name;
        this.age = age;
        paid = false;
        this.year = year;
    }

    void paying(){
        paid = true;
    }

    void changeName(String newName){
        this.name = newName;
    }

    int numYearsLeft(){
        return 4 - year;
    }

    static int sum(int a, int b){
        return a + b ;
    }

}
