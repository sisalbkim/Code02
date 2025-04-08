import java.util.Scanner;

public class Code05_05 {

    public static void main(String[] args) {

        //입력받은 값이 짝수인지 홀수인지 구하기.

        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = s.nextInt();

        if (a % 2 == 0){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
        s.close();
    }
}
