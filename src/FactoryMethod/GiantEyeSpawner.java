package FactoryMethod;

public class GiantEyeSpawner extends EnemySpawner {
    @Override
    protected Enemy createEnemy() {
        return new GiantEye();
    }
}
