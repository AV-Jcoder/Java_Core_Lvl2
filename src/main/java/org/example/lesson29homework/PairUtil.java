package org.example.lesson29homework;

public final class PairUtil {

    private PairUtil() {}

    public static <K,V> Pair<V,K> Swap(Pair<K,V> pair) {
        return new Pair(pair.getValue(), pair.getKey());
    }
}
