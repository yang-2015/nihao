package com.atguigu.builder;

public class HighBuilding extends HouseBuilder {
    House house = new House();

    @Override
    protected void buildBase() {
        System.out.println("高楼打地基100米");
    }

    @Override
    protected void buildWalls() {
        System.out.println("高楼砌墙20厘米");
    }

    @Override
    protected void roofed() {
        System.out.println("高楼透明屋顶");
    }

    public House creatHouse(){
        return house;
    }
}
