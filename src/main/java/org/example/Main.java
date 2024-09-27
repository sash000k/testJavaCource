package org.example;

public class Main {
    public static void Calculation(String[][] data){
        int[][] temp = new int[4][4];
        int lenX = data.length;
        int lenY = data[0].length;
        if(temp.length<data.length){
            lenX = data.length;
        } else {lenX = temp.length;}
        try{
            for (int x = 0; x < lenX; x++){
                if(temp[x].length<data[x].length){
                    lenY = data[x].length;
                } else {lenY = temp[x].length;}
            }
            for (int i = 0; i < lenX; i++) {
                for (int j = 0; j < lenY; j++){
                    try{temp[i][j] = Integer.parseInt(data[i][j]);}
                    catch(NumberFormatException e){
                        System.out.println("В ячейке ["+i+"]["+j+"] находится символ, который нельзя преобразовать в int");
                        //e.printStackTrace();
                    }
                }
            }
            System.out.println("done");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Неверный размер массива ["+lenX+"]["+lenY+"]");
            //e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[][] data =  new String[][]{{"123", "222", "333", "452"},{"123", "222", "q", "452"},{"123", "222", "333", "452"},{"123", "222", "333", "452"}};
        Calculation(data);
    }
}