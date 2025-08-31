import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        char[] carr = str.toCharArray();

        Arrays.sort(carr);

        StringBuilder sb = new StringBuilder(new String(carr));
        sb.reverse();

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
