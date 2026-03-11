class Solution {
    public int bitwiseComplement(int n) {
        
        String bit=Integer.toBinaryString(n);
        String arr = "";
        for(char ch : bit.toCharArray()){
            if(ch=='0') arr+='1';
            else arr+='0';
        }
        int arr1 = Integer.parseInt(arr, 2);
        return arr1;
    }
}
  