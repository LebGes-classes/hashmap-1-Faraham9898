public class MyHashMap<K, V> {
    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private final int SIZE = 5;
    private final Entry<K, V>[] table;

    public MyHashMap() {
        table = new Entry[SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> entry = table[hash];

        if (entry == null) {
            table[hash]= new Entry<K, V>(key, value);
        } else {
            while (entry.next != null) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
                entry = entry.next;
            }

            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }

            entry.next = new Entry<K, V>(key, value);
        }
    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> entry = table[hash];

        if (entry == null) {
            return null;
        }

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            entry = entry.next;
        }

        return null;
    }

    public Entry<K, V> remove(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> entry = table[hash];

        if (entry == null) {
            return null;
        }

        if (entry.getKey().equals(key)) {
            table[hash] = entry.next;
            entry.next = null;
            return entry;
        }

        Entry<K, V> prev = entry;
        entry = entry.next;

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                prev.next = entry.next;
                entry.next = null;
                return entry;
            }
            prev = entry;
            entry = entry.next;
        }

        return null;
    }
}