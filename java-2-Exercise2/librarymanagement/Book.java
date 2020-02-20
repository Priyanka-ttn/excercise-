package librarymanagement;

public class Book {
    private int book_serial_num;
    private String book_name;
    private String author;
    private String book_type;

    public Book(int book_serial_num, String book_name, String author, String book_type) {
        this.book_serial_num = book_serial_num;
        this.book_name = book_name;
        this.author = author;
        this.book_type = book_type;
    }

    public int getBook_serial_num() {
        return book_serial_num;
    }

    public void setBook_serial_num(int book_serial_num) {
        this.book_serial_num = book_serial_num;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }
}
