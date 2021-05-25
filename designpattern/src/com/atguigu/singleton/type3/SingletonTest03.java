package com.atguigu.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){ //懒汉式 线程不安全
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
