import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("마리오");
        list.add("루이지");
        list.add("키노피오");
        list.add("키노피코");

        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            System.out.println(list.get(i));
        }


        System.out.println("2세대 반복문");
        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        System.out.println("3세대 반복문");

        list.forEach(name -> System.out.println("name : " + name));


        System.out.println("4세대 반복문");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));


        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
