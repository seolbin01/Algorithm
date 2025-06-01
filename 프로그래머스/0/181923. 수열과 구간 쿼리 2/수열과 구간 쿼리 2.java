class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;

        for (int[] q : queries) {
            int min = Integer.MAX_VALUE;
            boolean found = false;

            for (int i=q[0];i<=q[1];i++) {
                if (arr[i] > q[2] && arr[i] < min) {
                    min = arr[i];
                    found = true;
                }
            }

            answer[idx++] = found ? min : -1;
        }

        return answer;
    }
}