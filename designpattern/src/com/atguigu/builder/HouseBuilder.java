package com.atguigu.builder;

public abstract class HouseBuilder {
    House house = new House();

    protected abstract void buildBase();
    protected abstract void buildWalls();
    protected abstract void roofed();

    public House creatHouse(){
        return house;
    }
}
