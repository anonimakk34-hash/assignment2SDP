package AbstractFactory;

import FactoryMethod.Enemy;

public class WorldLoader {
    private Enemy enemy;
    private Terrain terrain;
    private SoundTrack soundtrack;

    // Composition: The client receives the factory interface
    public WorldLoader(GameWorldFactory factory) {
        this.enemy = factory.createEnemy();
        this.terrain = factory.createTerrain();
        this.soundtrack = factory.createSoundtrack();
    }

    public void initializeWorld() {
        terrain.render();
        soundtrack.play();
        enemy.attack();
    }
}
