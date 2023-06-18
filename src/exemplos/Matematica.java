import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        
    Scanner a = new Scanner(System.in);

    int A,B,C,D , dife; 
    System.out.println("Digite valor A:");
    A=a.nextInt();

    System.out.println("Digite valor B");
    B=a.nextInt();

    System.out.println("Digite valor C");
    C=a.nextInt();

    System.out.println("Digite valor D");
    D=a.nextInt();

    dife = A*B-C*D; 

    System.out.println("Essa é sua diferença:"+dife);
    a.close();

        



        
    }
}
