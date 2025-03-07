package Empresa;

import java.util.Scanner;

public class telaMenu {

	private Scanner put1;
	private cofrinhoEdu cofrinho; //chamar a classe cofrinho para estabelecer os métodos.
	
	public telaMenu() {
		put1 = new Scanner(System.in);
		cofrinho = new cofrinhoEdu();
	
		
}
	
	public void showtelaMenu() {
		
		System.out.println("-----------------------------");
		System.out.println("o QUE VOCE DESEJA?");
		System.out.println("----------------------------");
		System.out.println("1. Adicionar Moeda");
		System.out.println("2. Remover Moeda");
		System.out.println("3. Listar Moedas");
		System.out.println("4. Obter valor convertido");
		System.out.println("0. Sair");
		System.out.println("----------------------------");
		System.out.println("Digite aqui: ");
	
	
		String option = put1.next();
	
		//funcionamento do Menu 
		switch (option) {
			case "0": 
				System.out.println("Término operação");
				break;
			
			case "1": //adicionar moeda cofre
				System.out.println("Escolha a moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dolar");
				System.out.println("3 - Euro");
				
				int opcaoMoeda = put1.nextInt();
				
				System.out.println("Digite o valor: ");
				double valorMoeda = put1.nextDouble();
				
				if (opcaoMoeda == 1){
					Real moeda = new Real(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if(opcaoMoeda == 2){
					Dolar moeda = new Dolar(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if(opcaoMoeda == 3){
					Euro moeda = new Euro(valorMoeda);
					cofrinho.adicionar(moeda);
				} else {
					System.out.println("Moeda inexistente");
				}
				System.out.println("Adicionado com sucesso!");
				
				showtelaMenu();
				break;
				
			case "2": //remover moedas
				System.out.println("Escolha a moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dolar");
				System.out.println("3 - Euro");
				
				int opcaoMoeda1 = put1.nextInt();
				
				System.out.println("Digite o valor: ");
				double valorMoeda1 = put1.nextDouble();
				
				if (opcaoMoeda1 == 1){
					Real moeda = new Real(valorMoeda1);
					cofrinho.remover(moeda);
					} else if(opcaoMoeda1 == 2){
					Dolar moeda = new Dolar(valorMoeda1);
					cofrinho.remover(moeda);
					} else if(opcaoMoeda1 == 3){
					Euro moeda = new Euro(valorMoeda1);
					cofrinho.remover(moeda);
						} else {
					System.out.println("Moeda inexistente");
					}
				showtelaMenu();	
				System.out.println("Removido :)");
				showtelaMenu();
				break;
			
			case "3": //lista moedas
				cofrinho.listagemMoedas();
				showtelaMenu();
				break;
				
			case "4": //conversão monetária 
				double convertedValue = cofrinho.totalConvertido();
				System.out.println("Valor total convertido para reais: " + convertedValue);
				showtelaMenu();
				break;
			default: //voltar para o menu, caso não seja escolhido 
				System.out.println("Não deu, tente novamente!");
				showtelaMenu();
				break;
		}
	}
}