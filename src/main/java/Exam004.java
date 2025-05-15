abstract class Fish {
    abstract void swim();
}

class Goldfish extends Fish {
    @Override
    void swim() {
        System.out.print("헤엄치고 있습니다.");
    }

}

public class Exam004{
    public static void main(String[] args){
        Fish f = new Goldfish();
        f.swim();
    }
}