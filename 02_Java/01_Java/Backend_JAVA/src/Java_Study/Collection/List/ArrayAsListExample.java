package Java_Study.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
    public static void main(String[] args) {
        // 읽기 전용 리스트
        List<String> initList = Arrays.asList("홍길동", "신용권", "감자바");
        List<String> list1 = new ArrayList(initList);

        for(String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1,2,3);

        for(int value : list2) {
            System.out.println(value);
        }
    }
}
