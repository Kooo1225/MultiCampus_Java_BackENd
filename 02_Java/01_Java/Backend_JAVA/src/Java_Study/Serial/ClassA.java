package Java_Study.Serial;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();
    // static 과 transient 는 직렬화에 포함되지 않는 변수
    static int field3;
    transient int field4;
}
