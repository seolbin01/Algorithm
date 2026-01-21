class Solution {
    int solution(int[][] land) {
        int[] dp = new int[4];

        for (int j = 0; j < 4; j++) {
            dp[j] = land[0][j];
        }

        for (int i = 1; i < land.length; i++) {
            int[] next = new int[4];
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (k != j) {
                        max = Math.max(max, dp[k]);
                    }
                }
                next[j] = land[i][j] + max;
            }
            dp = next;
        }

        int answer = 0;
        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, dp[j]);
        }
        return answer;
    }
}
