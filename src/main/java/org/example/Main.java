package org.example;

import java.util.*;

public class Main {
    public static String wordProcessor(ArrayList<String> input){
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String s : input) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        Set<String> unique = hashMap.keySet();
        StringBuilder duplicates= new StringBuilder();
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            duplicates.append(entry.getKey()).append(" - ").append(entry.getValue()).append(" раз\n");
        }
        return "Уникальные слова: "+unique+"\n" +
                "Повторяющиеся слова: " + duplicates;
    }
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println("--------1----------");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("кот","машина",
                "динозавр","каша","велосипед","кот","пачка","отпуск","ноутбук","флешка",
                "динозавр","отдых","ноутбук","кот","бутылка"));
        System.out.println(wordProcessor(arrayList));
        System.out.println("--------2-----------");
        Dictionary dict = new Dictionary();
        dict.add("Иванов","+375259379992");
        dict.add("Петров","+375295553535");
        dict.add("Сидоров","+375331112233");
        dict.add("Петров","+375292233445");
        dict.add("Иванов","+375448877665");
        dict.add("Петров","+375332245566");
        System.out.println(dict.get("Иванов"));
    }
}