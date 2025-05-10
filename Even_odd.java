import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        if (num>=20){
            if (num % 2 == 0) {
                System.out.println("EVEN");
            }else{
                System.out.println("odd");
            }
            System.out.println("greater than 20");
        }else {
            System.out.println("less than 20");
        }
    }
}