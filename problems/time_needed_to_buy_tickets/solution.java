class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
    Queue<Integer> que =new LinkedList<>();
    for(int i=0;i<tickets.length;i++){
        que.add(i);
    }
    int count=0;
    while(!que.isEmpty()){
        int s=que.poll();
        tickets[s]--;
        count++;
        if(tickets[s]==0){
            if(s==k){
                return count;
            }
        }else{
            que.add(s);
        }
    }
    return count;
    }
}