/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
  private Book book;
  private Movie movie;

  public void addBook(Book b) {
    book = b;
  }

  public void addMovie(Movie m) {
    movie = m;
  }

  public String toString() {
    String info = "";
    if (book != null) {
      info += "Book: " + book.toString();
    }
    if (movie != null) {
      info += "\n" + "Movie: " + movie.toString();
    }

    return info;
  }

  void testBook(Book test) {
    test.setTitle("test title");
  }
}