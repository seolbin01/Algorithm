class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        
        char[] carr = code.toCharArray();
        boolean mode = false;
        
        for (int i=0;i<code.length();i++) {
            if (carr[i] == '1') {
                mode = !mode;
            } else {
                if (mode) {
                    if (i % 2 != 0) {
                        answer.append(carr[i]);
                    }
                } else {
                    if (i % 2 == 0) {
                        answer.append(carr[i]);
                    }
                }
            }
        }
        
        if (answer.length() != 0) {
            return answer.toString();
        } else {
            return "EMPTY";
        }
    }
}