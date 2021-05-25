package com.atguigu.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("制作北京胡椒披萨，准备原材料");
    }
}
