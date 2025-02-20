import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] map;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        StringTokenizer st;

        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 1, 0);

        System.out.println(count);
    }

    private static void dfs(int x, int y, int curPipe) {

        if (x == N-1 && y == N-1) {
            count++;
            return;
        }

        switch (curPipe) {
            case 0:
                if (y+1 < N && map[x][y+1] != 1) {
                    dfs(x, y+1, 0);
                }
                if (x+1 < N && y+1 < N &&
                        map[x+1][y] != 1 && map[x][y+1] != 1 && map[x+1][y+1] != 1) {
                    dfs(x+1, y+1, 2);
                }
                break;
            case 1:
                if (x+1 < N && map[x+1][y] != 1) {
                    dfs(x+1, y, 1);
                }
                if (x+1 < N && y+1 < N &&
                        map[x+1][y] != 1 && map[x][y+1] != 1 && map[x+1][y+1] != 1) {
                    dfs(x+1, y+1, 2);
                }
                break;
            case 2:
                if (y+1 < N && map[x][y+1] != 1) {
                    dfs(x, y+1, 0);
                }
                if (x+1 < N && map[x+1][y] != 1) {
                    dfs(x+1, y, 1);
                }
                if (x+1 < N && y+1 < N &&
                        map[x+1][y] != 1 && map[x][y+1] != 1 && map[x+1][y+1] != 1) {
                    dfs(x+1, y+1, 2);
                }
                break;
        }
    }
}