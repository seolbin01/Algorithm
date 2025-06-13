class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for (int i=0;i<=k;i++) {
            
            if (i >= board.length) {
                break;
            }
            
            for (int j=0;j<=k-i;j++) {
                
                if (j >= board[0].length) {
                    break;
                } 
                
                answer += board[i][j];
            }
        }
        
        return answer;
    }
}