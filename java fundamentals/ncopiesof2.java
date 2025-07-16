import java.util.Scanner;
public class Ncopiesof2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter  string");
        String str=scanner.nextLine();
        String d=str.substring(0, 2);
        int n =str.length();
        int i=0;
        while (i<=n-1) {
            System.out.print(d);
            i++;
            
        }

    }

    
}