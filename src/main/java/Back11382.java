import java.util.Scanner;

public class Back11382 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요 : ");
        int a = s.nextInt();
        System.out.println("두번째 정수를 입력하세요 : ");
        int b = s.nextInt();
        System.out.println("세번째 정수를 입력하세요 : ");
        int c = s.nextInt();

        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }
}
