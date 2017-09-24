import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int result = 0;
         while (number > 0){
             result += number % 10;
             number *= 0.1;
         }
        System.out.println("Sum: " + result);
    }

}
