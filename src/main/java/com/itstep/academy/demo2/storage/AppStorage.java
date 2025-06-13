package com.itstep.academy.demo2.storage;

import com.itstep.academy.demo2.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppStorage {

    private static final Map<String, Object> storage = new HashMap<>();

    public static Object get(String key) {
        return storage.get(key);
    }

    public static<T> void set(String key, T value) {
        storage.put(key, value);
    }

    public static List<Object> getAll() {
        return storage.values().stream().toList();
    }
}
