package org.example;

public class Park {
    private String parkName;
    private String workTime;
    private Attraction[] attraction;
    public class Attraction {
        private String attrName;
        private int price;

        public Attraction(String attrName, int price){
            this.attrName = attrName;
            this.price = price;
        }
        public String getAttrInfo(){
            return "- "+attrName+"\n" +
                    "   Цена: "+price+"р.\n";
        }
    }
    public Park(String parkName, String workTime, int size){
        this.parkName = parkName;
        this.workTime = workTime;
        this.attraction = new Attraction[size];
    }
    public void addAttr(int id, String attrName, int price){
        this.attraction[id] = new Attraction(attrName,price);
    }
    public int getSize(){
        return attraction.length;
    }
    public String getParkInfo(){
        String result = "Парк \""+parkName+"\"\n" +
                "Часы работы: "+workTime+"\n" +
                "Аттракционы: \n";
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < getSize(); i++){
            temp.append("-"+attraction[i].getAttrInfo());
        }
        return result+temp;
    }
}
