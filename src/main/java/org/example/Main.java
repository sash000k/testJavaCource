package org.example;

public class Main {
    public static int Calculation(String[][] data) throws MyArrayDataException,MyArraySizeException{
        int sum=0;
        for(String[] row: data){
            if(row.length!=4){throw new MyArraySizeException("некорректный размер по X: "+row.length);}
            if(data.length!=4){throw new MyArraySizeException("некорректный размер по Y: "+data.length);}
        }
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                try{
                    sum += Integer.parseInt(data[i][j]);
                }
                catch(NumberFormatException e){
                    throw new MyArrayDataException("символ \""+data[i][j]+"\" (["+i+"]["+j+"]) " +
                            "не может быть преобразован в int");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] data =  new String[][]{
                {"123", "222", "333", "452"},
                {"123", "222", "22", "452"},
                {"123", "222", "Q", "452"},
                {"123", "222", "333", "452"}
        };
        try{
            System.out.println(Calculation(data));
        }catch (MyArraySizeException| MyArrayDataException e) {
            System.out.println("что-то пошло не так: " +e.getMessage());
        }
    }
}