import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                int temp = queue.poll();
                queue.offer(temp);
            }

            sb.append(queue.poll());
            if(!queue.isEmpty()) sb.append(", ");
        }

        sb.append(">");

        System.out.println(sb.toString());
        
    }
}