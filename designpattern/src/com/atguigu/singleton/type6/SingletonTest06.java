package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检索，线程安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;//volatile 保证可见新 禁止指令重排
    private Singleton(){}
    public static Singleton getInstance(){ //懒汉式 双端检索线程安全
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
