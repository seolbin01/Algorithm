import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String origin = br.readLine();

        Deque<Character> s1 = new LinkedList<>();
        Stack<Character> s2 = new Stack<>();

        for(char c : origin.toCharArray()) {
            s1.addLast(c);
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if(!s1.isEmpty()) s2.push(s1.pollLast());
                    break;
                case "D":
                    if(!s2.isEmpty()) s1.addLast(s2.pop());
                    break;
                case "B":
                    if(!s1.isEmpty()) s1.pollLast();
                    break;
                case "P":
                    char ch = st.nextToken().charAt(0);
                    s1.addLast(ch);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!s1.isEmpty()) {
            sb.append(s1.pollFirst());
        }

        while(!s2.isEmpty()) {
            sb.append(s2.pop());
        }

        System.out.println(sb);
    }
}