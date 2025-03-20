import java.util.Scanner;

public class Code_Lab1 {
    public static void main(String[] args){
//        난생이가 택배를 보내려고 편의점에 갔습니다. 택배를 보내려면 받는 사람의 이름과 주소,
//        택배의 무게를 입력해야 합니다. 택배비는 그램.(g)당 5원이며 자동으로 계산됩니다.
//        이러한 정보를 입력받아 배송비와 함께 출력하는 프로그램을 만들어봅시다
        Scanner s = new Scanner(System.in);

        String name, addr;
        int weight;

        System.out.println("택배 보내기입니다. 다음을 각각 입력하세요");

        System.out.println("받는 사람 :");
        name = s.nextLine();
        System.out.println("주소 :");
        addr = s.nextLine();
        System.out.println("무게(g) :");
        weight = s.nextInt();

        System.out.println("받는 사람 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("가격 : " + (weight * 5) + "원");

        s.close();

    }
}
