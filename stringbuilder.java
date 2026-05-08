public class stringbuilder {
    public static void main(String[] args) {
        String s="madam";
        StringBuilder m=new StringBuilder(s);
        m.reverse();
        String f=m.toString();
        if(s.equals(f)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is Not palindrome");
        }
    }
}
