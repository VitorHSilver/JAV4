import java.util.Scanner;

public class CalcTabela {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);


    int cod;
    int qtd;
    double total;    

    System.out.println("--------------------------");
    System.out.println("Bem vindo");
    System.out.println("Escolha seu pedido:");
    cod=sc.nextInt();
    System.out.println("Quantidade:");
    qtd=sc.nextInt();
 
     if(cod == 1){
            System.out.println("Cachorro quente");
            total = qtd*4.0;
            System.out.println(total);
     }else if(cod == 2){
            System.out.println("X-Salada");
            total = qtd*4.5;
            System.out.println(total);
     }else if(cod == 3){
            System.out.println("X-Bacon");
            total = 5.0*qtd;
            System.out.println(total);
     }else if(cod == 4){
            System.out.println("Torrada Simples");
            total = qtd*2.0;
            System.out.println(total); 
     }else{
            System.out.println("Refrigerante");
            total = qtd*1.5;
              
     System.out.printf("total: R$ %.2f%n",total);
     sc.close();
     }
  }
}