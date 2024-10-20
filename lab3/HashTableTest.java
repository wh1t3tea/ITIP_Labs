import java.util.LinkedList;

public class HashTableTest<K, V> {
    private LinkedList<Entry<K, V>> [] table;
    private int size;

    public HashTableTest(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (Entry<K, V> entry: table[index]) {
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        for (Entry<K, V> entry: table[index]) {
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        for (Entry<K, V> entry: table[index]){
            if (entry.getKey().equals(key)){
                table[index].remove();
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey(){
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public int hash(K key){
        return key.hashCode() % size;
    }
}
