public class Test {
   public static void main(String[] args) {
      System.out.print("Please enter a string: ");
      String stringInput = System.console().readLine();
      int stringLength = stringInput.length();
      System.out.println("The number of characters is: " + stringLength);
   }
}
