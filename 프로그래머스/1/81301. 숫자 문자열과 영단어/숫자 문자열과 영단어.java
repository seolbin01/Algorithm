class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int i=0;i<s.length();i++) {
            
            if (Character.isDigit(s.charAt(i))) {
                sb1.append(s.charAt(i));
                continue;
            }
            
            sb2.append(s.charAt(i));
            
            if (sb2.length() >= 3) {
                for (int j=0;j<10;j++) {
                    String num = number[j];
                    if (num.equals(sb2.toString())) {
                        sb1.append(j);
                        sb2.setLength(0);
                        break;
                    }
                }
            }
        }
        
        answer = Integer.parseInt(sb1.toString());
        
        return answer;
    }
}