package org.example.model;

public class Student {

    private long id;
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void print(){
        System.out.println("1: -> CREATE TABLE");
        System.out.println("2: -> SAVE STUDENT");
        System.out.println("3: -> DROP TABLE");
        System.out.println("4: -> FIND BY ID");
        System.out.println("5: -> DELETE BY ID");
        System.out.println("6: -> FIN ALL");
        System.out.println("7: -> UPDATE STUDENT");
        System.out.println("8: -> CLEAN TABLE");
    }
}
