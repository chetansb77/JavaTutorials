import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.DayOfWeek;

class ControlFlow {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        // If else statements
        if (x > y && x > z) {
            System.out.println("x is the largest number.");
        } else if (y > x && y > z) {
            System.out.println("y is the largest number.");
        } else {
            System.out.println("z is the largest number.");
        }

        // Ternary Operator
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double marks = input.nextDouble();

        String result = marks > 30 ? "passed" : "failed";
        
        System.out.println("You have " + result);

        // For loops
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration " + i);
        }

        // Display Sum of n Natural Numbers
        int sum = 0;
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " numbers = " + sum);

        input.close();

        // For each loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Sum of " + Arrays.toString(numbers) + " is " + total);

        // Do while loop
        int i = 1;
        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i <= 10);

        // while loop
        int j = 1;
        while (j <= 10) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Switch statements
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        String dayName;
        switch (dayOfWeekNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + dayOfWeekNumber + " is " + dayName);
    }
}