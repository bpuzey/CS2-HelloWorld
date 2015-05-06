import java.util.Scanner;

public class HelloWorld
{
  private static Scanner in = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("Name? >");
    String x = in.nextLine();
    System.out.println("Goodbye");
  }
}
