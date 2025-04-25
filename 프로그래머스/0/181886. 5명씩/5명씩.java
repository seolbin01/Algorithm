class Solution {
    public String[] solution(String[] names) {
        
        int length = names.length / 5;
        
        if (names.length % 5 != 0) {
            length++;
        }
        
        String[] answer = new String[length];
        
        for (int i=0;i<names.length;i+=5) {
            answer[i / 5] = names[i];
        }
        
        return answer;
    }
}