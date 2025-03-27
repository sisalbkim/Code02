import java.util.Scanner;

public class Backgpt02480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int a = s.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int b = s.nextInt();
        System.out.print("세번째 숫자를 입력하세요 : ");
        int c = s.nextInt();

        int prize = 0; // 상금 변수

        if (a == b && b == c) {
            // 같은 눈이 3개인 경우
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // a가 다른 하나와 같은 경우
            prize = 1000 + a * 100;
        } else if (b == c) {
            // b와 c가 같은 경우
            prize = 1000 + b * 100;
        } else {
            // 모두 다른 경우 (최댓값 찾기)
            int max = Math.max(a, Math.max(b, c));// Math.max 변수는 지정된 숫자중 더 큰 값을찾는 변수임.
            prize = max * 100;
        }

        System.out.print(prize + "원");

        s.close();
    }
}

