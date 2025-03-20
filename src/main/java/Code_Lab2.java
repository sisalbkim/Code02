import java.util.Scanner;

public class Code_Lab2 {
    public static void main(String[] args){

//        사용자가 키보드로 두 정수를 입력하면 더하기, 빼기, 곱하기 , 나누기, 나머지 연산을 하는 계산기를 만들어봅시다.

        Scanner s = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요 : ");
        int a = s.nextInt();
        System.out.println("두번째 정수를 입력하세요 : ");
        int b = s.nextInt();

        int add;
        int sub;
        int mul;
        double div;
        int rem;

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = (double) a / b;
        rem = a % b;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + rem);

                s.close();



    }
}
