package AbstractFactory;

import FactoryMethod.BloodAnomaly;
import FactoryMethod.Enemy;

public class BloodOceanFactory implements GameWorldFactory {
    @Override
    public Enemy createEnemy() { return new BloodAnomaly(); }
    @Override
    public Terrain createTerrain() { return new TrenchWall(); }
    @Override
    public SoundTrack createSoundtrack() { return new DeepDrone(); }
}
