import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int a, b;  // 세로a, 가로b
    static char[][] map;  // 지도 정보
    static int maxDist = 0; // 최단 거리 중 최댓값
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        map = new char[a][b];

        for (int i=0;i<a;i++) {  // 지도 정보 저장

            String str = br.readLine();

            for (int j=0;j<b;j++) {
                map[i][j] = str.charAt(j);  // toCharArray 대신 charAt을 활용해 시간 줄이기
            }
        }

        // 모든 육지에서 bfs 수행
        for (int i=0;i<a;i++) {
            for (int j=0;j<b;j++) {
                if (map[i][j] == 'L') {
                    bfs(i, j);
                }
            }
        }

        System.out.println(maxDist);
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        int[][] distance = new int[a][b];
        boolean[][] visited = new boolean[a][b];

        queue.offer(new Point(x, y));
        visited[x][y] = true;  // 방문

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int cx = current.x;
            int cy = current.y;

            maxDist = Math.max(maxDist, distance[cx][cy]);

            for (int i=0;i<4;i++) {
                int nx = cx + dirX[i];
                int ny = cy + dirY[i];

                if (nx >= 0 && nx < a && ny >= 0 && ny < b
                    && !visited[nx][ny] && map[nx][ny] == 'L') {
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[cx][cy] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }
}