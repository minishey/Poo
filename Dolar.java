package Uninter;

public class Dolar extends Moeda {

	public Dolar(String nome, double valor) {
		super(nome, valor);
		
	}

		
	@Override
	double conversaoMoeda() {
		double total = valor * 4.85; // Valor de cotação baseado no dia da pesquisa.
		return total;	
	}

}