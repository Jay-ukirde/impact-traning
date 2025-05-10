import java.util.Scanner;

public class Meatball {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        
        if (num >= 100 && num <= 999) { 
            int middleDigit = (num / 10) % 10; 
            if (middleDigit % 3 == 0) {
                System.out.println("The number is TRENDY.");
            } else {
                System.out.println("The number is NOT TRENDY.");
            }
        } else {
            System.out.println("The number is not a 3-digit number.");
        }

    }

}


