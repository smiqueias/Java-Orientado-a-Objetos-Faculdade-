package aulaEstacio.bancoProva;

public class ContaCorrente extends Conta {
	
	private double tarifaMensal;

	public double getTarifaMensal() {
		return tarifaMensal;
	}

	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}
	
	public String getResumo(){
		return "Ol� " + getNomeCliente() + " seu saldo da conta corrente � " + getSaldo();
	}

}
