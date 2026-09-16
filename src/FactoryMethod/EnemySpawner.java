package FactoryMethod;

public abstract class EnemySpawner {

    // The Factory Method
    protected abstract Enemy createEnemy();

    // The Business Method
    public void triggerEncounter() {
        System.out.println("Warning: Unidentified mass detected on the proximity sensor.");

        Enemy enemy = createEnemy(); // Delegation to subclass
        enemy.spawn();
        enemy.attack();
    }
}
