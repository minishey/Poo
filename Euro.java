package Uninter;

public class Euro extends Moeda{

	public Euro(String nome, double valor) {
		super(nome, valor);
		
	}
	
		
	@Override
	double conversaoMoeda() {
		double total = valor * 5.37; // Valor de cotação baseado no dia da pesquisa.
		return total;
	}

}