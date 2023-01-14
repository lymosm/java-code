package com.test.demo1;

public class Teacher {

    String name = "Zhon Noi";
    int age = 23;

    public Teacher(){

    }

    public int getUser(int id){
        return id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
