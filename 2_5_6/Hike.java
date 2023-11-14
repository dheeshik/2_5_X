/*
 * Activity 2.5.6
 */

public class Hike
{
  private String name;
  private double miles;
  private int elevation;

  /**
   * A constructor for the Hike class
   *
   * @param name The name of this hike
   * @param miles The length of this hike in miles
   * @param elevation The elevation gain of the hike in feet
   */
  public Hike(String name, double miles, int elevation)
  {
    this.name = name;
    this.miles = miles;
    this.elevation = elevation;
  }

  /**
   * Gets the name of this hike
   * 
   * @return the name of the hike
   */
  public String getName()
  {
    return name;
  }

  /**
   * Gets the miles in this hike
   * 
   * @return the length of the hike in miles
   */
  public double getMiles()
  {
    return miles;
  }

  /**
   * Gets the elevation gain of this hike
   * 
   * @return the elevation gain in feet
   */
  public double getElevation()
  {
    return elevation;
  }

   /**
   * Determines if the current hike is longer than another hike
   * 
   * @param h The hike to use in the comparison
   * @return true if the current hike is longer
   */ 
  public boolean isLongerThan(Hike h)
  {
    if (miles > h.getMiles())
      return true;
    else
      return false;
  }
  
  /**
   * Determines if the current hike has more elevation gain than another
   * 
   * @param h The hike to use in the comparison
   * @return true if the current hike has more elevation gain
   */
  public boolean isHigherThan(Hike h)
  {
    if (elevation > h.getElevation())
     return true;
   else
     return false;
  }

  /**
   * Return the string representation of the hike
   * 
   * @return Describes the name, miles, and elevation of the hike
   */
  public String toString() 
  {
    return name + " is " + miles + " miles and gains " + elevation + " feet."; 
  }

}