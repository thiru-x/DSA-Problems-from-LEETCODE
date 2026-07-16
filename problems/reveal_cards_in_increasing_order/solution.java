class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> que=new LinkedList<>();
        int n=deck.length;
        for(int i=0;i<n;i++){
            que.add(i);
        }
        Arrays.sort(deck);
        int []ans=new int[n];
        int i=0;
        while(!que.isEmpty()){
            ans[que.peek()]=deck[i++];
            que.poll();
            if(!que.isEmpty())
            que.add(que.poll());
        }
        return ans;
    }
}