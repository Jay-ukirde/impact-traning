import java.util.Scanner;

public class sum_digits_single_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num >= 10){
            int sum = 0;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println(num);
    }
}START
  INPUT n  // size of the array
  CREATE array arr of size n

  PRINT "Enter the elements of the array:"
  FOR i = 0 to n-1
    INPUT arr[i]
  END FOR

  CREATE empty set distinctElements

  FOR each element in arr
    ADD element to distinctElements
  END FOR

  PRINT "There are " + size of distinctElements + " distinct elements in the array."
END