import java.util.Scanner;

public class Back02739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 1;
        System.out.print("1~9 사이의 정수 N을 입력해주세요 : ");
        int n = s.nextInt();

        while (a != 10) {
            System.out.println(n + " * " + a + " = " + (n*a));
            a += 1;

        }


    s.close();
    }
}
