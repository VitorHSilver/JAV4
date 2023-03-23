import java.util.Scanner;

public class Acoes {
     public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        
        String[] nome = new String[3];
        int[] qtd = new int[3];
        double[] valores = new double[3];

        for(int i=0; i < 3; i++){

            // entrada de nome da ação
            System.out.println("nome da ação" + (i+1) + ":");
            nome[i]=sc.nextLine();

            // entrada de quantidades
            System.out.println("quantidade ação" + (i+1) + ":");
           qtd[i]=sc.nextInt();

            // entrada de valores
            System.out.println("Preço ação" + (i+1) + ":");
            valores[i]=sc.nextDouble();

            sc.nextLine();
        } // fecha for

        // calcular
        // Valor é multiplicado e acrescentado no total1
         double total1 = 0;
         for(int i=0; i < 3; i++){
            total1 += qtd[i]*valores[i];
            
         } 
         
         // print 
         for(int i = 0; i <3; i++){
             System.out.printf("%s , %d quantidades de ações, preço unitario R$ %.2f %n ",nome[i],qtd[i],valores[i]);
         }
         double Apagar = total1;
         System.out.printf("Total a pagar %.2f : ",Apagar);

        sc.close();
     }// main

} // classe
