package com.atguigu.singleton.type8;



public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.say();
    }
}

enum Singleton {
    INSTANCE;
    public void say(){
        System.out.println("ok```");
    }
}


