class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] countArray = new int[2001];

        for(int num : arr)
        {
            countArray[num + 1000]++;
        }
        Arrays.sort(countArray);
        for(int i = 0; i < 2000; i++)
        {
            if(countArray[i] != 0 && countArray[i] == countArray[i + 1])
            {
                return false;
            }
        }
        return true;

    }
}