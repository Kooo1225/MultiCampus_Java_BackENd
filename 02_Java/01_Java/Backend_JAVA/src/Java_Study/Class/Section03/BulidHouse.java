package Java_Study.Class.Section03;

public class BulidHouse {
    public static void main(String[] args){
        Block b1 = new Block();
        b1.x=50;
        b1.y=50;
        b1.color = "Gray";
        System.out.println(b1);

        b1.put();
    }
}
