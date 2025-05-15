interface Rabbit0809{
    abstract void sleep();
}

class HouseRabbit0809 implements Rabbit0809 {
    public void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");

    }
}

class MountainRabbit0809 implements Rabbit0809 {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit0809 h = new HouseRabbit0809();
        MountainRabbit0809 m = new MountainRabbit0809();

        h.sleep();
        m.sleep();

    }
}
