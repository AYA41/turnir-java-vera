public class Book {
    private String title;
    private String author;
    private int publishYear;

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void print() {
        System.out.println("title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear);
    }
}
