class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return buildstack(s).equals(buildstack(t));
    }

    private Stack<Character> buildstack(String str){

        Stack<Character> stack=new Stack<>();

        for(char c:str.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return stack;
    }
}