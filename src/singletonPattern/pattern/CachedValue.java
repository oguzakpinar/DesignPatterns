package singletonPattern.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CachedValue {

    private List<Integer> cachedList;
    private static CachedValue cachedValue;

    public synchronized void addCache(Integer value) {
        cachedList.add(value);
    }

    private CachedValue() {
        cachedList = new ArrayList<>();
        //cachedList = Collections.synchronizedList(new ArrayList<>());
    }

    public static synchronized CachedValue getValue() {
        if(cachedValue == null)
            cachedValue = new CachedValue();
        return cachedValue;
    }

    public void readGeneratedNumbers() {
        cachedList.forEach(System.out::println);
    }
}
