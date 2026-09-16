package FactoryMethod;

public class CrawlerSpawner extends EnemySpawner {
    @Override
    protected Enemy createEnemy() {
        return new SilentCrawler();
    }
}