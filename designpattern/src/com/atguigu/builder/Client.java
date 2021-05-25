package com.atguigu.builder;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house);
        System.out.println("```````````````");
        HighBuilding highBuilding = new HighBuilding();
        HouseDirector houseDirector1 = new HouseDirector(highBuilding);
        House house1 = houseDirector1.constructHouse();
        System.out.println(house1);
    }
}
