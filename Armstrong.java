import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int rem = num % 10;
            result += Math.pow(rem, digits);
            num = num / 10;
        }
        if (result == original) {
            System.out.println(original + " is an Armstrong number");
        } 
        else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
