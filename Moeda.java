package Uninter;

import java.util.Objects;

public abstract class Moeda {
	 String nome;
	 double valor;
	
	//Construtor
	public Moeda(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	//Metodo para listagem das moedas
	@Override
	public String toString() {
		return "Moeda: " + nome + " - Valor: " + valor;
	}
	//Metedo para remoção das moedas
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	//Construtor do calculo das moedas
	abstract double conversaoMoeda(); 

	
	
	
}
