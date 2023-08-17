package Java_Study.Serial;

public class SerializableReader {
    public static void main(String[] args) {

        try {
            //명시적 캐스팅, return type 이 Object였으니까 다운 캐스팅 해줘야해서 명시적 캐스팅 하는것
            ClassA v = (ClassA) Serializer.Deserialize("C:/Temp/Object.dat");

            System.out.println("Field1 : " + v.field1);
            System.out.println("Field2 : " + v.field2.field1);
            System.out.println("Field3 : " + v.field3);
            System.out.println("Field4 : " + v.field4);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
