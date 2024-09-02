package org.example;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee(String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String getFio(){
        return fio;
    }
    public String getPosition(){
        return position;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public String getInfo(){
        return "Сотрудник: "+getFio()+";\n" +
                "Должность: "+getPosition()+";\n" +
                "Почта: "+getEmail()+";\n" +
                "Телефон: "+getPhone()+";\n" +
                "Зарплата: "+getSalary()+";\n" +
                "Возраст: "+getAge()+";\n";
    }
}
