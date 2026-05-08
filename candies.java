import java.util.Scanner;
public class candies {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int K=s.nextInt();
        int input=s.nextInt();
        if(input>K||input<=0){
            System.out.println("Invalid Input");
        }
        else{
            int N=T-input;
            if (N<=K){
                N=T;
        }
        System.out.println("Number of candies sold:"+input);
        System.out.println("number of candies vailable"+N);
    }
    }
}
