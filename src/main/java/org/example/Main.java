package org.example;


public class Main {

    public static void printThreeWords(){
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println(a + "\n" + b + "\n" + c);
    }
    public static void checkSumSign(){
        int a = 12;
        int b = -4;
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
    public static void printColor(){
        int color = 55;
        switch ((color <= 0) ? 0 :
                (0 < color && color <= 100) ? 1 : 2) {
            case 0:
                System.out.println("Красный");
                break;
            case 1:
                System.out.println("Желтый");
                break;
            case 2:{
                System.out.println("Зеленый");
                break;
            }
            default:
                System.out.println("error");
        }
    }
    public static void compareNumbers(){
        int a = 5;
        int b = 4;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
    public static void main(String[] args) {
        System.out.println("========== task 1 ==========");
        printThreeWords();
        System.out.println("========== task 2 ==========");
        checkSumSign();
        System.out.println("========== task 3 ==========");
        printColor();
        System.out.println("========== task 4 ==========");
        compareNumbers();
    }
}