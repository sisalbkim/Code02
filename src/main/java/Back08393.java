import java.util.Scanner;

public class Back08393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int res = 0;

        while (n != (a-1)) {
            res = (res + a);
            a += 1;

        }
        System.out.println(res);
        s.close();
    }
}
