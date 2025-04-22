class Rabbit0804 {
    Rabbit0804 () {
        System.out.println("1.슈퍼 클래스의 생성자가 호출됩니다");
    }
    void run(){
        System.out.println("토끼가 달립니다.");
    }
}
class HouseRabbit0804 extends Rabbit0804 {
    HouseRabbit0804 () {
        System.out.println("2.서브 클래스의 생성자가 호출됩니다.");
    }

    @Override
    void run() {
        super.run();
    }
}

public class Code08_04 {
    public static void main(String[] args) {
        HouseRabbit0804 houseRabbit = new HouseRabbit0804();

    }


}
