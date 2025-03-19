class Solution {
    public boolean judgeCircle(String moves) {
        int UD=0;
        int LR=0;

        for(char c: moves.toCharArray())
        if(c=='U') UD++;
        else if(c=='D') UD--;
        else if(c=='L') LR++;
        else if(c=='R') LR--;

        return (UD==0 && LR==0);
    }
}