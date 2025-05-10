public class reverseDigits {
    public static void main(String[] args) {
        int num = 345;

        int last = num % 10;
        int first = num / 100;
        int middle = (num / 10) % 10;

        System.out.println("Reversed number: " + last + middle + first);
    }
}