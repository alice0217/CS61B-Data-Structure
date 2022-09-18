/* OpenCommercial.java */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * A class that provides a main function to read five lines of a commercial
 * Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /**
   * Prompts the user for the name X of a company (a single string), opens
   * the Web site corresponding to www.X.com, and prints the first five lines
   * of the Web page in reverse order.
   *
   * @param arg is not used.
   * @throws Exception thrown if there are any problems parsing the
   *                   user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    // print only five lines from the given home page
    // print them in reverse order

    // don't need to deal with exceptions at the moment
    URL u = new URL("http://www." + inputLine + ".com");
    InputStream ins = u.openStream();
    InputStreamReader isr = new InputStreamReader(ins);
    BufferedReader website = new BufferedReader(isr);
    String content = website.readLine();
    String[] lines = new String[5];
    int number = 0;
    while (number < 5 && content != null) {
      lines[number] = content;
      content = website.readLine();
      number += 1;
    }
    for (int i = 4; i >= 0; i--) {
      System.out.println(lines[i]);
    }
  }
}
