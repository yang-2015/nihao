package com.atguigu.factory.factorymethod.pizzastore.order;



import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.BreakIterator;

public abstract class OrderPizza  {

    public abstract Pizza creatPizza(String orderType);

    public OrderPizza(){
        do {
            System.out.println("input pizza 种类：");
            String orderType = getOrderType();
            Pizza pizza = creatPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("制作披萨失败");
                break;
            }
        }while (true);
    }

    public String getOrderType(){
        try {
            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            String orderType = str.readLine();
            return orderType;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
