class Rabbit12 {
    private String shape;
    private int xPos;
    private int yPos;
    public int number;

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
public class Code07_12 {
    public static void main(String[] args) {
        Rabbit12 rabbit = new Rabbit12();

        rabbit.setPosition(100, 200);

        rabbit.number = 1;
        //rabbit.xPos = 0;
    }
}
