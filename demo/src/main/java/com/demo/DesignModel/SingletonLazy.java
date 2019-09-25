package com.demo.DesignModel;

/**
 * 静态方法懒汉模式，所谓懒汉是在类加载到jvm中的时候不创建一个实例，而是在使用到的时候创建，所以懒汉模式会有线程安全问题
 */
public class SingletonLazy {
    //懒汉模式构造方法要为私有的，不允许外部私自创建实例
    private SingletonLazy() {}

    private static SingletonLazy singletonLazy = null;

    public static  SingletonLazy getInstance() {
        //虽然使用了synchronized关键字保证了不会创建多个实例，但是在某一些情况下还是会有可能创建多个实例，所以使用两次判断
        if(singletonLazy == null){
            synchronized(SingletonLazy.class){
                if(singletonLazy == null)
                    singletonLazy = new SingletonLazy();
            }
        }
        return singletonLazy;
    }
}
