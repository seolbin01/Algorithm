class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        int temp;
        
        for (int[] q : queries) {
            temp = answer[q[0]];
            answer[q[0]] = answer[q[1]];
            answer[q[1]] = temp;
        }
        
        return answer;
    }
}