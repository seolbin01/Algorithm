class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multi = 1;
        int sumpow = 0;
        
        for (int n : num_list) {
            multi *= n;
            sumpow += n;
        }
        
        sumpow *= sumpow;
        
        answer = multi < sumpow ? 1 : 0;
            
        return answer;
    }
}