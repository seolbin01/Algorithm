import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<5;i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        arr = arr.stream()
                .sorted()
                .collect(Collectors.toList());

        int evg = (arr.stream()
                    .mapToInt(a -> a)
                    .sum()) / 5;

        System.out.println(evg);
        System.out.println(arr.get(2));
    }
}