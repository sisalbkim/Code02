import java.util.Scanner;

public class Back14681 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요.");
        int x = s.nextInt();
        System.out.println("두번째 정수를 입력하세요.");
        int y = s.nextInt();

        if (0 < x && 0 < y){
            System.out.print("1사분면입니다.");
        }

        if (0 > x && 0 < y){
            System.out.print("2사분면입니다.");
        }

        if (0 > x && 0 > y){
            System.out.print("3사분면입니다.");
        }

        if (0 < x && 0 > y){
            System.out.print("4사분면입니다.");
        }

        s.close();




    }
}
