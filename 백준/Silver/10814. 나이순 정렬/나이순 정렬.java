import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static class User {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<User> ulist = new ArrayList<>();
        for (int i=0;i<N;i++) {
            String[] arr = br.readLine().split(" ");
            ulist.add(new User(Integer.parseInt(arr[0]), arr[1]));
        }

        Collections.sort(ulist, (a, b) -> a.age - b.age);

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<N;i++) {
            sb.append(ulist.get(i).age).append(" ").append(ulist.get(i).name).append("\n");
        }

        System.out.print(sb);
    }
}
