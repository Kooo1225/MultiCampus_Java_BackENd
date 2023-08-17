package Java_Study.Collection.Map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception{
        // Map<String,String> 과 같은 클래스 객체를 생성한다
        Properties properties = new Properties();
        // Resource 폴더에서 "database.properties" 파일에서 Path를 추출하는 과정
        String path = PropertiesExample.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("pssword");

        System.out.println("Driver : " + driver);
        System.out.println("Url : " + url);
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);


    }
}
