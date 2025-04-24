import java.util.Scanner;

public class Star_if_for {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("최대 행 개수를 입력하세요 (홀수) :");
        int x = s.nextInt();
        if (x % 2 == 0){
            x = x+1;
            System.out.println("짝수가 입력되었으니 +1값을 넣어서 " + x + " 로 실행합니다");
        }
        int m = x/2;
        for (int i = 0; i < x; i++){
            if (i<=m){
                for (int j = 0; j <= i; j++){
                    System.out.print("*");
                }

            }else{
                for (int j = 0; j < x-i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
