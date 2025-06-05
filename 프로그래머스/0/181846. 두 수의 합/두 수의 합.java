import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);
        BigInteger sum = biga.add(bigb);
        
        answer = sum.toString();
        
        return answer;
    }
}