import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] city;  // 도시 정보
    static ArrayList<Point> home;  // 집 좌표
    static ArrayList<Point> chicken;  // 치킨집 좌표
    static int min;  // 도시의 치킨 거리의 최솟값
    static boolean[] open;  // 각 치킨집 오픈여부

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        city = new int[n][n];
        home = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i=0;i<n;i++) {  // 도시 정보 저장

            st = new StringTokenizer(br.readLine());

            for (int k=0;k<n;k++) {

                city[i][k] = Integer.parseInt(st.nextToken());

                if (city[i][k] == 1) {
                    home.add(new Point(i,k));  // 집 좌표 저장
                } else if (city[i][k] == 2) {
                    chicken.add(new Point(i,k));  // 치킨집 좌표 저장
                }
            }
        }

        min = Integer.MAX_VALUE;
        open = new boolean[chicken.size()];

        dfs(0,0);

        System.out.println(min);
    }

    static void dfs(int start, int cnt) {
        if (cnt == m) {  // m개의 치킨집 선택시,
            int res = 0;  // 현재 조합의 치킨 거리 합 (=도시의 치킨 거리)

            for (Point point : home) {  // 각 집에 대해
                int temp = Integer.MAX_VALUE;  // 치킨 거리 저장할 변수

                for (int j = 0; j < chicken.size(); j++) {
                    if (open[j]) {
                        int distance = Math.abs(point.x - chicken.get(j).x)
                                + Math.abs(point.y - chicken.get(j).y);

                        temp = Math.min(temp, distance);  // 치킨 거리 최솟값 갱신
                    }
                }
                res += temp;  // 현재 집의 치킨 거리를 총합에 더함 (도시의 치킨 거리를 구하기 위해)
            }
            min = Math.min(min, res);  // 도시의 치킨 거리 최솟값 갱신
            return;
        }

        // 조합 생성 (백트래킹)
        for (int i=start;i<chicken.size();i++) {
            open[i] = true;  // 치킨집 선택
            dfs(i+1,cnt+1);  // 다음 선택으로 진행
            open[i] = false;  // 선택 취소
        }
    }
}