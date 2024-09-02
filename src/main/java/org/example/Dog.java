package org.example;

public class Dog extends Animals{
    static int dogCounter = 0;
    public Dog (String name){
        super(name);
        dogCounter++;
    }
    public void run(int size){
        if(size >500){
            System.out.println("не могу бежать больше 500 метров");}
        else {
            System.out.println(name+" Пробежал "+size+"м.");
        }
    }
    public void swim(int size){
        if(size >10){
            System.out.println("не могу плыть больше 10 метров");}
        else {
            System.out.println("Собака "+name+" Проплыл "+size+"м.");
        }
    }
    public void getDogCount(){
        System.out.println("всего собак: "+dogCounter);
    }
}
