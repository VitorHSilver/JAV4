package String;
public class FuncString {
    public static void main(String[] args) {

        /* Tipos de Funções para String */
        String original = "vitor HENRIQUE DA silva     ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(1, 10);
        String s06 = original.replace('i', 'a');
        String s07 = original.replace("vit", "hon");
        int i = original.indexOf("to");
        int j = original.lastIndexOf("to");

        /* Imprimindo em tela */
        System.out.println("Original - " + original + "-");
        System.out.println("Minúsculo: - " + s01 + "-");
        System.out.println("Maiúsculo: - " + s02 + "-");
        System.out.println("Tira espaçamento: - " + s03 + "-");
        System.out.println("Pegando do 2° caracter em diante: - " + s04 + "-");
        System.out.println("Pegando do 1° caracter até o 10° carater (recortando): - " + s05 + "-");
        System.out.println("Troca um caracter por outro: - " + s06 + "-");
        System.out.println("Trocando 'vit' por 'hon': - " + s07 + "-");
        System.out.println("Grupo daquele i:" + i);
        System.out.println("Último index chamado: - " + j);

        /* Operação Split */

        String s = "Vitor Henrique da Silva";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[3];

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[3]);
    }
}
