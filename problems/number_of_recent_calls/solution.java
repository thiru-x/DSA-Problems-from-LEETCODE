class RecentCounter {
    private static final int[] record=new int[10000];
    private int st;
    private int en;
    public RecentCounter() {
        int st=0;
        int en=0;
    }
    
    public int ping(int t) {
        while(st < en && (t-record[st]>3000)){
            st++;
        }
        record[en++]=t;
        return en-st;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */