import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        char unidadeOrigem = scanner.next().charAt(0);

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        char unidadeDestino = scanner.next().charAt(0);

        double temperaturaConvertida = converterTemperatura(temperatura, unidadeOrigem, unidadeDestino);

        System.out.printf("%.2f %s = %.2f %s%n", temperatura, unidadeOrigem, temperaturaConvertida, unidadeDestino);
    }

    private static double converterTemperatura(double temperatura, char unidadeOrigem, char unidadeDestino) {
        double temperaturaCelsius = 0;
        switch (unidadeOrigem) {
            case 'C':
                temperaturaCelsius = temperatura;
                break;
            case 'K':
                temperaturaCelsius = temperatura - 273.15;
                break;
            case 'F':
                temperaturaCelsius = (temperatura - 32) * 5 / 9;
                break;
            default:
                System.out.println("Unidade de origem inválida.");
                return 0;
        }

        switch (unidadeDestino) {
            case 'C':
                return temperaturaCelsius;
            case 'K':
                return temperaturaCelsius + 273.15;
            case 'F':
                return (temperaturaCelsius * 9 / 5) + 32;
            default:
                System.out.println("Unidade de destino inválida.");
                return 0;
        }
    }
}

