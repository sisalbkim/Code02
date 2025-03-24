import java.util.Scanner;

public class Back01330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("정수 A를 입력하세요: ");
        int a = s.nextInt();
        System.out.println("정수 B를 입력하세요: ");
        int b = s.nextInt();

        if (a > b) {
            System.out.println("A가 B보다 큽니다");
        }
        if (b > a) {
            System.out.println("A가 B보다 작습니다.");
        }
        if (a == b) {
            System.out.println("A랑 B가 같습니다.");
        }
    }
}
