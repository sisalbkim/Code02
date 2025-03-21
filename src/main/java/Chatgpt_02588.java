import java.util.Scanner;

public class Chatgpt_02588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 값을 입력하세요 (a): ");
        int a = s.nextInt();

        System.out.print("두 번째 값을 입력하세요 (b): ");
        int b = s.nextInt();

        int result = a * b;  // 최종 곱셈 결과
        int maxWidth = String.valueOf(result).length(); // 최종 결과의 자리 수 구하기

        int tempB = b;
        int position = 0;

        while (tempB > 0) {  // b의 자리수를 추출하면서 곱셈
            int digit = tempB % 10;  // 현재 자리의 숫자 추출
            tempB /= 10;  // 다음 자리로 이동

            int partialResult = a * digit;  // 각 자리의 숫자와 a를 곱함
            System.out.printf("%" + maxWidth + "d\n", partialResult * (int)Math.pow(10, position));  // 자리 정렬

            position++;  // 자리수 증가
        }

        System.out.printf("%" + maxWidth + "d\n", result);  // 최종 곱셈 결과

        s.close();
    }
}