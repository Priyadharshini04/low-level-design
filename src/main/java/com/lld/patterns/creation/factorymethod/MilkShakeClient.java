package com.lld.patterns.creation.factorymethod;

public class MilkShakeClient {
    public static void main(String[] args)
    {
        MilkShakeManager milkShakeManager=new MilkShakeManager();
        milkShakeManager.prepareMilkShakes(MilkShakeName.Choco);
        milkShakeManager.prepareMilkShakes(MilkShakeName.Vannila);
    }
}
