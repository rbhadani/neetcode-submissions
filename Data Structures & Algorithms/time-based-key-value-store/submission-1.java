class TimeMap {

    class Pair{
        String value;
        int timestamp;

        Pair(String v,int t){
            this.value = v;
            this.timestamp = t;
        }
    }
    HashMap<String,List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());

        map.get(key).add(new Pair(value,timestamp));

    }
    
    public String get(String key, int timestamp) {
        String ans = "";
        if(!map.containsKey(key))return "";

        List<Pair> p  = map.get(key);

        int left = 0;
        int right =p.size()-1;

        while(left<=right){
            int mid = (left+right)/2;

            if((p.get(mid).timestamp)<=timestamp){
                ans = p.get(mid).value;

                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}
