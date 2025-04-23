import java.util.Scanner;

public class Exam001 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("최대 행 개수 입력 : ");
        int x = s.nextInt();
        String a = "*";
        String b = " ";

        for (int i = 0 ; i < x ; i++){ //x회당 1행 반복
            for (int j = 0 ; j <= (x*2)-1; j++){ //(x*2)-1회만큼 반복
                if ((x-i)<= j && j<=(x+i)){//중앙부터 별을 만들기 위해 최대 행=피라미드 중앙임을 이용한 코드
                    System.out.print(a); // 1행일땐 중앙 기준 공백이 x +- 1부터, 2행이면 공백칸은 x +- 2로 나옴
                }else{
                    System.out.print(b);
                }
            }System.out.println("");
        }

    }
}