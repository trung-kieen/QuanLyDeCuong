import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
      InputScanner scanner = new InputScanner();
      boolean agreement = scanner.comfirm("Do you agree", 'n');
      System.out.println(agreement);
   }
}
