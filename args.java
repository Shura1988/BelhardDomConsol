2. Display command line arguments in the reverse order in the console window.

public class args{
public static void main( String[] args){
       
       for (int i=args.length-1; i>=0; i--)
            System.out.println("Reverse : " + args[i]);
}
}
