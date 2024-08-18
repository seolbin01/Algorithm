import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Truck {
        int weight;
        int move;

        public Truck (int weight){
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }

    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int w = Integer.parseInt(arr[1]);
            int l = Integer.parseInt(arr[2]);

            Integer[] truckWeight = new Integer[n];

            String[] arr2 = br.readLine().split(" ");
            for(int i=0; i<n; i++) {
                truckWeight[i] = Integer.parseInt(arr2[i]);
            }

            int answer = 0;

            Queue<Truck> waitQ = new LinkedList<>();
            Queue<Truck> moveQ = new LinkedList<>();

            for(int t : truckWeight) {
                waitQ.offer(new Truck(t));
            }

            int curWeight = 0;   // 현재 다리 위에 있는 트럭의 총 무게
            while(!waitQ.isEmpty() || !moveQ.isEmpty()) {   // 두 큐 모두 비면 while문 종료
                answer++;

                if(moveQ.isEmpty()) {   // 다리 위에 아무 트럭도 없을 때
                    Truck t = waitQ.poll();
                    curWeight += t.weight;
                    moveQ.offer(t);
                    continue;
                }

                for(Truck t : moveQ) {
                    t.moving();   // 다리위에 있는 트럭들 모두 1만큼 움직이기
                }

                if(moveQ.peek().move > w) {   // 가장 먼저 올라갔던 트럭이 다리 길이 보다 더 움직였으면(다리를 넘어감)
                    Truck t = moveQ.poll();
                    curWeight -= t.weight;
                }

                if(!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= l){   // 다리 건너는 중인데, 다음 트럭도 건너도 다리 최대하중 안넘을 때
                    Truck t = waitQ.poll();
                    curWeight += t.weight;
                    moveQ.offer(t);
                }

            }

            System.out.println(answer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}