public class fullName
{
  public static void main(String[] args)
  {
      String fullName = "Cynthia Susan Lee";
      String lastName = fullName.substring(14);
      String middleName = fullName.substring(8,13);

      System.out.println("The full name is " + fullName);
      System.out.println("The last name is " + lastName);
      System.out.println("The middle name is " + middleName);

      char[] nameArray1 = new char[5];
      fullName.getChars(8, 13, nameArray1, 0);

      System.out.println("\nThe full name is " + fullName);
      System.out.println("The values in the array are: ");
      for (int i = 0; i < nameArray1.length; i++)
        System.out.print(nameArray1[i] + " ");

      char[] nameArray2;

      nameArray2 = fullName.toCharArray();
      System.out.println("\nThe full name is " + fullName);
      System.out.println("The values in the array are: ");
      for (int i = 0; i < nameArray2.length; i++)
        System.out.print(nameArray2[i] + " ");

  }
}
