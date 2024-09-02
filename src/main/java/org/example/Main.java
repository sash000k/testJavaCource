package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("================= 1 =================");
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Роман петрович Тест","Работник",
                "testR@test.test","+375 (33) 937-99-92",3700,17);
        empArr[1] = new Employee("Тест 1 Тест","Сотрудник",
                "test1@test.test","+375 (25) 555-35-35",700,57);
        empArr[2] = new Employee("Тест 2 Тест","Коллега",
                "test2@test.test","+375 (29) 666-66-66",2400,99);
        empArr[3] = new Employee("Тест 3 Тест","Трудяга",
                "test3@test.test","+375 (25) 333-99-66",1500,37);
        empArr[4] = new Employee("Тест 4 Тест","Офисный Планктон",
                "test4@test.test","+375 (014) 37-37-37",950,40);

        System.out.println("================= 2 =================");
        for(int i = 0; i < 5; i++){
            if(empArr[i].getAge() > 40){
                System.out.println(empArr[i].getInfo() + "-------------------\n");
            }
        }

        System.out.println("================= 3 =================");
        Park park = new Park("Лунапарк", "08.00 - 21.00", 3);
        park.addAttr(0,"Супер 8", 500);
        park.addAttr(1,"Хали Гали",350);
        park.addAttr(2,"Пара Трупер",1000);
        System.out.println(park.getParkInfo());
        //for(int i = 0; i < park.getSize(); i++){
            //System.out.println(attr[i].getAttrInfo());
        //}
        //System.out.println(attr[0].getAttrInfo());
    }
}