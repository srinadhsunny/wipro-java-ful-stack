import java.util.Scanner;
public class Stringconcat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter fyst string");
        String s1=scanner.nextLine();
        System.out.println("enter secound string");
        String s2=scanner.nextLine();
        String r=s1.concat(s2);
        String rf=r.toLowerCase();
        System.out.println("concatinated string is " + rf);

    }

    
}