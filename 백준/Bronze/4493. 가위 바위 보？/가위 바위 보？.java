import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            for(int i=0;i<t;i++){
                int n = Integer.parseInt(br.readLine());
                int p1num = 0;
                int p2num = 0;
                for(int j=0;j<n;j++) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String p1 = st.nextToken();
                    String p2 = st.nextToken();

                    switch (p1){
                        case "R":
                            if(p2.equals("R")) break;
                            else if(p2.equals("S")){
                                p1num++;
                                break;
                            }
                            else if(p2.equals("P")){
                                p2num++;
                                break;
                            }
                        case "S":
                            if(p2.equals("S")) break;
                            else if(p2.equals("P")){
                                p1num++;
                                break;
                            }
                            else if(p2.equals("R")){
                                p2num++;
                                break;
                            }
                        case "P":
                            if(p2.equals("P")) break;
                            else if(p2.equals("R")){
                                p1num++;
                                break;
                            }
                            else if(p2.equals("S")){
                                p2num++;
                                break;
                            }
                        default:
                            break;
                    }
                }
                if(p1num > p2num) System.out.println("Player 1");
                else if(p1num < p2num) System.out.println("Player 2");
                else System.out.println("TIE");
            }
        }
    }
}