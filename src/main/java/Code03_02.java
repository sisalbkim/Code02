import java.util.Scanner;

public class Code03_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1, n2;
        double res;
        System.out.println("첫번째 정수를 입력해주세요 : ");
        n1 = s.nextInt();
        System.out.println("두번째 정수를 입력해주세요 : ");
        n2 = s.nextInt();
        res = n1 + n2;
        System.out.println(res);
        res = n1 - n2;
        System.out.println(res);
        res = n1 * n2;
        System.out.println(res);
        res = (double) n1 / n2;
        System.out.println(res);
        res = n1 % n2;
        System.out.println(res);

        s.close();
    }
}
