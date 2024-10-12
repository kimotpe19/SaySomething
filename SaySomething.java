// Program: SaySomething
// Description: A cowsay-inspired program that displays the inputted text in a speech bubble.

import java.util.Scanner; // Imports Scanner utility.

public class SaySomething {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in); // Creates new scanner.
        // Startup information
        System.out.println("SaySomething"); 
        System.out.println("(0) 2024 kimotpe19. No rights reserved.");
        System.out.println("This program is licensed under the MIT License.");

        // Main program
        while (true) {
            System.out.print("What do you want me to say?: ");
            String say = kbd.nextLine();

            if (say.equals("!exit")) {
                System.out.println("Are you sure you want to exit? (y/n)");
                String exitconfirm = kbd.next();

                if (exitconfirm.equalsIgnoreCase("y")) {
                    break; // Exits program.
                } else if (exitconfirm.equalsIgnoreCase("n")) {
                    continue; // Continues SaySomething.
                }
            } else {
                int boxlength = say.length();
                System.out.println(" " + "_".repeat(boxlength)); // Adds a blankspace & repeats "_" with variable boxlength.
                System.out.println("/" + " ".repeat(boxlength) + "\\");
                System.out.println("|" + say + "|");
                System.out.println("\\" + "_".repeat(boxlength - 3) + "  /"); // Repeats "_" via boxlength except subtracted by 3.
                System.out.println(" ".repeat(boxlength - 2) + "\\/");  
            }
        }

        kbd.close();
    }
}
