class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sarr = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String str : sarr) {
            int sint = Integer.parseInt(str);
            max = Math.max(max, sint);
            min = Math.min(min, sint);
        }
        
        answer = answer + min + " " + max;
        
        return answer;
    }
}