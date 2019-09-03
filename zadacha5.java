/*5. Ввести целые числа как аргументы командной строки, подсчитать их сум-
мы (произведения) и вывести результат на консоль..*/ 


package console;
import java.util.Scanner;
public class name {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число1: ");
        int num1 = in.nextInt();
        System.out.print("Введите число2: ");
        int num2 = in.nextInt();
          
        System.out.printf("Сумма num1+num2 = :"  +  (num1 + num2));
        System.out.printf("Произведение num1 х num2 = :"  +  (num1 * num2));
        in.close();

}
}