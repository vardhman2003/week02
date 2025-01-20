public class Book1 {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default Constructor
    public Book1() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized Constructor
    public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating books
        Book1 book1 = new Book1("1984", "George Orwell", 15.99, true);
        Book1 book2 = new Book1("To Kill a Mockingbird", "Harper Lee", 12.99, false);

        // Displaying book details
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();

        // Borrowing books
        System.out.println("\nAttempting to borrow Book 1:");
        book1.borrowBook();

        System.out.println("\nAttempting to borrow Book 2:");
        book2.borrowBook();

        // Displaying book details after borrowing
        System.out.println("\nUpdated Book 1 Details:");
        book1.displayBookDetails();
    }
}
