public class Test2 {
   public static void main(String[] args) {
      System.out.print("Please enter a string: ");
      String stringInput = System.console().readLine();
      int stringLength = stringInput.length();
      for (int charIndex = 0; charIndex < stringLength; charIndex++) {
         char c = stringInput.charAt(charIndex);
         System.out.println(c);
      }
   }
}
