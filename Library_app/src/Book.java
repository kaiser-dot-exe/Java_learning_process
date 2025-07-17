public class Book {
    private String name;
    private String author;
    private int id;
    private boolean available;

    public Book(String name, String author, int id) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.available = false;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public boolean getAvaliable() {
        return available;
    }

    public void setAvailable() {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Kitap ismi: " + name + "\n" +
                "Kitabın yazarı : " + author + "\n" +
                "Kitap durumu:  " + available;

    }

}
