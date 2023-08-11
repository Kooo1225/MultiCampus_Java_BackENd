package Java_Study.Collection.List;

import java.util.*;

public class ArrayListExample {
    public ArrayListExample(List<String> initList) {
    }

    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();

        list.add("JAVA");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "DataBase");
        list.add("iBATIS");

        System.out.println(list);

        int size = list.size();
        System.out.println("All Instance : " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("[ 2 ] : " + skill);
        System.out.println();

        for(int i=0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();


    }
}
