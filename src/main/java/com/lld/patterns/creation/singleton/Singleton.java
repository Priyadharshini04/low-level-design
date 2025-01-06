package com.lld.patterns.creation.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton implements Cloneable{
    /*
    object creation during compile time Eager
    private static final Singleton singleTonInstance=new SingleTon();
     */

    // Object creation during runtime. Lazy.
    private static volatile Singleton singleton=null;
    private static final Object lock = new Object(); // intrinsic lock
    // same as intrinsic lock but jvm gives priority for the longer waiting thread if true was set.
    private static final ReentrantLock reentrantLock = new ReentrantLock(true);

    private Singleton() throws InstantiationException {
        if(singleton!=null)
        {
            throw new InstantiationException("Instance already created"); // to prevent obj creation from reflection
        }
    }
    public /*synchronized*/ static Singleton getInstance() throws InstantiationException {
        if(singleton==null) // Double-checked locking.
        {
            synchronized (lock) // improve performance as it minimizes the locked portion of the code, allowing for better concurrency.
            {
                if(singleton==null)
                {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private static Singleton getInstanceReentrantLock() throws InstantiationException {
        if(singleton==null) // Double-checked locking.
        {
            try
            {
                reentrantLock.lock();
                if(singleton==null)
                {
                    singleton = new Singleton();
                }
            }
            finally {
                reentrantLock.unlock();
            }
        }
        return singleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }
    // Alternatively, you could return the same instance instead of throwing an exception.
    // /* @Override protected Object clone() throws CloneNotSupportedException {
    // return getInstance();
    // } */
}
