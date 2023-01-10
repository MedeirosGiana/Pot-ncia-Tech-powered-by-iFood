package ifood.dio.exercicios;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ChecagemPolidromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palidromo = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
           palidromo += palavra.charAt(i);
        }
        if (palidromo.equals(palavra)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
