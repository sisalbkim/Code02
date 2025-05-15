class Rabbit0709 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
        System.out.println("Rabbit setPosition(" + x + ", " + y + ")");
    }
}

public class Code07_09 {
    public static void main(String[] args) {
        Rabbit0709 rabbit1 = new Rabbit0709();
        Rabbit0709 rabbit2 = new Rabbit0709();
        Rabbit0709 rabbit3 = new Rabbit0709();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);
    }
}

