import java.util.Scanner;
class Swap{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number a:");
        int a=s.nextInt();
        System.out.println("Enter 2nd number b:");
        int b=s.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
