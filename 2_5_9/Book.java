public class Book {
    private String title;
    private String author;
    private double price;

    /**
     * Constructor for the Book class
     */
    public Book (String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Returns price of book
     */
    public double getPrice() {
        return price;
    }

    /**
     * Decreases book price by the given amount byPercent
     */
    public void giveDiscount(double byPercent) {
        price *= (100 - byPercent);
    }
}
