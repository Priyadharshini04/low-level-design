package com.lld.patterns.creation.factorymethod;

public class VannilaMilkShake implements MilkShake {
    @Override
    public void preparedMilkShake() {
        System.out.println("Prepared "+MilkShakeName.Vannila.getName());
    }
}
