//4. Enter the password from the command line and compare it with the sample string.


package console;
import java.util.Scanner;
public class name {
    public static void main( String[] args){
        String s1="Test";
        System.out.println("Enter your password and click  <Enter>: ");
        Scanner scan = new Scanner(System.in);
        String passvord = scan.nextLine();
        if (passvord.equals(s1))
        System.out.println("Password is correct ");
        else
        System.out.println("Wrong password ");
scan.close();
}
}