package Java_Study.Class.Section03;

public class Block {
    int x = 10;
    int y = 20;
    String color = null;

    public void put(){
        int move = 50;
        System.out.println(move + " Block pile up!");
    }

    @Override
    public String toString() {
        return "Block{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

}
