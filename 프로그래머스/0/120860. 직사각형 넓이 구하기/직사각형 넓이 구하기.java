class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0], maxX = dots[0][0];
        int minY = dots[0][1], maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            int x = dots[i][0];
            int y = dots[i][1];
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
}
