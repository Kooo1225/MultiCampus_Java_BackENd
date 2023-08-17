package Java_Study.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("Entry : " + map.size());

        // 객체 찾기
        System.out.println("\t홍길동 : " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        // iterator 를 사용한 객체 처리
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);

            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // for-each를 사용한 객체 처리
        for ( String key : map.keySet() ) {
            Integer value = map.get(key);

            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("Entry : " + map.size());
    }
}
