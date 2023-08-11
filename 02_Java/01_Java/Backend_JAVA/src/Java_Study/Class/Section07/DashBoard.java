package Java_Study.Class.Section07;

public class DashBoard {
    static int number;
    private String title;
    private String content;
    private String writer;
    private int serial;

    public DashBoard(String title, String content, String writer){
        super();

        number++;
        serial = number;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public int getNumber() {
        return serial;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "DashBoard{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
