package hashtable;

class HashNode<K, E> {

    K key;

    E value;

    HashNode<K, E> next;

    int hash;

    HashNode(K key, E value, int hash) {
        this.key = key;
        this.value = value;
        this.hash = hash;
    }

}
