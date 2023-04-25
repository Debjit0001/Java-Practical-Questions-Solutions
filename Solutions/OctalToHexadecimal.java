package JAVA_PROGRAM_CLG;

import java.util.Scanner;

public class OctalToHexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        
        int decimal = Integer.parseInt(octal, 8);

        
        String hex = Integer.toHexString(decimal);

        System.out.println("Hexadecimal equivalent: " + hex);
    }
}

