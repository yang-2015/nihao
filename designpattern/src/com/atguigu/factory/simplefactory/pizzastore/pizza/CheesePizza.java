package com.atguigu.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨，装备材料");
    }
}
