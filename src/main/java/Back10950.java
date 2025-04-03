import java.util.Scanner;

public class Back10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //테스트 입력할 총 숫자.
        while (n != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            n -= 1;

        }
    sc.close();
    }
}
