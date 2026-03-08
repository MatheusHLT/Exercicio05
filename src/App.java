// Nome: Matheus Honorato Leite Teixeira
// Matricula: 1261929133

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3; 

        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextDouble();

    double mediafinal = ((nota1 + nota2 + nota3) / 3);

        System.out.printf("Média: %.2f", mediafinal);

        scanner.close();
    }
}
