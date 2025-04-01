import java.util.Scanner;
// while문 사용
public class Backgpt08393_While {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요 (While 버전): ");
        int n = s.nextInt();
        int res = 0;
        int a = 1;

        while (a <= n) {
            res += a;
            a++;
        }

        System.out.println("합계 (While): " + res);
        s.close();
    }
}

// For 문 사용

import java.util.Scanner;

public class Backgpt08393_For {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요 (For 버전): ");
        int n = s.nextInt();
        int res = 0;

        for (int i = 1; i <= n; i++) {
            res += i;
        }

        System.out.println("합계 (For): " + res);
        s.close();
    }
}

// while, For 둘다 사용하지 않는 수학 계산식 사용

import java.util.Scanner;

public class Backgpt08393_Formula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요 (Formula 버전): ");
        int n = s.nextInt();

        int res = n * (n + 1) / 2;

        System.out.println("합계 (Formula): " + res);
        s.close();
    }
}

