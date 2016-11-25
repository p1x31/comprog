import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int minSt = Math.min(i,j);
        int maxSt = Math.max(i,j);
        out.println(Math.min(maxSt-minSt-1, n+minSt-maxSt-1));
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
