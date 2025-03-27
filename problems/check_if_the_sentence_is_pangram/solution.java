class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean b=false;
        for(char i='a';i<='z';i++)
        {
            String res=""+i;
            if(sentence.contains(res))
            {
             b= true;}
            else{
                b=false;
                break;
            }
        }
       if(b) return true;
        return false;
    }
}