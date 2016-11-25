
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.println((Math.pow(10, (n-1)) + Math.pow(10, n)-1) * 9 * Math.pow(10,n-1)/2);
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}