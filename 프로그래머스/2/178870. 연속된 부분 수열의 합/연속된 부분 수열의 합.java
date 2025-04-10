class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int n = sequence.length;
        int start = 0;
        int end = 0;
        int sum = 0;

        int minLength = sequence.length + 1;

        while (end < n) {
            sum += sequence[end];

            while (sum > k && start <= end) {
                sum -= sequence[start];
                start++;
            }

            if (sum == k) {
                if (end - start < minLength) {
                    minLength = end - start;
                    answer[0] = start;
                    answer[1] = end;
                }
            }

            end++;
        }

        return answer;
    }
}
