package org.example;


public class Main {
    public static void main(String[] args) {
        Cat Julius = new Cat("Юлик");
        Dog Druzhok = new Dog("Дружок");
        Julius.run(150);
        Druzhok.swim(30);
        Druzhok.getDogCount();
        Julius.getCatCount();
        Julius.getCount();
        Druzhok.getCount();
        Plate plt = new Plate(20);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 7);
        cats[1] = new Cat("Мурка", 3);
        cats[2] = new Cat("Черныш");
        cats[3] = new Cat("Вася", 10);
        cats[4] = new Cat("Матроскин", 5);
        for(int i = 0; i < 5; i++){
            if(!cats[i].checkHangry()){
                if(plt.getVolume()<cats[i].getCapacity()){
                    System.out.println("мало еды для "+cats[i].name);}
                else{
                    plt.decrease(cats[i].getCapacity());
                    cats[i].eat();
                }
            } else {
                System.out.println(cats[i].name+" сыт!");
            }
        }
        System.out.println("======================== сытость котов ========================");
        for (int i = 0; i < 5; i++){
            cats[i].returnHangry();
        }
        System.out.println("Осталось еды "+plt.getVolume());

        System.out.println("======================== Фигуры ========================");
        Round fig1 = new Round("круг",3);
        Box fig2 = new Box("Квадрат",3,4);
        Triangle fig3 = new Triangle("Треугольник",3,4,5);
        fig1.perimetr = fig1.mathPerimetr();
        fig1.square = fig1.mathSquare();
        fig1.setBorder(3);
        fig1.setColor("black");
        fig2.perimetr = fig2.mathPerimetr();
        fig2.square = fig2.mathSquare();
        fig3.perimetr = fig3.mathPerimetr();
        fig3.square = fig3.mathSquare();
        System.out.println(fig1.getInfo()+"\n-------------");
        System.out.println(fig2.getInfo()+"\n-------------");
        System.out.println(fig3.getInfo()+"\n-------------");
    }
}