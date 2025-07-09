package javaPro.lesson9.cachedObject;

public record CachedObject(String id, int lifetime, String data) {

    @Override
    public String toString() {
        return "CachedObject{id='" + id + "', lifetime=" + lifetime + ", data='" + data + "'}";
    }

}