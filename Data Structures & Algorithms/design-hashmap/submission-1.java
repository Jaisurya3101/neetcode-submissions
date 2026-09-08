class MyHashMap {
    List<Integer> keys;
    List<Integer> vals;
    public MyHashMap() {
        keys=new LinkedList<>();
        vals=new LinkedList<>();
    }
    
    public void put(int key, int value) {
        if(keys.contains(key)){
            int i = keys.indexOf(key);
            vals.add(i,value);
            vals.remove(i+1);
            return;
        }
        keys.add(key);
        vals.add(value);
    }
    
    public int get(int key) {
        if(keys.contains(key)){
            return vals.get(keys.indexOf(key));
        }else{
            return -1;
        }
    }
    
    public void remove(int key) {
        if(keys.contains(key)){
            int ind = keys.indexOf(key);
            keys.remove(ind);
            vals.remove(ind);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */