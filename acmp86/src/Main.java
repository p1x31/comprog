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
        int n = in.nextInt();
        int res = n-2;
        out.println(res*(res+1));
    }

    /*int rec(int n){
        if (n==1 || n == 2){
            return 1 ;
        }
        else
        {
            return n*rec(n-1);
        }
    }*/

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
}
