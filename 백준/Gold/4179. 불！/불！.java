import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static char[][] map;
    static int[][] fireTime;
    static int[][] jihunDist;
    static Queue<Point> fireQ;
    static Point jihun;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        fireTime = new int[R][C];
        jihunDist = new int[R][C];
        fireQ = new LinkedList<>();

        for (int i=0;i<R;i++) {
            String str = br.readLine();
            for (int j=0;j<C;j++) {
                map[i][j] = str.charAt(j);
                fireTime[i][j] = Integer.MAX_VALUE;
                jihunDist[i][j] = -1;

                if (map[i][j] == 'F') {
                    fireQ.offer(new Point(i, j));
                    fireTime[i][j] = 0;
                } else if (map[i][j] == 'J') {
                    jihun = new Point(i, j);
                }
            }
        }

        fireBfs(fireQ);

        int result = jihunBfs(jihun);

        if (result == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(result);
        }
    }

    private static void fireBfs(Queue<Point> fireQ) {
        while (!fireQ.isEmpty()) {
            Point current = fireQ.poll();

            for (int i=0;i<4;i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C  // 미로 가로세로 범위를 넘지 않고
                    && map[nx][ny] != '#' && fireTime[nx][ny] == Integer.MAX_VALUE) {  // 벽이 아니고 불이 아직 확산되지 않은 곳 일때
                    fireTime[nx][ny] = fireTime[current.x][current.y] + 1;
                    fireQ.offer(new Point(nx, ny));
                }
            }
        }
    }

    private static int jihunBfs(Point start) {
        Queue<Point> q = new LinkedList<>();
        q.offer(start);
        jihunDist[start.x][start.y] = 0;

        while (!q.isEmpty()) {
            Point current = q.poll();

            if (current.x == 0 || current.x == R - 1 || current.y == 0 || current.y == C - 1) {  // 무사히 가장자리에 도작 시
                return jihunDist[current.x][current.y] + 1;  // 탈출 시간 반환
            }

            for (int i=0;i<4;i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C
                    && map[nx][ny] != '#' && jihunDist[nx][ny] == -1) {
                    int nextTime = jihunDist[current.x][current.y] + 1;
                    if (nextTime < fireTime[nx][ny]) {
                        jihunDist[nx][ny] = nextTime;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }

        return -1;
    }
}