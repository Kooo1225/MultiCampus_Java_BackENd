package Java_Study.String;

public class Replace {
    public static void main(String[] args) {
        String fileName = "Hello.World.mp3";
        int ix = fileName.lastIndexOf('.');
        if (ix != -1){
            String ext = fileName.substring(ix+1);
            String ext2 = fileName.substring(0,ix);
            System.out.println(ext);
            System.out.println(ext2);
        }
    }
}
