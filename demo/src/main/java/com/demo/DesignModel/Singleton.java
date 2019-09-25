package com.demo.DesignModel;

/**
 * 此例子为单例模式中的饿汉模式，何为饿汉模式：就是吃饱不饱，所以需要在所属的类一加载到jvm中就创建一个实例，
 * 所以饿汉模式是线程安全的
 */
public class Singleton {
    // 创建一个构造函数
    private Singleton(){}

    //声明一个唯一的实例，使用private static修饰
    private static Singleton singleton = new Singleton();

    //提供一个公共的静态方法调用此静态实例
    public  static  Singleton getInstance(){
        return singleton;
    }
}
