public class fullName2
{
  public static void main(String[] args)
  {
    String fullName1;
    String fullName2;
    String firstName = "Timothy ";
    String lastName = "Haynes";

    fullName1 = firstName + lastName;

    fullName2 = firstName.concat(lastName);

    System.out.println(fullName1);
    System.out.println(fullName2);
  }
}
