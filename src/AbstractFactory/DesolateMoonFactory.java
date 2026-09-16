package AbstractFactory;

import FactoryMethod.Enemy;
import FactoryMethod.SilentCrawler;

public class DesolateMoonFactory implements GameWorldFactory {
    @Override
    public Enemy createEnemy() { return new SilentCrawler(); }
    @Override
    public Terrain createTerrain() { return new CraterSurface(); }
    @Override
    public SoundTrack createSoundtrack() { return new StaticInterference(); }
}