public class Solution {
    public static void calcularTabelaSAC(double valorEmprestimo, double taxaJuros, int meses) {
        // Verificar se os valores de entrada são válidos
        if (valorEmprestimo <= 0 || taxaJuros <= 0 || meses <= 0) {
            System.out.println("Valores de entrada inválidos refaça.");
            return;
        }

        double saldoDe = valorEmprestimo;
        double amortizacao = saldoDevedor / meses;
        double tJuros = 0;
        double tAmortizacao = 0;
        double tPago = 0;

        System.out.println("Valor fixo da amortização: R$" + String.format("%.2f", amortizacao));
        System.out.println("Saldo devedor total: R$" + String.format("%.2f", saldoDevedor) + " com uma taxa de juros de " + taxaJuros + "% ao mês");

        for (int i = 1; i <= meses; i++) {
            // Calcular juros e prestação mensal
            double jurosMensal = saldoDevedor * (taxaJuros / 100);
            double prestacaoMensal = jurosMensal + amortizacao;

            // Atualizar valores
            saldoDevedor -= amortizacao;
            tJuros += jurosMensal;
            tAmortizacao += amortizacao;
            tPago += prestacaoMensal;

            // Exibir informações da parcela
            System.out.println("Parcela " + i + " | Juros: R$" + String.format("%.2f", jurosMensal) + " | Prestação: R$" + String.format("%.2f", prestacaoMensal) + " | Saldo devedor: R$" + String.format("%.2f", saldoDevedor));
        }

        // Exibir informações totais
        System.out.println("Total pago
