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
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();
        int a = h2 - h1;
        int b = m2 - m1;
        int c = s2 - s1;
        out.println(a*3600+b*60+c);
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
