package com.lld.patterns.creation.factorymethod;

public class MilkShakeManager {
    MilkShakeFactory milkShakeFactory;
    MilkShakeManager()
    {
        milkShakeFactory=new MilkShakeFactory();
    }
    public void prepareMilkShakes(MilkShakeName milkShakeName)
    {
        MilkShake milkShake=milkShakeFactory.prepare(milkShakeName);
        if(milkShake!=null)
        {
            milkShake.preparedMilkShake();
        }
    }
}
