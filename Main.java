/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        int soma = numeroUm + numeroDois;

        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}
