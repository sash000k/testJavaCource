package org.example;

public class Cat extends Animals{
    static int catCounter = 0;
    public boolean hangry;
    public int capacity;
    public Cat(String name){
        super(name);
        catCounter++;
        this.hangry=false;
        this.capacity = 4;
    }
    public Cat(String name, int capacity){
        super(name);
        catCounter++;
        this.hangry=false;
        this.capacity = capacity;
    }
    public void run(int size){
        if(size >200){
            System.out.println("не могу бежать больше 200 метров");}
        else {
            System.out.println(name+" Пробежал "+size+"м.");
        }
    }
    public void swim(int size){
        System.out.println("плыву как топор, только вниз!");
    }
    public void getCatCount(){
        System.out.println("всего котов: "+catCounter);
    }
    public void eat(){
        System.out.println(name+" поел!");
        this.hangry = true;
    }
    public boolean checkHangry(){
        return hangry;
    }
    public void returnHangry(){
        if(!hangry){
            System.out.println(name+" голоден ("+getCapacity()+"гр.)");
        }
        else{
            System.out.println(name+ " сыт");
        }
    }
    public int getCapacity(){
        return capacity;
    }
}
