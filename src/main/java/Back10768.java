import java.util.Scanner;

public class Back10768 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();

        int d = s.nextInt();

        if (m < 2) {
            System.out.print("Before");
        }else if (m > 2) {
            System.out.print("After");
        }else /*if (m == 2)*/ {
            if (d <= 17) {
                System.out.print("Before");
            } else if (d >= 19) {
                System.out.print("After");
            } else /*if (d == 18)*/ {
                System.out.print("Special");
            }
        }
        s.close();

    }
}
