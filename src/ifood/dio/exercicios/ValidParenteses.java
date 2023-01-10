package ifood.dio.exercicios;

import java.util.Scanner;

public class ValidParenteses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);

    }
    public static boolean ehValido(String s) {
        if (s.equals("[]")) {
            return true;
        }else if (s.equals("()")){
            return true;
        }else{
            return false;
        }
    }
}