/*
 * Activity 2.5.7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie {
  private String title;
  private String author;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, String a) {
    title = t;
    author = a;
    rating = 0;
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }

  public String toString() {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int a) {
    if ((rating + a) > 10 || (rating + a) < 0)
      return;
    else {
      rating += a;
    }
  }

  public boolean equals(Movie b) {
    return (b.author == this.author && b.title == this.title);
  }
}
