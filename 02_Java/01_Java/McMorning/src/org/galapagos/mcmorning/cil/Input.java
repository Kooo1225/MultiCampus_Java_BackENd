package org.galapagos.mcmorning.cil;

import java.util.Scanner;

public class Input {
    // 입력과 리턴만 하기 때문에 static 메서드를 사용할 에정이다
    static Scanner sc = new Scanner(System.in);

    // Facade Pattern : 복잡한 절차를 일반화 시켜서 하나의 외형으로 재구축 한 것
    // 번거로운 작업을 하나의 메서드로 대체 시킨 것
    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }
}
