import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    static int k = 0;
    static int n = 0;
    static Integer[] tmp;

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            String[] arr = br.readLine().split(" ");
            Integer[] iarr = new Integer[n];

            for (int i = 0; i < arr.length; i++) {
                iarr[i] = Integer.parseInt(arr[i]);
            }

            tmp = new Integer[n];

            mergeSort(iarr, 0, n - 1);

            System.out.println(-1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void mergeSort(Integer[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(Integer[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = p;

        while (i <= q && j <= r) {
            if(A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = A[i++];
        }

        while (j <= r) {
            tmp[t++] = A[j++];
        }

        i = p;
        t = p;

        while (i <= r) {
            A[i++] = tmp[t++];
            if(++count == k) {
                System.out.println(A[i-1]);
                System.exit(0);
            }
        }
    }
}