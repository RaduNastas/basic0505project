package javaPro.lesson9.cachedObject;

public class CachedDemo {

    public static void main(String[] args) {

        LimitedCache cache = new LimitedCache(3);

        cache.add(new CachedObject("a", 8, "Data A"));
        cache.add(new CachedObject("b", 4, "Data B"));
        cache.add(new CachedObject("c", 9, "Data C"));
        cache.add(new CachedObject("d", 3, "Data D"));

        System.out.println("Before filtering:");
        cache.printCache();

        cache.applyLifetimeFilter(5);

        System.out.println("\nAfter filtering (threshold = 5):");
        cache.printCache();

        cache.printTrash();
    }

}