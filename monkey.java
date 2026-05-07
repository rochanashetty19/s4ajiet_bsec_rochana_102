import java.util.Scanner;
public class monkey {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int k = s.nextInt(); 
        int j = s.nextInt(); 
        int m = s.nextInt(); 
        int p = s.nextInt(); 
        if (n <= 0|| k <= 0|| j <= 0|| m < 0|| p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        int mb = m / k;
        if (m % k != 0) {
            mb++;
        }
        int mp = p / j;
        if (p % j != 0) {
            mp++;
        }
        int monkeysDown = mb + mp;
        int monkeysLeft = n - monkeysDown;
        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }
        System.out.println("Number of Monkeys left on the tree:" + monkeysLeft);
    }
}
