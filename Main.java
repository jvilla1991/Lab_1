import java.util.Scanner;

// Task: Calculates the perimeter and area of various classrooms(Or, any room) at Grand Circus based on user input

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double height = 0.0;
        double volume = 0.0;
        double perimeter = 0.0;
        double area = 0.0;
        boolean b = true;
        String a = " ";


        do { // Gather the variables needed for calculations
            System.out.print("Enter the length of Grand Circus classroom: ");
            length = scnr.nextDouble();
            if (length == 0.0)
            {
                break;
            }
            System.out.print("Enter the width of Grand Circus classroom: ");
            width = scnr.nextDouble();
            if (width == 0.0)
            {
                break;
            }
            System.out.print("Enter the height of a Grand Circus classroom: ");
            height = scnr.nextDouble();
            if (height == 0.0)
            {
                break;
            }

            // Execute the calculations using the variables entered by the user
            perimeter = (width * 2.0) + (length * 2.0);
            area = length * width;
            volume = length * width * height;

            // Return the result to the user
            System.out.println("The Perimeter of the Grand Circus classroom is: " + perimeter);
            System.out.println("The Area of the Grand Circus classroom is: " + area);
            System.out.println("The Volume of the Grand Circus classroom is: " + volume);
            System.out.println("");
            System.out.println("Do you wish to continue? (y/n)?");
            a = scnr.next();

            // Ask the user to calculate again
            if ("y".equalsIgnoreCase(a))
            {
                continue;
            }
            else
            {
                b = false;
            }

        } while (b == true);

        return;

    }
}
