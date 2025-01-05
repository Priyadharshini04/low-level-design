package com.lld.patterns.creation.singleton;

public class Singleton implements Cloneable{
    /*
    object craetion during compile time Eager
    private static final Singleton singleTonInstance=new SingleTon();
     */

    // Object creation during runtime. Lazy.
    private static Singleton singleton=null;
    private static final Object lock = new Object();
    private Singleton() throws InstantiationException {
        if(singleton!=null)
        {
            throw new InstantiationException("Instance already created"); // to prevent obj creation from reflection
        }
    }
    public /*synchronized*/ static Singleton getInstance() throws InstantiationException {
        synchronized (lock) // improve performance as it minimizes the locked portion of the code, allowing for better concurrency.
        {
            if(singleton==null)
            {
                singleton = new Singleton();
            }
            return singleton;
        }
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
