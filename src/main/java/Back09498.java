import java.util.Scanner;

public class Back09498 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //System.out.println("시험 점수를 입력하세요 : ");
        int a = s.nextInt();


        if (100 >= a && a >= 90) {
            System.out.println("A");
        }

        else if (90 > a && a >= 80) {
            System.out.println("B");
        }

        else if (80 > a && a >= 70) {
            System.out.println("C");
        }

        else if (70 > a && a >= 60) {
            System.out.println("D");
        }

        else  {
            System.out.println("F");
        }

            s.close();


    }
}
