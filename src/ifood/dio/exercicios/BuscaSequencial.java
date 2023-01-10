package ifood.dio.exercicios;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        BuscaSequencial sequencial = new BuscaSequencial();

        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        sequencial.buscaSequencial(x,elementos);
    }
    public void buscaSequencial(int x,int[] elementos){
         int count = 0;

         for (count=0; count < elementos.length; count++){
             //verifica se o elemento que está procurando se encontra no vetor
             if (elementos[count] == x){
                 System.out.println("Achei " + x + " na posicao " + count);
                 break;
             }
         }
             if (count >=elementos.length){
                 System.out.println("Numero " + x + " nao encontrado!");
             }

    }
}
