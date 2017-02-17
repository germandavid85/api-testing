package org.apitesting.client.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// TODO: improve this store to hide it from the outside
public class ClientStore<K, V> {
    private final Map<K, V> storeValues;

    private static class ClientStoreSingleton {
        private static final ClientStore INSTANCE =  new ClientStore();
    }

    private ClientStore() {
        storeValues = new HashMap<>();
    }

    public static ClientStore getInstance() {
        return ClientStoreSingleton.INSTANCE;
    }

    public void put(final K key, final V value) {
        Objects.requireNonNull(key);

        synchronized (storeValues) {
            storeValues.put(key, value);
        }
    }

    public V get(final K key) {
        Objects.requireNonNull(key);

        synchronized (storeValues) {
            return storeValues.get(key);
        }
    }
}
