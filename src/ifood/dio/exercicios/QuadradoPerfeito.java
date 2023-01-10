package ifood.dio.exercicios;

import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int resposta, count, countTotal;
        int[] d = new int[n + 1];
        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        for (int i = 0; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        countTotal = 1000;
        for (int i = d.length - 1; i > 0 && i <= n; i--) {
            if (i > 0 && d[i] > 0) {
                resposta = n;
                count = 0;
                for (int j = i; j > 0; j--) {

                    while (resposta > 0) {
                        if (resposta >= d[j]) {
                            resposta = resposta - d[j];
                            count++;
                        } else {
                            j--;
                        }
                    }
                }
                if (countTotal > count) {
                    countTotal = count;
                }
            }
        }
        System.out.println(countTotal);

    }
}
