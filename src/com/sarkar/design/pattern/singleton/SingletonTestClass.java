package com.sarkar.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTestClass {

    public static void main(String[] args) throws Exception {
        //Singleton s1 = Singleton.getInstance();
        //Singleton s2 = Singleton.getInstance();

        SingletonEnum s1 = SingletonEnum.INSTANCE;
        SingletonEnum s2 = SingletonEnum.INSTANCE;

        print("s1", s1);
        print("s2", s2);

        /*
        //Reflection
        Class clazz = Class.forName("com.sarkar.design.pattern.singleton.Singleton");
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s3 = constructor.newInstance();
        print("s3", s3);

        //Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/sarkar/design/pattern/singleton/s2.ser"));
        oos.writeObject(s2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/sarkar/design/pattern/singleton/s2.ser"));
        Singleton s4 = (Singleton) ois.readObject();
        print("s4", s4);

        // Cloning
        //Singleton s5 = (Singleton) s2.clone();
        //print("s5", s5);

        //Multi Threading
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(SingletonTestClass::useSingleton);
        service.submit(SingletonTestClass::useSingleton);
        service.shutdown();
        */

    }

    static void print(String name, SingletonEnum object) {
        System.out.println(String.format("Object : %s, Hashcode: %d",  name, object.hashCode()));
    }

    static void useSingleton() {
        //Singleton singleton = Singleton.getInstance();
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        print("singleton", singleton);
    }

}
