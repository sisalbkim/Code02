public class Code10_04 {
    static int para2_method(int a, int b){
        int result;
        result = a + b;
        return result;
    }


    public static void main(String[] args) {
        int hap;
        hap = para2_method(3, 4);
        System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);
    }
}
