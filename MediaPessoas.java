
import java.util.Locale;
import java.util.Scanner;

public class MediaPessoas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        int total = 10;

        double somaIdade = 0, somaPeso = 0, somaRenda = 0;

        for (int i = 1; i <= total; i++) {

            System.out.println("--- Pessoa " + i + " ---");

            System.out.print("Idade: ");
            somaIdade += sc.nextInt();

            System.out.print("Peso (kg): ");
            somaPeso += sc.nextDouble();

            System.out.print("Renda mensal (R$): ");
            somaRenda += sc.nextDouble();
        }

        double mediaIdade = somaIdade / total;
        double mediaPeso = somaPeso / total;
        double mediaRenda = somaRenda / total;

        String condicao;

        if (mediaRenda < 3000) {
            condicao = "Pobre";
        } else if (mediaRenda <= 10000) {
            condicao = "Média";
        } else {
            condicao = "Rica";
        }

        System.out.printf("Média de idade: %.1f anos%n", mediaIdade);
        System.out.printf("Média de peso: %.1f kg%n", mediaPeso);
        System.out.printf("Renda média: R$ %.2f%n", mediaRenda);
        System.out.println("Condição financeira: " + condicao);

        sc.close();
    }
}