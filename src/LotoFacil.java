import java.util.Scanner;



public class LotoFacil {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] jogo1 = {1, 2, 3, 5, 7, 8, 10, 11, 12, 16, 17, 18, 21, 24, 25};
        //int[] jogo2 {2, 3, 4, 5, 7, 8, 10, 11, 12, 16, 17, 18, 21, 24, 25}
        int numRepetidos = 0;
        int[] num_dia = new int[15];
        
        System.out.println("Digite os números de hoje:");
        String Line = sc.nextLine();
        String[] numbers = Line.split(" ");

        for(int i = 0; i <jogo1.length; i ++){
                num_dia[i] = Integer.parseInt(numbers[i]);
        for(int j = 0; j <num_dia.length; j ++)
                if(num_dia[j] == jogo1[i]) 
                numRepetidos++;
                
           
    }

    if(numRepetidos >= 13)
        System.out.println("Ganhou algo!");

        System.out.printf("Acerto %d pontos",numRepetidos);
    sc.close();  
}
}
    
