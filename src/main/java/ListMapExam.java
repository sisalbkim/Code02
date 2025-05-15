import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Map<String, String>>list = new ArrayList<>();

        Map<String,String> map = null;

        for (int i = 0; i < 3; i++) {

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("이메일 : ");
            String email = sc.next();

            System.out.print("부서 : ");
            String dept = sc.next();

            map = new HashMap<>();

            map.put("name",name);
            map.put("email",email);
            map.put("dept",dept);

            list.add(map);

            map = null;

        }
        int listSize = list.size();
        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");
        for (int i = 0; i < listSize; i++) {
            Map<String,String> rMap = list.get(i);

            System.out.println("name:" + rMap.get("name"));
            System.out.println("email:" + rMap.get("email"));
            System.out.println("dept:" + rMap.get("dept"));
            rMap = null;

        }
        System.out.println("2세대 반복문");
        for (Map<String,String> rmap : list){
            System.out.println("name:" + rmap.get("name"));
            System.out.println("email:" + rmap.get("email"));
            System.out.println("dept:" + rmap.get("dept"));


        }
        System.out.println("3세대 반복문");
        list.forEach(rm -> {
            System.out.println("name : " + rm.get("name"));
            System.out.println("email : " + rm.get("email"));
            System.out.println("dept : " + rm.get("dept"));
        });







    }
}
