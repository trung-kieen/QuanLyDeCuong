import java.util.Scanner;

public class InputScanner {
   private final Scanner scanner;

   public InputScanner() {
      this.scanner = new Scanner(System.in);
   }

   public char getCharInput(String prompt) {
      System.out.print(prompt); // Display the prompt message
      return scanner.nextLine().charAt(0);
   }

   public String getStringInput(String prompt) {
      System.out.print(prompt);
      String s = scanner.nextLine();
      if (s.isEmpty()) {
         return "N/A";
      }
      return s;
   }

   public int getIntInput(String prompt) {
      System.out.print(prompt);
      while (true) {
         try {
            return Integer.parseInt(scanner.nextLine());
         } catch (NumberFormatException e) {
            System.out.print("Invalid inputAndCreate. Please enter a valid integer: ");
         }
      }
   }

   public boolean comfirm(String prompt, char preferOption) {

      System.out.print(prompt);
      switch (preferOption) {
         case 'y':
            System.out.print(" (Y/n): ");
            break;
         case 'n':
            System.out.print(" (y/N): ");
            break;
         default:
            preferOption = 'y';
            System.out.print(" (Y/n): ");
            break;
      }
      String s = scanner.nextLine();
      if (s.isEmpty()) {
         return (preferOption == 'y') ? true : false;
      }
      return (s.trim().charAt(0) == 'y') ? true : false;
   }
}
