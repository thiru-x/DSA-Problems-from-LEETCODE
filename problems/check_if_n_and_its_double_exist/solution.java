class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){
                flag= true;
                break;
        }
            }
        }
        return  flag;
    }
}