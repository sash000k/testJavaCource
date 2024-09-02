package org.example;

public class Triangle extends Figures implements Formules{
    private int side1;
    private int side2;
    private int side3;
    public Triangle(String form, int side1,int side2, int side3){
       super(form);
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
    }
    public double mathSquare(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
    }
    public double mathPerimetr(){
        return side1 + side2 + side3;
    }
}
