package com.lld.patterns.creation.factorymethod;

public enum MilkShakeName {
    Choco("Chocolate Milk Shake"),
    Vannila("Vannila Milk Shake");

    private final String name;
    MilkShakeName(String name) {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
