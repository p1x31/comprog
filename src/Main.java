import java.io.*;
        import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        out.println(s);
    }

    void run() {
        try (
                Scanner in = new Scanner(new FileReader("aplusb.in"));//new Scanner(System.in);
                PrintWriter out = new PrintWriter(new FileWriter("\taplusb.out")))
        {//new PrintWriter(System.out);) {
            solve(in, out);
        }catch(IOException e){
            throw new Error(e);
        }
    }
}
