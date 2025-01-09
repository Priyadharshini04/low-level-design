package com.lld.patterns.creation.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class MilkShakeFactory {
    private Map<MilkShakeName, MilkShake> milkShakeMenu;

    public MilkShakeFactory() {
        buildMilkShakeMenu();
    }

    private void buildMilkShakeMenu() {
        milkShakeMenu = new HashMap<>();
        milkShakeMenu.put(MilkShakeName.Choco, new ChocolateMilkShake());
        milkShakeMenu.put(MilkShakeName.Vannila, new VannilaMilkShake());
    }

    public MilkShake prepare(MilkShakeName milkShakeName) {
        if (milkShakeName == null) {
            System.out.println("Provide MilkShake Name");
            return null;
        } else if (!milkShakeMenu.containsKey(milkShakeName)) {
            System.out.println("MilkShake Not Available provide another milkshake name");
            return null;
        } else {
            return milkShakeMenu.get(milkShakeName);
        }
    }
}
