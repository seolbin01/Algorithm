class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd = "";
        String even = "";
        
        for (int n : num_list) {
            if (n % 2 == 0) {
                even += n; 
            } else {
                odd += n;
            }
        }
        
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}