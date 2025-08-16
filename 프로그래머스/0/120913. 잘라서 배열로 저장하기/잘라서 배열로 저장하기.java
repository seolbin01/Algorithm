class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int)Math.ceil((double)my_str.length() / n);
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}
