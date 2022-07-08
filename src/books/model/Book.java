package books.model;

public class Book {
    private double price;
    private int count;
    private String genre;
    private String title;
    private Author authorName;

    public Book(String title, Author authorName, double price, int count, String genre) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.count = count;
        this.genre = genre;
    }

    public Book() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
