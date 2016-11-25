import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void solve(Scanner in, PrintWriter out) {
        int t = in.nextInt();
        int c = in.nextInt();
        int b = in.nextInt();
        int e = in.nextInt();
        out.println(Math.abs(t + ( b - e)* (2 * c + t)));
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
