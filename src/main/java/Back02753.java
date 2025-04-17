import java.util.Scanner;

public class Back02753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //System.out.println("연도를 입력하세요 :");
        int a = s.nextInt();

        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0 )) {
            System.out.print("1");
        //    System.out.println("윤년입니다.");
// &&는 그리고, ||는 또는, !는 ~가 아닐때.
        }
        else {
            System.out.print("0");
        //    System.out.println("윤년이 아닙니다.");

        }
        s.close();
    }
}
