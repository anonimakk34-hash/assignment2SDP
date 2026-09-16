package AbstractFactory;

import FactoryMethod.Enemy;

public interface GameWorldFactory {
    Enemy createEnemy();
    Terrain createTerrain();
    SoundTrack createSoundtrack();
}
