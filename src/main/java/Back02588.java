import java.util.Scanner;

public class Back02588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                int a;
                System.out.println("첫번째 값을 입력하세요 : (a<1000)");
        a = s.nextInt();
                int b;
        System.out.println("두번째 값을 입력하세요 : (b<1000)");
        b = s.nextInt();

        int c = (a*(b%10));
        int d = (a*(b%100/10));
        int e = (a*(b/100));
        int f = a*b;

        System.out.println("  " + a*(b%10));
        System.out.println(" " + (a*(b%100/10)));
        System.out.println(a*(b/100));
        System.out.println(a*b);

        s.close();

    }
}
