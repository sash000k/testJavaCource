package org.example;

public class Box extends Figures implements Formules{
    private int side1;
    private int side2;
    public Box(String form, int side1,int side2){
        super(form);
        this.side1 = side1;
        this.side2 = side2;
    }
    public double mathSquare(){
        return (side1*side2);
    }
    public double mathPerimetr(){
        return 2*(side1 + side2);
    }
}
