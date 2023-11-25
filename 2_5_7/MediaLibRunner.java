/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner {
  public static void main(String[] args) {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);

    myLib.addBook(myBook);

    myBook.setTitle("Harry Potter");
    myBook.setAuthor("Rowling");

    Movie myMovie = new Movie("Coco", "Pixar");
    myLib.addMovie(myMovie);

    System.out.println(myLib);

    // System.out.println("before test:" + newBook);
    // myLib.testBook(newBook);
    // System.out.println("after test:" + newBook);

    // System.out.println(newBook2.title); this line will cause an error as the
    // title inst. var. is private
  }
}