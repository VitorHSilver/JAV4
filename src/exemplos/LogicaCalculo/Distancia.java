package LogicaCalculo;

import java.util.Locale;
import java.util.Scanner;



public class Distancia {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Locale.setDefault(Locale.US);   
     int CarroX = 60;
     int CarroY = 90;
     System.out.println("qual a distancia:  ");
     int distancia = sc.nextInt();
     int velocidade = CarroX - CarroY;
     int diferenca = (distancia/velocidade)* 60;

     System.out.println("a distancia é "+ diferenca + " Minutos");

     sc.close();  
    } /** fecha o main */
}
