/*5. ������ ����� ����� ��� ��������� ��������� ������, ���������� �� ���-
�� (������������) � ������� ��������� �� �������..*/ 


package console;
import java.util.Scanner;
public class name {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����1: ");
        int num1 = in.nextInt();
        System.out.print("������� �����2: ");
        int num2 = in.nextInt();
          
        System.out.printf("����� num1+num2 = :"  +  (num1 + num2));
        System.out.printf("������������ num1 � num2 = :"  +  (num1 * num2));
        in.close();

}
}