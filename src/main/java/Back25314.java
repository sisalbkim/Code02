import java.util.Scanner;

public class Back25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int res = (n/4);
        while (res != 0) {
            System.out.print("long ");
            res -= 1;
        }System.out.print("int");
    s.close();
    }
}
