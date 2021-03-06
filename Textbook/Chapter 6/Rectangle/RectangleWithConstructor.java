public class RectangleWithConstructor
{
  private double length;
  private double width;

  /**
    Constructor
    @param len The length of the rectangle.
    @param w   The width of the rectangle.
  */

  public RectangleWithConstructor(double len, double w)
  {
    length = len;
    width = w;
  }

  /**
    The getLength method returns a Rectangle object's length
    @param The value in the length field
  */

  public double getLength()
  {
    return length;
  }

  /**
    The getWidth method returns a Rectangle object's width
    @param The value in the width field
  */

  public double getWidth()
  {
    return width;
  }

  /**
    The getArea method returns a Rectangle object's area.
    @param The product of length times width
  */

  public double getArea()
  {
    return length*width;
  }
}
