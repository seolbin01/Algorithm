class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1, right = 100000;
        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            long totalTime = 0;
            int prevTime = 0;
            
            for (int i = 0; i < diffs.length; i++) {
                int diff = diffs[i];
                int timeCur = times[i];

                if (diff <= mid) {
                    totalTime += timeCur;
                } else {
                    int mistakes = diff - mid;
                    totalTime += mistakes * (timeCur + prevTime) + timeCur;
                }

                prevTime = timeCur;

                if (totalTime > limit) {
                    break;
                }
            }

            if (totalTime <= limit) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}