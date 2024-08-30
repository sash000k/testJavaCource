package org.example;


import java.util.Arrays;

public class Main {
    public static boolean checker1(int a, int b){
        return (10 <= (a + b) && (a + b) <=20);
    }
    public static String checker2(int a){
        return (a >= 0) ? "Положительное" : "Отрицательное";
    }
    public static boolean checker3(int a){
        return !(a >= 0);
    }
    public static void checker4(String s, int a){
        for (int i=0;i<a;i++){
            System.out.println(s);
        }
    }
    public static boolean checker5(int a){
        return ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));
    }
    public static void checker6(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i]=(a[i]==0)?1:0;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void checker7(){
        int[] a = new int[100];
        for(int i = 0; i < a.length; i++){
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void checker8(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i]=(a[i]<6)?a[i]*2:a[i];
        }
        System.out.println(Arrays.toString(a));
    }
    public static void checker9(int a){
        int[][] mas = new int[a][a];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if (i==j || j==(a-i)-1){
                    mas[i][j] = 1;
                }
            }
        }
        for(int[] b : mas){
            System.out.println(Arrays.toString(b));
        }
    }
    public static int[] checker10(int len, int initialValue){
        int[] mas = new int [len];
        Arrays.fill(mas, initialValue);
        return mas;
    }
    public static void main(String[] args) {
        System.out.println("1) " + checker1(3,2));
        System.out.println("2) " + checker2(2));
        System.out.println("3) " + checker3(5));
        System.out.println("4)"); checker4("Hello world", 5);
        System.out.println("5) " + checker5(804));
        int[] a = {1,1,0,0,1,0,1,1,0,0};
        System.out.println("6) "); checker6(a);
        System.out.println("7) "); checker7();
        int[] b = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println("8) "); checker8(b);
        System.out.println("9) "); checker9(10);
        System.out.println("10) " + Arrays.toString(checker10(7,25)));
    }
}