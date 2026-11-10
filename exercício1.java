
import java.util.Locale;
import java.util.Scanner;

public class exercício1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        int total = 10;

        double somaIdade = 0, somaPeso = 0, somaRenda = 0;

        int pobres = 0;
        int medias = 0;
        int ricas = 0;

        for (int i = 1; i <= total; i++) {

            System.out.println("--- Pessoa " + i + " ---");

            System.out.print("Idade: ");
            somaIdade += sc.nextInt();

            System.out.print("Peso (kg): ");
            somaPeso += sc.nextDouble();

            System.out.print("Renda mensal (R$): ");
            double renda = sc.nextDouble();

            somaRenda += renda;

            if (renda < 3000) {
                System.out.println("Classificação: Pobre");
                pobres++;

            } else if (renda <= 10000) {
                System.out.println("Classificação: Média");
                medias++;

            } else {
                System.out.println("Classificação: Rica");
                ricas++;
            }
        }

        double mediaIdade = somaIdade / total;
        double mediaPeso = somaPeso / total;
        double mediaRenda = somaRenda / total;

        System.out.println("\n===== RESULTADOS =====");

        System.out.printf("Média de idade: %.1f anos%n", mediaIdade);
        System.out.printf("Média de peso: %.1f kg%n", mediaPeso);
        System.out.printf("Renda média: R$ %.2f%n", mediaRenda);

        System.out.println("\n===== CLASSIFICAÇÃO DO GRUPO =====");

        System.out.println("Pessoas pobres: " + pobres);
        System.out.println("Pessoas de classe média: " + medias);
        System.out.println("Pessoas ricas: " + ricas);

        sc.close();
    }
}
