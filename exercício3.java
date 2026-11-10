
import java.util.Locale;
import java.util.Scanner;

public class exercício3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int total = sc.nextInt();

        while (total <= 0) {
            System.out.println("Erro! Digite uma quantidade maior que zero.");
            System.out.print("Quantas pessoas deseja cadastrar? ");
            total = sc.nextInt();
        }

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

            while (idade < 0 || idade > 120) {
                System.out.println("Idade inválida! Digite novamente.");
                System.out.print("Idade: ");
                idade = sc.nextInt();
            }

            somaIdade += idade;

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            while (peso <= 0) {
                System.out.println("Peso inválido! Digite novamente.");
                System.out.print("Peso (kg): ");
                peso = sc.nextDouble();
            }

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

            String condicao = classificar(renda);

            System.out.println("Classificação: " + condicao);

            if (condicao.equals("Pobre")) {
                pobres++;
            } else if (condicao.equals("Média")) {
                medias++;
            } else {
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

        System.out.println("\n===== CLASSIFICAÇÃO =====");

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

    static String classificar(double renda) {

        if (renda < 3000) {
            return "Pobre";
        } else if (renda <= 10000) {
            return "Média";
        } else {
            return "Rica";
        }
    }
}
