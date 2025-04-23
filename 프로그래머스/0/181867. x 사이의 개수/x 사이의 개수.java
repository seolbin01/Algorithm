class Solution {
    public int[] solution(String myString) {
    
        String[] sarr = myString.split("x", -1);
        int[] answer = new int[sarr.length];
        
        for (int i=0;i<sarr.length;i++) {
            answer[i] = sarr[i].length();
        }
        
        return answer;
    }
}