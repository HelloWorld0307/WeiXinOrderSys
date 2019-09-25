package com.demo.DesignModel;

import com.demo.DesignModel.ExtraClasses.Car;

/**
 * 工厂方法模式：我们得到一个对象不是再通过一个工厂来获取，而是通过覆盖了（@Override这个标签）这个工厂抽象方法的子类来获取的
 */
public abstract class FactoryMethod {

    public Car sellCar(){
        return getCar();
    }

    public abstract Car getCar();
}
