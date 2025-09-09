class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double ns = Math.sqrt(n);
        
        if (ns == (long) ns) {
            answer = (long)(ns+1) * (long)(ns+1);
        }
        
        return answer;
    }
}