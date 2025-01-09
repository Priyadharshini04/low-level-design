package com.lld.patterns.creation.factorymethod;

public class ChocolateMilkShake implements MilkShake {
    @Override
    public void preparedMilkShake() {
        System.out.println("Prepared "+MilkShakeName.Choco.getName());
    }
}
