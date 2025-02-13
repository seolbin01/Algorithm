import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static int N;
    static ArrayList<Integer> num = new ArrayList<>();
    static ArrayList<Character> pmmd = new ArrayList<>();
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String line = br.readLine();

        for (int i=0;i<N;i++) {
            if (i % 2 == 0) {
                num.add(line.charAt(i) - '0');
            } else {
                pmmd.add(line.charAt(i));
            }
        }

        dfs(0, num.get(0));

        System.out.println(max);
    }

    private static void dfs(int pmmdIdx, int value) {

        if (pmmdIdx >= pmmd.size()) {
            max = Math.max(max, value);
            return;
        }

        int result1 = calculate(value, pmmd.get(pmmdIdx), num.get(pmmdIdx + 1));
        dfs(pmmdIdx + 1, result1);

        if (pmmdIdx + 1 < pmmd.size()) {
            int next = calculate(num.get(pmmdIdx + 1), pmmd.get(pmmdIdx + 1), num.get(pmmdIdx + 2));
            int result2 = calculate(value, pmmd.get(pmmdIdx), next);
            dfs(pmmdIdx + 2, result2);
        }
    }

    private static int calculate(int a, char pmmd, int b) {
        switch(pmmd) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
        }
        return 0;
    }
}