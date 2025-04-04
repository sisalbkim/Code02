import java.util.Scanner;

public class Code05_08 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //System.out.println("시험 점수를 입력하세요 : ");
        int a = s.nextInt();


        if (100 >= a && a >= 90) {
            System.out.print("A");
        }
        else if (a >= 80) {
            System.out.print("B");
        }

        else if (a >= 70) {
            System.out.print("C");
        }

        else if (a >= 60) {
            System.out.print("D");
        }

        else  {
            System.out.print("F");
        }
        System.out.println("학점입니다.");

        s.close();


    }
}
