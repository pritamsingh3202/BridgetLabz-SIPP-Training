public class Book {
    // Attributes
    public String title;
    public String author;
    public double price;

    // Default Constructor
    public Book(){
        title= "Harry Potter";
        author = "J.K. Rowling";
        price = 20.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author= author;
        this.price= price;
    }

    // Display Book Details
    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price:" + price);
    }

    public static void main(String[] args) {
        // Create an object of Book class using default constructor
        Book book1 = new Book();
        System.out.println(" Book 1: ");
        book1.displayBookDetails();
        
        // Create an object of Book class using parameterized constructor
        
        Book book2 = new Book("Bhagvat Git", "Ved Vyas", 50.0);
        System.out.println("\n Book 2: ");
        book2.displayBookDetails();
    }
}
