import java.util.Scanner;

public class Forrrrrrrr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("숫자를 입력하세요. (0누르면 종료)");
            int a = s.nextInt();

            if (a == 0){
                System.out.println("0을 입력해서 while문 종료");
                break;
            }
            System.out.println(a + "를 입력하셨습니다. while문 계속");
        }

    }
}
