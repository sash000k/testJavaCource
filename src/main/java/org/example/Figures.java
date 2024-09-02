package org.example;

public class Figures {
    private String form;
    public double border = 1;
    public String color = "red";
    public double perimetr = 0;
    public double square = 0;
    public Figures(String form){
        this.form=form;
    }
    public void setBorder(double border){
        this.border=border;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getInfo(){
        return form+"\n" +
                "периметр = "+perimetr+"\n" +
                "площадь = "+square+"\n" +
                border+"px ("+color+")";
    }
}
