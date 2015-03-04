import java.text.NumberFormat;
import java.util.Locale;
public class Test {
   public static void main(String[] args) {
      int number = 1234567;
      NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
      String numberAsString = numberFormat.format(number);
      System.out.println(numberAsString);
   }
}
