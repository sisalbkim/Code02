import java.util.Scanner;

public class Back02525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
//
//또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
//
//훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
        System.out.println("현재 시간(시)를 입력해주세요 :");
        int h = s.nextInt();
        System.out.println("현재 시간(분)을 입력해주세요 :");
        int m = s.nextInt();

        System.out.println("현재 시간은" + h + "시" + m + "분 입니다. 예약할 시간(분)을 입력해주세요 :");
        int a = s.nextInt();

        if (a >= 60){
            System.out.println("예정된 시각은" + (h + (a / 60)) + "시" + (m + (a % 60)) + "분 입니다.");
        }

        if (a < 60){
            System.out.println("예정된 시각은" + (h + ((m + a) / 60)) + "시" + ((m + a)%60) + "분 입니다.");
        }

        s.close();
//    이거 지금은 시가 24시 넘으면 0으로 바꿔주는 코드가 없음. 나중에 다시 수정
    }
}
