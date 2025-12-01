import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int white = 0;
    static int blue = 0;
    static int[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int x, int y, int size) {

        if (chk(x, y, size)) {
            if (map[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int half = size / 2;
        divide(x, y, half);
        divide(x, y+half, half);
        divide(x+half, y, half);
        divide(x+half, y+half, half);
    }

    private static boolean chk(int x, int y, int size) {
        int color = map[x][y];

        for (int i=x;i<x+size;i++) {
            for (int j=y;j<y+size;j++) {
                if (map[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
