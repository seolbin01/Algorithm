class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalday = 0;
        for (int i=0;i<a-1;i++) {
            totalday += month[i];
        }
        totalday += b - 1;
        
        totalday %= 7;
        answer += day[totalday];
        
        return answer;
    }
}