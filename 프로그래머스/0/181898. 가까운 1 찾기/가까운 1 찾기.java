class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for (int i=idx;i<arr.length;i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
            if (i == arr.length - 1) {
                answer = -1;
            }
        }
        
        return answer;
    }
}