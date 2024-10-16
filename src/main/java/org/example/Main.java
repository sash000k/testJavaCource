package org.example;


import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void randomNumbers(int size){
        int[] num = new int[size];
        for(int i = 0; i < size; i++){
            num[i]= (int) Math.round((Math.random()*100)-50);
        }
        System.out.println("Исходный набор: "+Arrays.toString(num));
        long count = IntStream.of(num).filter(n-> n%2==0).count();
        System.out.println("Четных: "+count+" штук");
    }
    public static void wordCounter(ArrayList<String> list){
        System.out.println("исходный список: "+list);
        long count = list.stream().filter(s -> s.equals("High")).count();
        System.out.println("\"High\" встречается в исходном списке "+count+" раз");
    }
    public static void firstElement(ArrayList<String> list){
        System.out.println("исходный список: "+list);
        String first = list.stream().findFirst().orElse("0");
        System.out.println("Первый элемент исходного списка: "+ first);
    }
    public static void lastElement(ArrayList<String> list){
        System.out.println("исходный список: "+list);
        String last = list.stream().reduce((s1,s2)->s2).orElse("0");
        System.out.println("Последний элемент исходного списка: "+ last);
    }
    public static void sortArray(ArrayList<String> list){
        System.out.println("исходный список: "+list);
        String[] arr = list.stream().sorted(Comparator
                .comparingInt(s-> Integer.parseInt(s.substring(1))))
                .toArray(String[]::new);
        System.out.println("сортированный список: "+ Arrays.toString(arr));
    }

    public static void login() {
        ArrayList<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String login;
        System.out.println("введите логин: \n");
        while(true){
            login = scanner.nextLine();
            if(login.isEmpty()){
                break;
            }
            logins.add(login);
        }
        System.out.println("Исходный список логинов: "+logins);
        System.out.println("Логины начинающиеся на букву 'f': "+Arrays.toString(logins.stream().filter(s -> s.charAt(0)=='f').toArray()));
    }
    public static void main(String[] args) {
        System.out.println("-------1-------");
        randomNumbers(7);
        System.out.println("-------2-------");
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Highload","High","Load","Highload","wow"));
        ArrayList<String> empty = new ArrayList<>();
        System.out.println("-------2.1-------");
        wordCounter(arrayList2);
        System.out.println("-------2.2-------");
        firstElement(arrayList2);
        System.out.println("-------2.3-------");
        lastElement(arrayList2);
        System.out.println("-------3-------");
        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList("f10", "f15", "f2", "f4", "f4"));
        sortArray(arrayList3);
        System.out.println("-------4-------");
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
        new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        System.out.println("-------4.1-------");
        System.out.println("Все студенты: "+students+"\n");
        System.out.printf("Средний возраст мужчин: %s лет%n", students
                .stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0));
        System.out.println("-------4.2-------");
        System.out.println("Все студенты: "+students+"\n");
        System.out.println("Повестку получат: "+ Arrays.toString(students
                .stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .filter(s -> s.getAge() <= 27 && s.getAge() >= 18).toArray()));
        System.out.println("-------5-------");
        login();
    }
}