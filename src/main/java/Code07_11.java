class Rabbit11 {
    String shape = " ";
    int xPos;
    int yPos;
    Rabbit11(String value){
        this.shape = value;
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
        System.out.println("Rabbit setPosition(" + x + ", " + y + ")");
    }
}

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit11 rabbit1 = new Rabbit11("원");
        Rabbit11 rabbit2 = new Rabbit11("삼각형");
        Rabbit11 rabbit3 = new Rabbit11("토끼");

        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n",rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n",rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n",rabbit3.shape);
    }
}
