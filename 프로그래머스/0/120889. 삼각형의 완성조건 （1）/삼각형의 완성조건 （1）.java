class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = sides[0];
        int two = 0;
        
        for (int s : sides) {
            if (max < s) {
                max = s;
            }
            two += s;
        }
        
        two -= max;
        
        if (two > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}