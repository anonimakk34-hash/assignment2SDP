package FactoryMethod;

public class BloodAnomaly implements Enemy {
    @Override
    public void spawn() { System.out.println("A dark shape shifts in the fluid outside."); }
    @Override
    public void attack() { System.out.println("The Anomaly drains the submarine's power!"); }
}