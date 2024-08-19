import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    static class Gem implements Comparable<Gem> {
        int weight;
        int price;

        Gem(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Gem other) {
            return Integer.compare(this.weight, other.weight);
        }
    }


    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] sarr = br.readLine().split(" ");
            int n = Integer.parseInt(sarr[0]);
            int k = Integer.parseInt(sarr[1]);

            Gem[] gems = new Gem[n];
            for (int i = 0; i < n; i++) {
                String[] arr = br.readLine().split(" ");
                gems[i] = new Gem(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            }

            long[] bags = new long[k];
            for (int i = 0; i < k; i++) {
                bags[i] = Long.parseLong(br.readLine());
            }

            Arrays.sort(gems);
            Arrays.sort(bags);

            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

            int gemIndex = 0;
            long total = 0;

            for (long bagWeight : bags) {
                while (gemIndex < n && gems[gemIndex].weight <= bagWeight) {
                    pq.offer(gems[gemIndex].price);
                    gemIndex++;
                }

                if (!pq.isEmpty()) {
                    total += pq.poll();
                }
            }

            System.out.println(total);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}