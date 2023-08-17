package org.galapagos.mcmorning.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void save(Object obj, String filePath) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(filePath); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(obj);
            oos.flush();
        }
    }
    public static Object load(String filePath) throws Exception{
        try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
            return ois.readObject();
        }
    }

}
