package com.atguigu.builder;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        House house = houseBuilder.creatHouse();
        return house;
    }
}
