import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> result;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static int height;
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        result = new ArrayList<>();

        int max = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }

        result.add(1);   // height = 0인 경우
        height = 1;
        while (height < max) {
            num = 0;
            visited = new boolean[N][N];

            if (height != 0) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (map[i][j] > height && !visited[i][j]) {
                            dfs(i, j);
                            num++;
                        }
                    }
                }
            }

            result.add(num);

            height++;
        }

        int safe = result.stream().mapToInt(i -> i).max().orElse(1);

        System.out.println(safe);

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dirX[i];
            int cy = y + dirY[i];

            if(checkRange(cx, cy) && map[cx][cy] > height && !visited[cx][cy]) {
                dfs(cx, cy);
            }

        }
    }

    private static boolean checkRange(int cx, int cy) {
        return cx >= 0 && cx < N && cy >= 0 && cy < N;
    }

}