package com.atguigu.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类，线程安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
//静态内部类完成，推荐使用
class Singleton{
    private static volatile Singleton instance;
    private Singleton(){}
    private static class SingletonInstance {//jvm底层实现类加载的时候是线程安全的
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){ //懒汉式 双端检索线程安全
            return SingletonInstance.INSTANCE;
        }

}
