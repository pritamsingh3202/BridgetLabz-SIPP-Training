public class LibraryBook {
    // Attributes
    public String title;
    public String author;
    public double price;
    public boolean isAvailable;
    // Constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author= author;
        this.price= price;
        this.isAvailable= isAvailable;
    }
    // Method to borrow a book
    public void borrowBook() {
        if(isAvailable){
            isAvailable= false;
            System.out.println("Book borrowed successfully" + title);
        }else{
            System.out.println("Book is not available");
        }
    }
    // Display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title +", Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Available: "+isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Wings of Fire", "A.P.J. Abdul Kalam", 200.0, true);
        System.out.println("=== Book Details ===");
        book1.displayBookDetails();
        book1.borrowBook();

        LibraryBook book2= new LibraryBook("Panchtantra", "Munshi Premchand", 150.0, false);
        System.out.println("=== Book Details ===");
        book2.displayBookDetails();
        book2.borrowBook();
    }

}
