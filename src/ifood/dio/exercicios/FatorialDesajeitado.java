package ifood.dio.exercicios;

import java.util.Scanner;


public class FatorialDesajeitado {
    public static void main(String args[]) {

        //TODO: Cálculo do valor do Fatorial Desajeitado de "numero".
        int n;
        Scanner entrada = new Scanner(System.in);
        n = Integer.parseInt(entrada.nextLine());
        int result = 0;
        int cnt = 1;
        int tmp = n;

        while (cnt <= n) {
           tmp = tmp * n;
           n --;
            if (n != 0) {
               tmp = tmp / n;
               n --;
            }
             tmp = tmp + n;
             n--;
             result = result - tmp;
             tmp = tmp - n;
              if (n == 1) {
                  result = result + tmp;
              }
              n--;
        }
        System.out.println(result);

    }
}

