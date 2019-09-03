//1. Greet any user by entering their name through the command line.




package console;
import java.util.Scanner;
public class name {
    public static void main( String[] args){
        System.out.println("Enter your name and push <Enter>: ");
        Scanner scan = new Scanner(System.in);
String name = scan.next();
System.out.println("Hello, " + name);
scan.close();
}
}