import java.util.Scanner;
public class string {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     a=scanner.nextLine();
     b=a.toLowercase();
    if (isPalindrome(b)){
        System.out.println("is palindrome");
    }else{
        System.out.println("not a palindrome ");
    }
        
    }
}