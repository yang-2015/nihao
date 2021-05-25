package com.atguigu.factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作胡椒披萨，准备原材料");
    }
}
