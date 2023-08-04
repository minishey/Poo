package Uninter;

import java.util.ArrayList;

public class Cofrinho { // Classe onde está a listagem das moedas.
	ArrayList<Moeda>listaMoedas = new ArrayList<Moeda>();
	//Adicionar
	public void add(Moeda coin) {
		listaMoedas.add(coin);
	}
	//Remover
	public void remover(Moeda coin) {
		listaMoedas.remove(coin);
	}
	//Listar
	public void listar() {
		for(Moeda coin : listaMoedas) {
			System.out.println(coin);
		}
    }
	//Calculo total das moedas convertido em Reais
	public void conversaoMoeda() {
		double total = 0;	
		 for(Moeda coin : listaMoedas) {
				total += coin.conversaoMoeda();
							
	}
    System.out.printf("Valor total convertido: R$ %.2f\n" , total);
		 
  }
	
	
}