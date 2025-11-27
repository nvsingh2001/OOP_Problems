package bookmanagementsystem;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private boolean available;

    public Book(int id,String title, String author, boolean avaiable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = avaiable;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
