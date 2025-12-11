class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int nCount = Integer.bitCount(n);

        answer = n+1;
        while (true) {
            int bCount = Integer.bitCount(answer);

            if (nCount == bCount) {
                break;
            }

            answer++;
        }
        
        return answer;
    }
}