import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int o = 0;
        //(n-(k % n) take again % n
        // o - obijenie
        if (k % n != 0 ){
            o = n -(k % n);
        } else{
            o = 0;
        }
        out.println(k/n + " " + k % n + " " + o);
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
