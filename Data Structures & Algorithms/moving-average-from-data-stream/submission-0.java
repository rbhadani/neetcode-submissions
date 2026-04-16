class MovingAverage {
    Queue<Integer> q;
    int windowSize;
    double sum;
    public MovingAverage(int size) {
        this.windowSize = size;
        sum =0;
        q = new LinkedList<>();
    }
    
    public double next(int val) {
        q.add(val);
        sum+=val;
        if(q.size()>windowSize){
            sum = sum - q.poll();
        }
        return sum/q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
