import java.util.Scanner;

public class Back14489 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a + b >= (c * 2)){
            System.out.print((a+b-(c*2)));
        }else {
            System.out.print((a+b));
        }
        s.close();
    }
}
