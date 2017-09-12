package com.spring;

/**
 * Created by NalinBakshi on 9/12/2017.
 */
public class Employee {
    private int empId;
    private String name;
    private int age;
    private String address;

    public Employee(){}
    public Employee(int empId, String name, int age, String address) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
