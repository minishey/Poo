package Uninter;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int op;
				
		Cofrinho estoque = new Cofrinho();
		
		//Menu de opções.
		System.out.println("*$~~~~Cofrinho~~~~$*");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total de Moedas convertido em Reais (R$)");
		System.out.println("0 - Encerrar");
		System.out.println("Digite a opcao desejada: ");
		op = teclado.nextInt();

		int tipoMoeda;
		double valor = 0;
		Moeda val;
		//Laço para verificação das opções.
		while(op != 0) {
			
			switch(op) {
			//Adicionar Moeda
			case 1:
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Qual Moeda?: ");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMoeda = teclado.nextInt();
				    }
				
					System.out.println("Digite o valor: ");
					valor = teclado.nextDouble();
					
					
					
					val = null;
					if(tipoMoeda == 1) {
						val = new Real("Real", valor);
					}
					if(tipoMoeda == 2) {
						val = new Dolar("Dolar",valor);
					}
					if(tipoMoeda == 3) {
						val = new Euro("Euro", valor);
					}
									
					estoque.add(val);
				break;
			//Remover Moeda	
			case 2:
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Qual Moeda deseja remover?: ");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");
					tipoMoeda = teclado.nextInt();
				    }
					System.out.println("Digite o valor: ");
					valor = teclado.nextDouble();
					
					
					val = null;
					if(tipoMoeda == 1) {
						val = new Real("Real", valor);
					}
					if(tipoMoeda == 2) {
						val = new Dolar("Dolar", valor);
					}
					if(tipoMoeda == 3) {
						val = new Euro("Euro", valor);
					}
									
					estoque.remover(val);
				break;
					
			//Listar Moeda
			case 3:
				  estoque.listar();
				break;
			//Calculo total das moedas convertido em Reais.	
			case 4:
				  estoque.conversaoMoeda();
				break;
			//Mensagem caso o usuário digite uma opção inválida.
			default:
					System.out.println("Opcao Invalida!");
					System.out.println("---------------");
				break;
			}
			System.out.println("_ _ _ _ _ _ _ _ _ _ _");
			System.out.println("*$~~~~Cofrinho~~~~$*");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total de Moedas convertido em Reais (R$)");
			System.out.println("0 - Encerrar");
			System.out.println("Digite a opcao desejada: ");
			
			op = teclado.nextInt();
		    }
		
	}

	
}