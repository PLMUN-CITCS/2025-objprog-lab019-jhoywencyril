public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative integer.");
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }
        scanner.close();
        return number;
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
