class MapSum {
    HashMap<String,Integer> map  = new HashMap<>();
    public MapSum() {
       // map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum  = 0;
        for(var a : map.entrySet()){
            if(a.getKey().startsWith(prefix)){
                sum += a.getValue();
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */