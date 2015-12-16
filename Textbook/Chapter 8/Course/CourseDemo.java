/**
  This program demonstrates the Course class.
*/

public class CourseDemo
{
  public static void main(String[] args)
  {
      // Create an Instructor object.
      Instructor myInstructor = new Instructor("Karmer", "Shawn", "RH3010");

      // Create a TextBook object
      TextBook myTextbook = new TextBook("Starting Out with Java", "Gaddis", "Pearson");

      // Create a Course object
      Course myCourse = new Course("Intro to Java", myInstructor, myTextbook);

      // Display the course information
      System.out.println(myCourse);
  }
}
