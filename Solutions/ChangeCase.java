import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = input.nextLine();
        input.close();

        String newLine = "";

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (Character.isUpperCase(c)) {
                newLine += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                newLine += Character.toUpperCase(c);
            } else {
                newLine += c;
            }
        }

        System.out.println("Changed case: " + newLine);
    }
}
