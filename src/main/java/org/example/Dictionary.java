package org.example;

import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> hm = new HashMap<>();
    public Dictionary(HashMap<String, String> input){
        this.hm = input;
    }
    public void add(String fio, String number){
        this.hm.put(fio,number);
    }
    public String get(String fio){
        return this.hm.get(fio);
    }
}
