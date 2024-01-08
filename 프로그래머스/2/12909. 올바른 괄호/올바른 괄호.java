import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Integer> chk = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') chk.push(0);
            else if(s.charAt(i) == ')'){
                if(chk.isEmpty()) {
                    return false;
                }
                chk.pop();
            }
        }
        
        if(!chk.isEmpty()) answer = false;
        
        return answer;
    }
}