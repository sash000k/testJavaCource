package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("=========== чтение ===========");
        Data data = new Data("src/main/resources/csv","123","csv");
        File file1 = new File(data.getFulPath());

        BufferedReader reader = new BufferedReader(new FileReader(file1));

        String[] headerLine = reader.readLine().split(";");
        data.setHeader(headerLine);

        String line;

        while((line = reader.readLine()) != null){
            String[] splittedLine = line.split(";");
            data.setData(splittedLine);
        }
        reader.close();
        System.out.println("headers: ");
        System.out.println(data.returnHeader());
        System.out.println("data: ");
        data.printData();
        System.out.println("=========== запись ===========");
        Data data2 = new Data("src/main/resources/csv",
                "1233",
                "csv",
                new String[]{"wow", "qwe", "34e"},
                new String[][]{{"123", "222", "333"},{"sad", "wqe", "rtu"},{"wqe4", "wq3", "3f5"},{"222", "222", "222"}});
        System.out.println(data2.returnHeader());
        data2.printData();
        File file2 = new File(data2.getFulPath());
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        writer.write(data2.getWritableContent());
        System.out.println("Запись произведена в файл: "+file2);
        writer.close();
    }
}