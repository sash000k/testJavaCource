package org.example;


public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        Box<Orange> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Orange());
        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("Вес первой коробки: "+box1.getWeight());
        System.out.println("Вес второй коробки: "+box2.getWeight());
        System.out.println("Вес третьей коробки: "+box3.getWeight());
        System.out.println("Коробка 1 равна коробке 2 по весу? "+box1.compare(box2));
        System.out.println("Коробка 2 равна коробке 3 по весу? "+box2.compare(box3));
        System.out.println("Пересыпаем все из коробки 3 в коробку 1");
        box1.changeBox(box3);
        System.out.println("Вес первой коробки: "+box1.getWeight());
        System.out.println("Вес третьей коробки: "+box3.getWeight());
    }
}