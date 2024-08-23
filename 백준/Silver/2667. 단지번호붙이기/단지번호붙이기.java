import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[][] map;
    static int size;
    static boolean[][] visited;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};
    static ArrayList<Integer> result;

    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    size = 1;
                    bfs(i, j);
                    result.add(size);
                }
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();

        sb.append(result.size()).append("\n");

        for (int n : result) {
            sb.append(n).append("\n");
        }

        System.out.print(sb);

    }

    private static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                int cx = node.x + dirX[i];
                int cy = node.y + dirY[i];

                if (checkRange(cx, cy) && map[cx][cy] == 1 && !visited[cx][cy]) {
                    queue.offer(new Node(cx, cy));
                    visited[cx][cy] = true;
                    size++;
                }
            }
        }
    }

    private static boolean checkRange(int cx, int cy) {
        return cx >= 0 && cx < N && cy >= 0 && cy < N;
    }
}