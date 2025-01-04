package com.lld.patterns.creation.client;

import com.lld.patterns.creation.SingleTonEnum;
import com.lld.patterns.creation.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonClient {
    public static void main(String[] args) throws Exception {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        // Create SingleTon using reflection
//        try {
//            Class<?> singleTonClass = Class.forName("com.lld.patterns.creation.Singleton");
//            Constructor<?> constructors[] = singleTonClass.getDeclaredConstructors();
//            constructors[0].setAccessible(true);
//            Object instance = constructors[0].newInstance();
//            Singleton reflectionSingleTon = (Singleton) instance;
//            System.out.println(reflectionSingleTon);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//        // Cloning
//        System.out.println((Singleton)singleton.clone());
        // Enums
        SingleTonEnum enums=SingleTonEnum.LOGGER;
        enums.log("created");
        System.out.println(System.identityHashCode(enums));
        System.out.println("Instance 1 hash: " + System.identityHashCode(SingleTonEnum.LOGGER));
        System.out.println("Instance 2 hash: " + System.identityHashCode(SingleTonEnum.LOGGER));
        System.out.println("Instance 3 hash: " + System.identityHashCode(SingleTonEnum.LOGGER));
        System.out.println("Instance 4 hash: " + System.identityHashCode(SingleTonEnum.LOGGER));
    }
}
