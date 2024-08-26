import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] nums = new String[n];

        int index = 0;
        while (st.hasMoreTokens()) {
            nums[index++] = st.nextToken();
        }

        int cur = 1;
        boolean chk = true;
        for(String c : nums) {
            if(!stack.isEmpty() && String.valueOf(cur).equals(stack.peek())) {
                while (!stack.isEmpty()) {
                    if(!stack.isEmpty() && String.valueOf(cur).equals(stack.peek())) {
                        cur++;
                        stack.pop();
                    } else break;
                }
            }

            if(c.equals(String.valueOf(cur))) {
                cur++;
                continue;
            }
            stack.push(c);
        }


        while (!stack.isEmpty()) {
            String num = stack.pop();
            if(!num.equals(String.valueOf(cur))) {
                chk = false;
                break;
            }
            cur++;
        }

        StringBuilder sb = new StringBuilder();
        if(chk) sb.append("Nice");
        else sb.append("Sad");

        System.out.println(sb);
    }
}