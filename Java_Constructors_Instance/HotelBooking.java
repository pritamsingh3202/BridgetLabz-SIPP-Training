public class HotelBooking {
    // Attributes
    public String guestName;
    public String roomType;
    public int roomNumber;
    public int nights;

    // Default constructor
    public HotelBooking() {
        guestName ="Samarth Prakash Shakya";
        roomType ="Bouble Bed Room";
        roomNumber = 101;
        nights = 1;
    }
    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int roomNumber, int nights) {
        this.guestName = guestName;
        this.roomType= roomType;
        this.roomNumber= roomNumber;
        this.nights= nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking hotelBooking) {
        this.guestName = hotelBooking.guestName;
        this.roomType = hotelBooking.roomType;
        this.roomNumber= hotelBooking.roomNumber;
        this.nights= hotelBooking.nights;
    }
    // Display the booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Nights  : " + nights);
    }

    public static void main(String[] args) {

        HotelBooking booking1 = new HotelBooking();
        System.out.println("=== First Preson Details===");
        booking1.displayBookingDetails();
        // Parameterize Constructor
        HotelBooking booking2 = new HotelBooking("Himanshu Mishra", "Single Bed Room", 102, 2);
        System.out.println("===Second Preson Booking Details===");
        booking2.displayBookingDetails();
        // Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking1);
        System.out.println("===Third Preson Booking Details===");
        booking3.displayBookingDetails();
    }

}
