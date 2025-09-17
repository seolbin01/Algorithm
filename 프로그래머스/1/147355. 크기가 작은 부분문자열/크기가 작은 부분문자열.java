class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tlen = t.length();
        int plen = p.length();
        
        long pNum = Long.parseLong(p);
        
        for (int i=0;i<=tlen-plen;i++) {
            String part = t.substring(i, i+plen);
            long num = Long.parseLong(part);
            if (num <= pNum) {
                answer++;
            }
        }
        
        return answer;
    }
}
