package hashtable;

public class MyOwnHashTable<K, V> implements MyHashTable<K, V> {

    Object[] buckets;
    int size;

    public MyOwnHashTable() {

    }

    public MyOwnHashTable(int bucketsSize) {
        buckets = new Object[bucketsSize];
    }


    @Override
    public void put(K key, V value) {
        int index = getBucketIndex(key);

        HashNode<K, V> node = (HashNode<K, V>) buckets[index];
        if (node != null) {
            do {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
            } while (node.next != null);
        }

        HashNode<K, V> newNode = new HashNode<>(key, value, key.hashCode());
        if (node != null) {
            node.next = newNode;
        } else {
            buckets[index] = newNode;
        }
        size++;
    }

    @Override
    public void remove(K key) {

    }

    @Override
    public V get(K key) {
        int index = getBucketIndex(key);

        HashNode<K, V> node = (HashNode<K, V>) buckets[index];
        if (node != null) {
            for (; ; ) {
                if (node.key.equals(key)) {
                    return node.value;
                }
                if (node.next == null) {
                    break;
                }
                node = node.next;
            }
        }

        return null;
    }

    public boolean containsKey(K key) {
        int index = getBucketIndex(key);

        HashNode<K, V> node = (HashNode<K, V>) buckets[index];
        if (node != null) {
            while (node.next != null) {
                if (node.key.equals(key)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private int getBucketIndex(K key) {
        return key.hashCode() % buckets.length;
    }
}
