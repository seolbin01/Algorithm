import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());

            for(int i=0;i<T;i++){
                boolean chk = true;
                Stack<Integer> stack = new Stack<>();
                String str = br.readLine();
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j) == '(') stack.push(0);
                    else{
                        if(stack.isEmpty()){
                            chk = false;
                            break;
                        }
                        stack.pop();
                    }
                }
                if(!stack.isEmpty()) chk = false;

                if(chk) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}