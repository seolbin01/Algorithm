class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        s = s.toLowerCase();
        String[] array = s.split(" ");
        
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == ' ') count++; 
            else break;
        }

        for (int k = 0; k < array.length; k++) {
            String word = array[k];
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    answer.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            if (k < array.length - 1) {
                answer.append(" ");
            }
        }
        
        for(int i = 0; i < count; i++){
            answer.append(" ");
        }

        return answer.toString();
    }
}