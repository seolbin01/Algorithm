class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        answer = (price * ((long)(1 + count) * count / 2)) - money;
        
        if (answer < 0) {
            answer = 0;
        }
        
        return answer;
    }
}