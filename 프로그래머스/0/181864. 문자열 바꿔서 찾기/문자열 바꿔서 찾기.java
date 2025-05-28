class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = "";
        
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                str += "B";
            } else if (c == 'B') {
                str += "A";
            }
        }
        
        if (str.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}