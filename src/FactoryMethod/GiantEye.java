package FactoryMethod;

public class GiantEye implements Enemy {
    @Override
    public void spawn() { System.out.println("A massive eye peers through the camera viewport."); }
    @Override
    public void attack() { System.out.println("The Eye rams the outer hull!"); }
}