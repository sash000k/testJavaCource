package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String duplicate(ArrayList<String> input){
        System.out.println("arr "+input);
        return "return";
    }
    public static void main(String[] args) {
        System.out.println("start");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("кот","машина",
                "динозавр","каша","велосипед","кот","пачка","отпуск","ноутбук","флешка",
                "динозавр","отдых","ноутбук","кот","бутылка"));
        System.out.println(duplicate(arrayList));
    }
}