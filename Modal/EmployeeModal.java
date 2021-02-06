package com.java.modal;

public class EmployeeModal {
    int id;
    int salary;
    String name;
    int age;

    public EmployeeModal(int id, int salary, String name, int age) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.age = age;
    }
    public EmployeeModal(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "EmployeeModal{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}