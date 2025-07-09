package javaPro.lesson9.cachedObject;

import java.util.*;

public class LimitedCache {

    private final int capacity;
    private final Queue<CachedObject> cache;
    private final List<CachedObject> trash;

    public LimitedCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedList<>();
        this.trash = new ArrayList<>();
    }

    public void add(CachedObject obj) {
        if (cache.size() >= capacity) {
            CachedObject removed = cache.poll();
            trash.add(removed);
        }
        cache.add(obj);
    }

    public void applyLifetimeFilter(int threshold) {
        Iterator<CachedObject> iterator = cache.iterator();
        while (iterator.hasNext()) {
            CachedObject obj = iterator.next();
            if (obj.lifetime() < threshold) {
                iterator.remove();
                trash.add(obj);
            }
        }
    }

    public void printCache() {
        System.out.println("CACHE:");
        for (CachedObject obj : cache) {
            System.out.println("  " + obj);
        }
    }

    public void printTrash() {
        System.out.println("TRASH:");
        for (CachedObject obj : trash) {
            System.out.println("  " + obj);
        }
    }

}