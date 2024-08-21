import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int M, N, K;
    static int[][] map;
    static int size;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for (int j = a; j < c; j++) {
                for (int k = b; k < d; k++) {
                    map[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    size = 1;
                    dfs(i, j);
                    result.add(size);
                }
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();

        sb.append(result.size()).append("\n");

        for(int n : result) {
            sb.append(n).append(" ");
        }

        System.out.println(sb);

        br.close();
    }

    private static void dfs(int x, int y) {
        map[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int cx = x + dirX[i];
            int cy = y + dirY[i];

            if(checkRange(cx, cy) && map[cx][cy] == 0) {
                size++;
                dfs(cx, cy);
            }
        }
    }

    private static boolean checkRange(int cx, int cy) {
        return cx >= 0 && cx < N && cy >= 0 && cy < M;
    }
}