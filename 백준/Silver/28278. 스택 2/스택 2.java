import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<N;i++){
                String[] arr = br.readLine().split(" ");
                switch(arr[0]){
                    case "1":
                        stack.push(Integer.parseInt(arr[1]));
                        break;
                    case "2":
                        if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
                        else sb.append("-1").append("\n");
                        break;
                    case "3":
                        sb.append(stack.size()).append("\n");
                        break;
                    case "4":
                        if(stack.isEmpty()) sb.append("1").append("\n");
                        else sb.append("0").append("\n");
                        break;
                    case "5":
                        if(!stack.isEmpty()) sb.append(stack.peek()).append("\n");
                        else sb.append("-1").append("\n");
                        break;
                    default:
                        break;
                }
            }
            System.out.println(sb);
        }
    }
}