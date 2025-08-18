class Solution {
    public int trap(int[] arr) {
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        int count=0;

        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i+1]);
        }

        for(int i=0;i<
        
        
        
        
        
        
        
        
        
        
        arr.length;i++){
            int temp=Math.min(left[i],right[i])-arr[i];
            if(temp<0) temp=0;
            count+=temp;            
        }
            return count;
    }
}