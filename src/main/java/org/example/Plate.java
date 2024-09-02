package org.example;

public class Plate {
    static int volume;
    public Plate(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void decrease(int size){
        if(size>getVolume()){
            System.out.println("мало еды");
        } else {this.volume -= size;}
    }
    public void increase(int size){
        this.volume += size;
    }
}
