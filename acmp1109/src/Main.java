import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String str = String.format("The next number for the number %d is %d.%nThe previous number for the number %d is %d.",n, n+1,n,n-1);
        //"The next number for the number %i%n is %i.The previous number for the number %i is %i.",n, n+1,n,n-1
        out.println(str);
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
