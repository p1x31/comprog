import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    void solve (Scanner in, PrintWriter out){
      /*  int k1 = in.nextInt();
        int l1 = in.nextInt();
        int m1 = in.nextInt();
        int k2 = in.nextInt();
        int l2 = in.nextInt();
        int m2 = in.nextInt();
        double lost1 = k1*l1 * 0.01;
        double lost2 = k2*l2*0.01;
        double paired =  Math.min((k1-lost1),(k2-lost2));
        //poteryanie yge ychel lol
        out.println((int)((k1-paired -lost1)*m1+(k2-paired-lost2)*m2));
*/
        int boltBefore = in.nextInt();
        int boltLostPercent = in.nextInt();
        int boltPrice = in.nextInt();
        int nutBefore = in.nextInt();
        int nutLostPercent = in.nextInt();
        int nutPrice = in.nextInt();
        int fullPrice = boltBefore * boltPrice + nutBefore * nutPrice;
        int boltAfter = boltBefore * (100 - boltLostPercent) / 100;
        int nutAfter = nutBefore * (100 - nutLostPercent) / 100;
        int pairsAfter = min(boltAfter,nutAfter);
        int priceAfter = pairsAfter * boltPrice + pairsAfter * nutPrice;
        out.println(fullPrice - priceAfter);
    }
    void run(){
        try(
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);) {
            solve(in, out);
        }
    }
}
