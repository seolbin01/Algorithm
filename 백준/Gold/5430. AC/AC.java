import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int T = Integer.parseInt(br.readLine());

            loop:
            while (T > 0) {
                String command = br.readLine();
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine(),"[,]");
                Integer[] array = new Integer[n];

                int i=0;
                while (st.hasMoreTokens()) {
                    array[i] = Integer.parseInt(st.nextToken());
                    i++;
                }

                StringBuilder sb = new StringBuilder();
                Deque<Integer> arr = new ArrayDeque<>();

                for (int num : array) {
                    arr.add(num);
                }

                boolean chk = true;   // true는 first, false는 last
                for (char c : command.toCharArray()) {
                    if (c == 'R') {
                        chk = !chk;
                    } else if (c == 'D') {
                        if (!arr.isEmpty()) {
                            if (chk) {
                                arr.removeFirst();
                            } else {
                                arr.removeLast();
                            }
                        } else {
                            sb.append("error");
                            System.out.println(sb);
                            T--;
                            continue loop;
                        }
                    }
                }


                sb.append("[");
                while (!arr.isEmpty()) {
                    if (chk) {
                        sb.append(arr.removeFirst());
                    } else {
                        sb.append(arr.removeLast());
                    }
                    if(!arr.isEmpty()) sb.append(",");
                }
                sb.append("]");

                System.out.println(sb);
                T--;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}