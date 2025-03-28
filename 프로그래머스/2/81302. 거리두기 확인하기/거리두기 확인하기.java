import java.util.*;

class Solution {
    
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};
    
    static class Node {
        int a;
        int b;
        
        Node (int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for (int i = 0; i < places.length; i++) {
            String[] place = places[i];
            boolean isOk = true;

            for (int r = 0; r < 5 && isOk; r++) {
                for (int c = 0; c < 5 && isOk; c++) {
                    if (place[r].charAt(c) == 'P') {
                        if (!chk(r, c, place)) {
                            isOk = false;
                        }
                    }
                }
            }

            answer[i] = isOk ? 1 : 0;
        }
        
        return answer;
    }
    
    static boolean chk(int a, int b, String[] p) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(a, b));
        boolean[][] visited = new boolean[5][5];
        visited[a][b] = true;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i=0;i<4;i++) {
                int cx = node.a + dirX[i];
                int cy = node.b + dirY[i];
                
                if (chkRange(cx, cy) && !visited[cx][cy]) {
                    int d = Math.abs(a - cx) + Math.abs(b - cy);
                    visited[cx][cy] = true;
                    
                    if (p[cx].charAt(cy) == 'P' && d <= 2) {
                        return false;
                    } else if (p[cx].charAt(cy) == 'O' && d < 2) {
                        queue.offer(new Node(cx, cy));
                    }
                }
            }
        }
        return true;
    }
    
    static boolean chkRange(int cx, int cy) {
        return cx >= 0 && cx < 5 && cy >= 0 && cy < 5;
    }
}