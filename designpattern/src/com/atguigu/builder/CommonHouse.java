package com.atguigu.builder;

public class CommonHouse extends HouseBuilder {
    @Override
    protected void buildBase() {
        System.out.println("普通房子打地基50米");
        house.setBase("普通房子打地基50米");
    }

    @Override
    protected void buildWalls() {
        System.out.println("普通房子砌墙10厘米");
        house.setWall("普通房子砌墙10厘米");
    }

    @Override
    protected void roofed() {
        System.out.println("普通房子屋顶");
        house.setRoofed("普通房子屋顶");
    }
}
