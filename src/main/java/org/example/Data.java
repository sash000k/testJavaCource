package org.example;

import java.util.Arrays;

public class Data{
    public String path;
    public String name;
    public String format;
    public String[] header;
    public String[][] data = new String[0][0];
    int size = 1;
    public Data(String path, String name, String format){
        this.path = path;
        this.name = name;
        this.format = format;
    }
    public Data(String path, String name, String format, String[] header,String[][] data){
        this.path = path;
        this.name = name;
        this.format = format;
        this.header = header;
        this.data = data;
    }

    public String getFulPath(){
        return path+"/"+name+"."+format;
    }
    public String getFileName(){
        return name+"."+format;
    }
    public void setHeader(String[] data){
        this.header = data;
    }
    public void setData (String[] data){
        String[][] temp = new String[size][];
        if(this.data.length == 0){
            temp[0] = data;
        }else{
            temp=Arrays.copyOf(this.data,size);
            temp[size-1] = data;
        }
        this.data=temp;
        size++;
    }
    public void printData(){
        for (String[] datum : this.data) {
            System.out.println(Arrays.toString(datum));
        }
    }
    public String returnHeader(){
        return Arrays.toString(header);
    }
    public String getWritableContent(){
        StringBuilder newLine = new StringBuilder();
        for (int i = 0; i < this.header.length-1; i++){
            newLine.append(this.header[i]).append(";");
        }
        newLine.append(this.header[this.header.length-1]).append("\n");
        for (String[] datum : this.data) {
            for (int j = 0; j < datum.length - 1; j++) {
                newLine.append(datum[j]).append(";");
            }
            newLine.append(datum[datum.length - 1]).append("\n");
        }
        return newLine.toString();
    }
}
