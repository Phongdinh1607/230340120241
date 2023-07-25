import java.util.Scanner;

public class ThreeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);

        int sum = largest;

        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the largest number is: " + sum);

        scanner.close();
    }

    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
