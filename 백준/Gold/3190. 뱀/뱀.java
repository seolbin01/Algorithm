import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Main {

    static int[][] map;
    static int count = 0;  // 총 걸린 시간
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static class Snake {
        int x = 1;
        int y = 1;
        int dirIndex = 0; // 처음 오른쪽
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1]; // 뱀의 초기 위치는 (1, 1)
        Snake snake = new Snake();

        int K = Integer.parseInt(br.readLine());
        for (int i=0;i<K;i++) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            map[x][y] = 1;
        }

        int L = Integer.parseInt(br.readLine());
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i=0;i<L;i++) {
            String[] arr = br.readLine().split(" ");
            hm.put(Integer.parseInt(arr[0]), arr[1]);
        }

        Deque<int[]> body = new ArrayDeque<>();
        body.add(new int[]{1, 1});
        map[1][1] = 2;

        while (true) {
            count++;

            int nx = snake.x + dx[snake.dirIndex];
            int ny = snake.y + dy[snake.dirIndex];

            // 벽 충돌
            if (nx < 1 || nx > N || ny < 1 || ny > N) break;

            // 자기 몸 충돌
            if (map[nx][ny] == 2) break;

            // 머리 이동
            body.addFirst(new int[]{nx, ny});

            if (map[nx][ny] == 1) {
                // 사과 → 꼬리 유지
                map[nx][ny] = 2;
            } else {
                // 사과 없음 → 꼬리 제거
                int[] tail = body.pollLast();
                map[tail[0]][tail[1]] = 0;
                map[nx][ny] = 2;
            }

            snake.x = nx;
            snake.y = ny;

            // 방향 전환 (X초 끝난 뒤)
            if (hm.containsKey(count)) {
                if (hm.get(count).equals("D")) {
                    snake.dirIndex = (snake.dirIndex + 1) % 4;
                } else {
                    snake.dirIndex = (snake.dirIndex + 3) % 4;
                }
            }
        }


        System.out.println(count);
    }
}
