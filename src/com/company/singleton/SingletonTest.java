package com.company.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        // 判断 singleton1 与 singleton2 内存地址是否相同
        System.out.println(singleton1 == singleton2);
    }
}

//class Singleton {
//    // private 修饰符, 只能在类内使用, 防止了类外部通过 new 调用生成对象
//    private Singleton() {
//
//    }
//
//    // getSingleton() 是静态的, 静态的只能访问静态的
//    private static Singleton singleton = new Singleton();
//
//    // 因为构造方法是 private 的, 无法在类外生成对象, 但是需要调用 getSingleton(), 通过类名调用
//    public static Singleton getSingleton() {
//        return singleton;
//    }
//}

class Singleton {
    private Singleton() {

    }

    private static Singleton singleton;

    public static Singleton getSingleton() {
        // 如果 singleton 为 null 生成 Singleton 对象, 如果已经生成返回已经生成的
        // 可能线程不安全 ?
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}