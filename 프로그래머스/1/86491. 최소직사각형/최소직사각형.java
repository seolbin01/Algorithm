class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int longmax = 0;
        int shortmax = 0;
        int longs = 0;
        int shorts = 0;
        
        for (int i=0;i<sizes.length;i++) {
            longs = sizes[i][0];
            shorts = sizes[i][1];
            
            if (longs < shorts) {
                int temp = longs;
                longs = shorts;
                shorts = temp;
            }
            
            longmax = Math.max(longmax, longs);
            shortmax = Math.max(shortmax, shorts);
        }
        
        answer = longmax * shortmax;
        
        return answer;
    }
}