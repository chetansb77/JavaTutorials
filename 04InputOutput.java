import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println(num);

        System.out.println("1. println ");
        System.out.println("2. println ");
    	
        System.out.print("1. print ");
        System.out.print("2. print \n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
    	
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
    	
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
        // closing the scanner object
        input.close();
    }
}
