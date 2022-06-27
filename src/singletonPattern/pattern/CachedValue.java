package singletonPattern.pattern;

import java.util.ArrayList;
import java.util.List;

public class CachedValue {

    private List<Integer> cachedList;
    private static CachedValue cachedValue;

    public List<Integer> getCachedList() {
        return cachedList;
    }

    private CachedValue() {
        cachedList = new ArrayList<>();
    }

    public static CachedValue getValue() {
        if(cachedValue == null)
            cachedValue = new CachedValue();
        return cachedValue;
    }
}
