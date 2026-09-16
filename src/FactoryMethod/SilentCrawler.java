package FactoryMethod;

public class SilentCrawler implements Enemy {
    @Override
    public void spawn() { System.out.println("Metallic scraping is heard from the aft section."); }
    @Override
    public void attack() { System.out.println("The Crawler breaches the airlock!"); }
}
