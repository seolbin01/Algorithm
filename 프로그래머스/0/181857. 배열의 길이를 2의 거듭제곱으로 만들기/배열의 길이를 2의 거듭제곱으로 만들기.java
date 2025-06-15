class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int min = 1;
        
        while (min < len) {
            min *= 2;
        }
        
        int[] answer = new int[min];
        
        for (int i=0;i<len;i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}