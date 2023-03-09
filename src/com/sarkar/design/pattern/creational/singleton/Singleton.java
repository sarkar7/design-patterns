package com.sarkar.design.pattern.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    //private static Singleton soleInstance = new Singleton(); // avoiding eager initializing
    private static volatile Singleton soleInstance = null;

    private Singleton() {
        System.out.println("Creating...");
    }

    public static Singleton getInstance() {
        if (soleInstance == null) {
            synchronized (Singleton.class) {
                if (soleInstance == null) {
                    soleInstance = new Singleton();
                }
            }
        }
        return soleInstance;
        // return Holder.INSTANCE;
    }

    static class Holder {
        static final Singleton INSTANCE = new Singleton();
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("..read resolve..");
        return soleInstance;
    }

}
