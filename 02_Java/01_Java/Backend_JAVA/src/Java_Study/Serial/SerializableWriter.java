package Java_Study.Serial;

public class SerializableWriter {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;

        try {
            Serializer.Serialize(classA, "C:/Temp/Object.dat");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
