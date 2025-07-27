class Solution {
    public long solution(int balls, int share) {
        if (share > balls - share) {
            share = balls - share;
        }

        long result = 1;
        for (int i = 1; i <= share; i++) {
            result = result * (balls - i + 1) / i;
        }
        return result;
    }
}
