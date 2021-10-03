package aulaEstacio.bancoProva;

import java.util.ArrayList;

public class ContaPoupanca extends Conta {

	private double rendimentoMensal;

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
	public String getResumo(){
		return "Ol� " + getNomeCliente() + " seu saldo da conta poupanca � " + getSaldo();
	}


	
}
