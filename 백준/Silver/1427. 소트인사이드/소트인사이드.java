import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] sarr = str.split("");

        List<Integer> arr = new ArrayList<>();

        for(String s : sarr) {
            arr.add(Integer.parseInt(s));
        }

        arr = arr.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for(Integer i : arr) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}