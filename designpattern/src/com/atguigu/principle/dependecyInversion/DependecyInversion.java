package com.atguigu.principle.dependecyInversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceive {
    public String getInfo();
}

class Email implements IReceive {
    public String getInfo() {
        return "电子邮件信息: Hello,world";
    }
}

//增加微信消息
class WeiXin implements IReceive {
    @Override
    public String getInfo() {
        return "微信消息：Hello,ok";
    }
}

class Person {
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());
    }
}
