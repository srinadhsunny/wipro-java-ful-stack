import java.util.Scanner;
public class Return {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter  string");
        String str=scanner.nextLine();
        int n = str.length();
        if (n%2==0) {
            String s=str.substring(0, n/2);
            System.out.println(s);
        }else{
            System.out.println("0");
        }

    } 
}