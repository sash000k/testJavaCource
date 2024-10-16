package org.example;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    public Box(){
        this.fruits = new ArrayList<>();
    }
    public void add(T fruit){
        fruits.add(fruit);
    }
    public double getWeight(){
        double result = 0.0;
        if(!fruits.isEmpty()){
            result = fruits.size()* fruits.get(0).getWeight();
        }
        return result;
    }
    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }
    public void changeBox(Box<T> box){
        if (this == box){
            System.out.println("ты уже и так в этой коробке");
        }
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
    }
}
