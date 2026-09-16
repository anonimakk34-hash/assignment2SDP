import FactoryMethod.*;
import AbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        // Part A Execution: Client relies on the abstract spawner
        EnemySpawner spawner = new AnomalySpawner();
        spawner.triggerEncounter();

        // Part B Execution: Family selected in exactly one place
        GameWorldFactory factory = new BloodOceanFactory();
        WorldLoader loader = new WorldLoader(factory);
        loader.initializeWorld();
    }
}