package com.demo.DesignModel;

public class Test {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = Singleton.getInstance();
//        System.out.println(singleton == singleton1);


//        SingletonLazy singletonLazy = SingletonLazy.getInstance();
//        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
//        System.out.println(singletonLazy == singletonLazy1);

//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        try{
//            Thread.sleep(1000);
//        }catch (Exception e){
//
//        }
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
//        new Thread(new TestLazySingleton()).start();
        for(int i = 0; i < 100; i++) {
            new Thread(new TestLazySingleton()).start();
        }
    }

}

class TestLazySingleton implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建的对象为"
                + SingletonLazy.getInstance());
    }
}
