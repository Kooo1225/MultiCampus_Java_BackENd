package Java_Study.FileIO;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

// 파일 확장자가 .txt인지 여부 판단
class TextFileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        System.out.println("필터링 :" + name);
        return name.toLowerCase().endsWith(".txt"); // endsWith의 리턴 타입은 boolean
    }
}

public class FileExample {
    public static void main(String[] args) throws Exception {
        File temp = new File("C:/Temp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        File[] contents = temp.listFiles(new TextFileFilter());

        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            }
            else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
