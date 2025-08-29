class Solution {
    public int[] solution(long n) {
        String str = n + "";
        int length = str.length();
        int[] answer = new int[length];
        
        for (int i=0;i<length;i++) {
            answer[i] = str.charAt(length-i-1) - '0';
        }
        
        return answer;
    }
}