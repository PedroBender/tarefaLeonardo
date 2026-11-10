
import java.util.Locale;
import java.util.Scanner;

public class exercício2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        int total = 10;

        double somaIdade = 0, somaPeso = 0, somaRenda = 0;

        int pobres = 0;
        int medias = 0;
        int ricas = 0;

        int maiorIdade = 0;
        int menorIdade = 0;
        double maiorPeso = 0;
        int pessoaMaisPesada = 0;

        for (int i = 1; i <= total; i++) {

            System.out.println("--- Pessoa " + i + " ---");

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            somaIdade += idade;

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            somaPeso += peso;

            System.out.print("Renda mensal (R$): ");
            double renda = sc.nextDouble();
            somaRenda += renda;

            if (i == 1) {
                maiorIdade = idade;
                menorIdade = idade;
                maiorPeso = peso;
                pessoaMaisPesada = i;
            } else {

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }

                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                if (peso > maiorPeso) {
                    maiorPeso = peso;
                    pessoaMaisPesada = i;
                }
            }

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

        System.out.println("\n===== MAIOR E MENOR =====");

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.printf("Maior peso: %.1f kg%n", maiorPeso);
        System.out.println("Pessoa mais pesada: Pessoa " + pessoaMaisPesada);

        sc.close();
    }
}
