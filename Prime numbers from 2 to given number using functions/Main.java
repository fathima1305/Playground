import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main {
    public static void main(String args[]) throws IOException {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int count, c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        for (int i = 2; i <= n; i++) {
            count = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
                c++;
            }
        }
    }
}