class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];

            while (start < end) {
                char temp = answer.charAt(start);
                answer.setCharAt(start, answer.charAt(end));
                answer.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        
        return answer.toString();
    }
}