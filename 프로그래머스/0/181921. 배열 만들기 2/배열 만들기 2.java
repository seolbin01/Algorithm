import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("5");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int num = Integer.parseInt(current);

            if (num > r) continue;
            if (num >= l) result.add(num);

            queue.offer(current + "0");
            queue.offer(current + "5");
        }

        if (result.isEmpty()) return new int[]{-1};

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
