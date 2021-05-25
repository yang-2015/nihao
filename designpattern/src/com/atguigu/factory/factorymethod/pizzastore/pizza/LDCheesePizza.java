package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("制作伦敦奶酪披萨，准备原材料");
    }
}
