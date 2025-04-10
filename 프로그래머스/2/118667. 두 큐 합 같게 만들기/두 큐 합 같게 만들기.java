import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }

        long target = (sum1 + sum2) / 2;

        if ((sum1 + sum2) % 2 != 0) return -1;

        int count = 0;
        int maxCount = queue1.length * 3; // upper bound

        while (count <= maxCount) {
            if (sum1 == target) return count;

            if (sum1 > target) {
                int x = q1.poll();
                sum1 -= x;
                q2.add(x);
                sum2 += x;
            } else {
                int x = q2.poll();
                sum2 -= x;
                q1.add(x);
                sum1 += x;
            }

            count++;
        }

        return -1;
    }
}
