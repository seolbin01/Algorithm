class Solution {
    public int[] solution(int[] num_list) {
        
        int nleng = num_list.length;
        
        int[] answer = new int[nleng+1];
        
        for (int i=0;i<nleng;i++) {
            answer[i] = num_list[i];
        }
        
        answer[nleng] = num_list[nleng-1] > num_list[nleng-2] ? num_list[nleng-1] - num_list[nleng-2] : num_list[nleng-1] * 2;
        
        return answer;
    }
}