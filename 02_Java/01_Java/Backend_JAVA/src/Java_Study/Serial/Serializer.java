package Java_Study.Serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    public static void Serialize(Object obj, String filePath) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(filePath); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(obj);
            oos.flush();
        }
    }
    public static Object Deserialize(String filePath) throws Exception{
        try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
            return ois.readObject();
        }
    }
}
