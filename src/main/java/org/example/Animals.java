package org.example;

public class Animals {
    public String name;
    static int counter = 0;
    public Animals(String name){
        this.name=name;
        counter++;
    }
    public String animalInfo(){
        return name;
    }
    public void run(int size){
    }
    public void swim(int size){
    }
    public void getCount(){
        System.out.println("всего животных: "+counter);
    }
}
