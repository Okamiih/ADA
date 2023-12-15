import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        char unidadeOrigem = scanner.next().charAt(0);
        if (unidadeOrigem != 'C' && unidadeOrigem != 'K' && unidadeOrigem != 'F') {
            System.out.println("Entrada inválida.");
            return;
        }

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        char unidadeDestino = scanner.next().charAt(0);
        if (unidadeDestino != 'C' && unidadeDestino != 'K' && unidadeDestino != 'F') {
            System.out.println("Entrada inválida.");
            return;
        }

        double temperaturaConvertida = 0;
        if (unidadeOrigem == 'C') {
            if (unidadeDestino == 'K') {
                temperaturaConvertida = temperatura + 273.15;
            } else if (unidadeDestino == 'F') {
                temperaturaConvertida = (temperatura * 9 / 5) + 32;
            } else {
                temperaturaConvertida = temperatura;
            }
        } else if (unidadeOrigem == 'K') {
            if (unidadeDestino == 'C') {
                temperaturaConvertida = temperatura - 273.15;
            } else if (unidadeDestino == 'F') {
                temperaturaConvertida = (temperatura - 273.15) * 9 / 5 + 32;
            } else {
                temperaturaConvertida = temperatura;
            }
        } else {
            if (unidadeDestino == 'C') {
                temperaturaConvertida = (temperatura - 32) * 5 / 9;
            } else if (unidadeDestino == 'K') {
                temperaturaConvertida = (temperatura - 32) * 5 / 9 + 273.15;
            } else {
                temperaturaConvertida = temperatura;
            }
        }

        System.out.printf("%.2f %s = %.2f %s%n", temperatura, unidadeOrigem, temperaturaConvertida, unidadeDestino);
    }
}
