package in.athenaeum.sbdemo.models;

public class Book {
    private int id;
    private String title;
    private String edition;
    private int year;
    private double price;

    public Book(int id, String title, String edition, int year, double price) {
        this.id = id;
        this.title = title;
        this.edition = edition;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEdition() {
        return edition;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
