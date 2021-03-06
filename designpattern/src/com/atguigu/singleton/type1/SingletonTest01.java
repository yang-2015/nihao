package com.atguigu.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
// 单例模式 -- 饿汉  可能造成内存的浪费
class Singleton{
    private Singleton(){

    }
    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}