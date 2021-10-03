package aulaEstacio.bancoProva;

public class Transacao {

    private double saldo;
    private double valorTransacao;
    private String tipo;

    public Transacao(double saldo,String tipo, double valorTransacao) {
        this.saldo = saldo;
        this.valorTransacao = valorTransacao;
        this.tipo = tipo;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
