class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int first = x;
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        
        if (first % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}