package org.example;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    HashMap<String, String> dictionary = new HashMap<>();
    public void add(String fio, String number){
        this.dictionary.put(number,fio);
    }
    public String get(String fio){
        StringBuilder result = new StringBuilder("По фамилии " + fio + " найдено:");
        for(Map.Entry<String, String> entry : dictionary.entrySet()){
            if(entry.getValue().equals(fio)){
                result.append("\n").append(entry.getKey());
            }
        }
        return result.toString();
    }
}
