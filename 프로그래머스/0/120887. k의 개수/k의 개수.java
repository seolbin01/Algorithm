class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char) ('0' + k);

        for (int n = i; n <= j; n++) {
            String s = Integer.toString(n);
            for (int idx = 0; idx < s.length(); idx++) {
                if (s.charAt(idx) == target) answer++;
            }
        }
        return answer;
    }
}
