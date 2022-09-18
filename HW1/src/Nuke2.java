import java.util.Scanner;

public class Nuke2 {
  public static void main(String[] args) {
    // Reads a String from the keyboard and prints the same string,
    // with its second character removed
    // Assume that the input string is at least 2 characters long
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(input.charAt(0) + input.substring(2));
  }
}
