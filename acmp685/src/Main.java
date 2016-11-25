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
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        int max2 = Math.max(Math.max(d,e),f);
        int min2 = Math.min(Math.min(d,e),f);

        out.println(max*max2 + middle(a,b,c) * middle(d,e,f) + min*min2);
    }
    int middle(int a, int b, int c){
        return Math.min(Math.min(Math.max(a,b), Math.max(b,c)), Math.max(a,c));
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
