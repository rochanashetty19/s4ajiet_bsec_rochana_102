import java.util.Scanner;
public class larger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=132;
        int max=0;
        while (n>0){
            int digit=n%10;
            if(digit>max){
                max=digit;
            }
        n=n/10;
        }
        System.out.println(max);
    }
}
