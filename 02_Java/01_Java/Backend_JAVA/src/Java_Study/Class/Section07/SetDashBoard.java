package Java_Study.Class.Section07;

public class SetDashBoard {

    public static void main(String[] args){
        DashBoard[] board = { new DashBoard("java", "fun java", "park"),
                new DashBoard("jsp","fun jsp", "hong"),
                new DashBoard("spring","fun spring", "kim")
        };
        System.out.println("DashBoard");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-15s\n", "no", "title", "content", "writer");
        System.out.println("----------------------------------------------------------------");

        for(DashBoard d:board){
            System.out.printf("%-8d %-15s %-15s %-15s\n", d.getNumber(), d.getTitle(), d.getContent(), d.getWriter());
        }
    }
}
