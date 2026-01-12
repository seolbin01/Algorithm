class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r = arr1.length;
        int c = arr2[0].length;
        int k = arr1[0].length;
        
        int[][] answer = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int t = 0; t < k; t++) {
                    sum += arr1[i][t] * arr2[t][j];
                }
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }
}
