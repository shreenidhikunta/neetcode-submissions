class MyHashMap {
    private static final int SIZE = 1000;
    private List<int[]>[] buckets;

    public MyHashMap() {
        //initalize the buckets List
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            buckets[i] = new ArrayList<>();
        }
        
    }

    //make a function for the hashing algo
    private int hash(int key)
    {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int idx = hash(key);
        for (int[] pair : buckets[idx]) {
            if (pair[0] == key)
            {
                pair[1] = value;
                return;
            }
        }
        buckets[idx].add(new int[]{key, value});
    }
    
    public int get(int key) {
        int idx = hash(key);
        for (int[] pair : buckets[idx])
        {
            if (pair[0] == key) return pair[1];
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].removeIf(pair -> pair[0] == key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */