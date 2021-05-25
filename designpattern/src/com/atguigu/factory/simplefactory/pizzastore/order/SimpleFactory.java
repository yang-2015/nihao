package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.sql.SQLOutput;

public class SimpleFactory {
    public Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new GreekPizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
