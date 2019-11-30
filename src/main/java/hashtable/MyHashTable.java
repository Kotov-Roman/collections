package hashtable;

public interface MyHashTable <K, V> {

    void put (K key, V value);

    void remove (K key);

    V get(K key);

    int size();
}
