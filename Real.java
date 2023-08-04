package Uninter;

public class Real extends Moeda {

	public Real(String nome, double valor) {
		super(nome, valor);
		
	}

	
	@Override
	double conversaoMoeda() {
		double total = valor; //Nesta classe não foi necessário fazer a conversão de moeda.
		return total;
	}

}