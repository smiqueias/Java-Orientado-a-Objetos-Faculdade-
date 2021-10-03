package aulaEstacio.bancoProva;

import java.util.ArrayList;
import java.util.Scanner;

public class AppSistemaBancario {
    public static void menu() {
        System.out.println("\t");
        System.out.println("====>>Sistema Bancario<<====");
        System.out.println("\t");
        System.out.println("           MENU");
        System.out.println("0. Fim");
        System.out.println("1. Saldo Conta Corrente");
        System.out.println("2. Saldo Conta Poupanca");
        System.out.println("3. Saque Conta Corrente");
        System.out.println("4. Saque Conta Poupanca");
        System.out.println("5. Deposito Conta Corrente");
        System.out.println("6. Deposito Conta Poupanca");
        System.out.println("7. Extrato Conta Corrente");
        System.out.println("8. Extrato Conta Poupanca");
        System.out.print("\nOpcao: ");


    }

    public static void saldoCorrente(Conta conta) {
        System.out.println("Saldo da Conta Corrente: " + conta.getSaldo());
    }

    public static void saldoPoupanca(Conta conta) {
        System.out.println("Saldo da Conta Poupanca: " + conta.getSaldo());
    }

    public static void saque(Conta conta, ArrayList<Transacao> transacoes) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor do saque: ");
        double valorSaque = entrada.nextDouble();
        if (conta.sacar(valorSaque)) {
            System.out.println("Saque realizado com sucesso");
            transacoes.add(new Transacao(conta.getSaldo(), "Saque", valorSaque));
        } else {
            System.out.println("Favor verificar seu saldo!");
        }

    }

    public static void deposito(Conta conta, ArrayList<Transacao> transacoes) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor do deposito: ");
        double valorDeposito = entrada.nextDouble();
        if (conta.depositar(valorDeposito)) {
            System.out.println("Deposito realizado com sucesso");
            transacoes.add(new Transacao(conta.getSaldo(), "Desposito", valorDeposito));

        } else {
            System.out.println("falha ao realizar deposito!");
        }
    }

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        ArrayList<Transacao> extratoContaCorrente = new ArrayList<Transacao>();
        ArrayList<Transacao> extratoContaPoupanca = new ArrayList<Transacao>();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNomeCliente("Saulo");
        contaCorrente.setCpf(12345678);
        contaCorrente.setDataNascimento(01022005);
        contaCorrente.setAgencia(0001);
        contaCorrente.setTransacoes(extratoContaCorrente);
        contaCorrente.setNumeroConta(31321);
        contaCorrente.setTarifaMensal(123.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Joselino");
        contaPoupanca.setCpf(87654321);
        contaPoupanca.setDataNascimento(01022611);
        contaPoupanca.setAgencia(0002);
        contaPoupanca.setNumeroConta(131321);
        contaPoupanca.setTransacoes(extratoContaPoupanca);
        contaPoupanca.setRendimentoMensal(0.5);

        boolean rodando = true;
        while (rodando) {
            menu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Sistema Finalizado!");
                    rodando = false;
                    break;

                case 1:
                    saldoCorrente(contaCorrente);
                    break;

                case 2:
                    saldoPoupanca(contaPoupanca);
                    break;

                case 3:
                    saque(contaCorrente, extratoContaCorrente);
                    break;

                case 4:
                    saque(contaPoupanca, extratoContaPoupanca);
                    break;

                case 5:
                    deposito(contaCorrente, extratoContaCorrente);
                    break;

                case 6:
                    deposito(contaPoupanca, extratoContaPoupanca);
                    break;

                case 7:
                    contaCorrente.getTransacoes();
                    break;

                case 8:
                    contaPoupanca.getTransacoes();
                    break;

                default:
                    System.out.println("Opcao Invalida");
            }
        }

    }

}
