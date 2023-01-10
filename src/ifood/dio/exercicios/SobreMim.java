package ifood.dio.exercicios;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();



        System.out.println("OLÁ! Eu me chamo "+nome + " " + sobreNome);
        System.out.println("Minha idade é: "+ idade + " anos");
        System.out.println("Minha altura é: "+ altura + " cm");

    }
}
