package Empresa;

import java.util.ArrayList;

public class cofrinhoEdu {
	
	private ArrayList<moeda> coinList;
	
		public cofrinhoEdu() {
			this.coinList = new ArrayList<>();
		}
		//adiciona moedas na lista
		public void adicionar(moeda moeda) {
			this.coinList.add(moeda);
		}
		//remover moedas na lista
		public void remover(moeda moeda) {
			this.coinList.remove(moeda);
		}
		
		// exibir moedas 
		public void listagemMoedas () {
			if (this.coinList.isEmpty()) {
				System.out.println("Seu cofrinho está vazio :(");
				return;				
			} else
				for (moeda moeda : this.coinList){
				moeda.info();
				}
		}
	
		//método converterá o valor e acumulará o valor convertido e retornará o valor total da conversão 
		public double totalConvertido() {
			if (this.coinList.isEmpty()) {
				return 0.0;				
			}
			
			if (this.coinList.size() == 1) {
				return 1.0;				
			}
			
			double valorAcumulado = 0;
			for (moeda moeda : this.coinList) {
				valorAcumulado = valorAcumulado + moeda.converter();				
			}
			return valorAcumulado;
			
			
		}
	

}
