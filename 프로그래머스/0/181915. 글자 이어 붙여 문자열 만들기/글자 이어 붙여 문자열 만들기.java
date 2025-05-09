class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
       
        for (int n : index_list) {
            answer.append(my_string.charAt(n));
        }
        
        return answer.toString();
    }
}