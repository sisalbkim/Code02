public class Exam {
    public static void main(String[] args) {
        int []nums = new int[]{1,3,7,1,4,7,3,1,9,0,7,3};

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max+"입니다.");

    }
}
