package inflearn.basic1.construct;

public class Book {

    private String title;
    private String name;
    private int page;

    public Book() {
        this("","",0);
    }
    public Book(String title, String name) {
        this(title, name, 0);
    }
    public Book(String title, String name, int page) {
        this.name = name;
        this.title = title;
        this.page = page;
    }

    void displayInfo() {
        System.out.println(title + name + page);
    }
}

class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("", "", 0);
        book1.displayInfo();

        Book book2 = new Book("안녕" , "박건" , 0);
        book2.displayInfo();

        Book book3 = new Book("안녕요" , "박건욱" , 0);
        book3.displayInfo();
    }
}
