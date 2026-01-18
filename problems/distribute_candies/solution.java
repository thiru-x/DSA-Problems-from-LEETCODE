class Solution {
    public int distributeCandies(int[] candyType) {
           int half = candyType.length / 2;
            HashSet<Integer> res = new HashSet<>();

                for (int candy : candyType) {
                res.add(candy);
                }
                if (res.size() <= half) {
        return res.size();
    }

    return half;


    }
}