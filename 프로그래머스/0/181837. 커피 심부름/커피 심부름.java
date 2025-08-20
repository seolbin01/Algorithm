class Solution {
    public int solution(String[] order) {
        int total = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) total += 5000;
            else total += 4500;
        }
        return total;
    }
}
