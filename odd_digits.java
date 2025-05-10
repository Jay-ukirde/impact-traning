import java.util.Scanner;

public class odd_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int odd_count = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            int temp = i; 

            
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }

            
            if (count % 2 == 1) {
                odd_count++;
            }
        }

        System.out.println("Count of numbers with an odd number of digits: " + odd_count);
    }
}