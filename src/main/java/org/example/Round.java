package org.example;

public class Round extends Figures implements Formules{
    private double rad;
    public Round(String form,double rad){
        super(form);
        this.rad = rad;
    }
    public double mathSquare(){
        return Math.PI*(rad*rad);
    }
    public double mathPerimetr(){
        return 2*Math.PI*rad;
    }

}
