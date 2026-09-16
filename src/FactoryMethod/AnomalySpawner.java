package FactoryMethod;

public class AnomalySpawner extends EnemySpawner {
    @Override
    protected Enemy createEnemy() {
        return new BloodAnomaly();
    }
}
