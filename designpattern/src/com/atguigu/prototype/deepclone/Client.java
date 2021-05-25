package com.atguigu.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType p= new DeepProtoType();
        p.name="宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");
////方式1
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//
//        System.out.println("p.name"+p.name +"p.deep().hashcode" + p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name"+p.name +"p2.deep().hashcode" + p2.deepCloneableTarget.hashCode());

        //方式二 通过序列化完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name"+p.name +"p.deep().hashcode" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name"+p.name +"p2.deep().hashcode" + p2.deepCloneableTarget.hashCode());
    }
}
