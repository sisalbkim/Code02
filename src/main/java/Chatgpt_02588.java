import java.util.Scanner;

public class Chatgpt_02588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 값을 입력하세요 (a): ");
        int a = s.nextInt();

        System.out.print("두 번째 값을 입력하세요 (b): ");
        int b = s.nextInt();

        int result = a * b;  // 최종 곱셈 결과
        int maxWidth = String.valueOf(result).length(); // 최종 결과 자리수 구하기

        int tempB = b;
        int position = 0;
        boolean firstOutput = true;  // 첫 번째 출력인지 확인하는 플래그

        while (tempB > 0) {
            int digit = tempB % 10;  // 현재 자리 숫자 추출
            tempB /= 10;  // 다음 자리로 이동

            int partialResult = a * digit;  // 각 자리의 숫자와 a를 곱함
            String formattedResult = String.valueOf(partialResult * (int) Math.pow(10, position));

            // 첫 번째 출력이 아니라면 0을 빈칸으로 변환
            if (!firstOutput) {
                formattedResult = formattedResult.replace('0', ' ');
            }

            System.out.printf("%" + maxWidth + "s\n", formattedResult);  // 자리 정렬

            firstOutput = false;  // 첫 번째 출력이 끝났음을 표시
            position++;  // 자리수 증가
        }

        // 최종 곱셈 결과는 그대로 출력
        System.out.printf("%" + maxWidth + "d\n", result);

        s.close();
    }
}