import java.util.Scanner;

public class Back25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("총금액 X 입력 : ");
        int x = s.nextInt();
        System.out.print("총 구매 개수 : ");
        int n = s.nextInt();
        int res = 0;

        while (n != 0){
            System.out.print("금액을 입력하세요 : ");
            int a = s.nextInt();
            System.out.print("가격을 입력하세요 : ");
            int b = s.nextInt();
            res = res + (a*b);
            n -= 1;

        }
        if (res == x){
            System.out.print("Yes");
        }else System.out.print("No");
    s.close();
    }
}
