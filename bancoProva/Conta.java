package aulaEstacio.bancoProva;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Conta {

    private String nomeCliente;
    private int cpf;
    private ArrayList<Transacao> transacoes;
    private int dataNascimento;
    private int agencia;
    private int numeroConta;
    private double saldo;


    public void setTransacoes(ArrayList<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public void getTransacoes() {
        System.out.println("===== EXTRATO =====");
        System.out.println("=======================================");

        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada!");
        } else {
            for (int i = 0; i <= transacoes.size() - 1; i++) {
                System.out.println("Tipo : " + transacoes.get(i).getTipo());
                System.out.println("Valor Transação: " + transacoes.get(i).getValorTransacao());
                System.out.println("=======================================");
            }
            System.out.println("Saldo final : " + this.saldo);
        }

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void extrato() {
        System.out.println("Extrato");
    }

    public boolean sacar(double valor) {

        if (valor > saldo) {
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getResumo() {
        return "Ol�" + nomeCliente + " seu saldo � de" + saldo;
    }

}
