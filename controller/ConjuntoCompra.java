package controller;

import java.util.ArrayList;

import model.Compra;
import model.Condicionador;
import model.Hidratante;
import model.Perfumaria;
import model.ProtetorSolar;
import model.SaboneteLiquido;
import model.Shampoo;

public class ConjuntoCompra {
	//Cria??o do ArrayList contendo objetos do tipo Compra (com Cliente e Produto)
	private static final ArrayList<Compra> listaCompras = new ArrayList<>();
	
	//Cadastro de uma compra
	public static void cadastrarCompra(Compra compra) {
		listaCompras.add(compra);
	}
	
	//Dele??o de uma compra
	public static void deletarCompra(Compra compra) {
		listaCompras.remove(compra);
	}
	
	//Retorna a quantidade de objetos do tipo Compra dentro do ArrayList
	public static int quantidade() {
		return listaCompras.size();
	}
	
	//Retorna a quantidade de compras que um cliente espec?fico fez
	public static int quantidade(String cpf) {
		int contador = 0;
		
		for (Compra compra : listaCompras) {
			if (cpf.equals(compra.getCliente().getCpf())) {
				++contador;
			}
		}
		
		return contador;
	}
	
	//Se o ArrayList estiver vazio retorna false, sen?o retorna true
	public static boolean temCompra() {
		if (listaCompras.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	
	//Lista as compras que um cliente espec?fico realizou
	public static void listagemCompras(String cpf) {
		//Declara??es
		double comprasPerfume = 0, comprasHidratante = 0, comprasProtetorSolar = 0,
		comprasShampoo = 0, comprasCondicionador = 0, comprasSabonteLiquido = 0, somaValorGasto = 0;
		
		for (Compra compra : listaCompras) {
			if (cpf.equals(compra.getCliente().getCpf())) {
				//Se o produto for um perfume
				if (compra.getProduto() instanceof Perfumaria) {
					comprasPerfume += compra.getValorDaCompra();
					System.out.println(((Perfumaria) compra.getProduto()).listarDadosFormaSeletiva());
					System.out.println("Quantidade comprada: " + compra.getQuantidadeComprada());
					System.out.println("Valor gasto: R$" + comprasPerfume);
					
				//Se o produto for um hidratante
				} else if (compra.getProduto() instanceof Hidratante) {
					comprasHidratante += compra.getValorDaCompra();
					System.out.println(((Hidratante) compra.getProduto()).listarDadosFormaSeletiva());
					System.out.println("Quantidade comprada: " + compra.getQuantidadeComprada());
					System.out.println("Valor gasto: R$" + comprasHidratante);
					
				//Se o produto for um protetor solar
				} else if (compra.getProduto() instanceof ProtetorSolar) {
					comprasProtetorSolar += compra.getValorDaCompra();
					System.out.println(((ProtetorSolar) compra.getProduto()).listarDadosFormaSeletiva());
					System.out.println("Quantidade comprada: " + compra.getQuantidadeComprada());
					System.out.println("Valor gasto: R$" + comprasProtetorSolar);
					
				//Se o produto for um shampoo
				} else if (compra.getProduto() instanceof Shampoo) {
					comprasShampoo += compra.getValorDaCompra();
					System.out.println(((Shampoo) compra.getProduto()).listarDadosFormaSeletiva());
					System.out.println("Quantidade comprada: " + compra.getQuantidadeComprada());
					System.out.println("Valor gasto: R$" + comprasShampoo);
					
				//Se o produto for um condicionador
				} else if (compra.getProduto() instanceof Condicionador) {
					comprasCondicionador += compra.getValorDaCompra();
					System.out.println(((Condicionador) compra.getProduto()).listarDadosFormaSeletiva());
					System.out.println("Quantidade comprada: " + compra.getQuantidadeComprada());
					System.out.println("Valor gasto: R$" + comprasCondicionador);
					
				//Se o produto for um sabonete l?quido
				} else if (compra.getProduto() instanceof SaboneteLiquido) {
					comprasSabonteLiquido += compra.getValorDaCompra();
					System.out.println(((SaboneteLiquido) compra.getProduto()).listarDadosFormaSeletiva());
					System.out.println("Quantidade comprada: " + compra.getQuantidadeComprada());
					System.out.println("Valor gasto: R$" + comprasSabonteLiquido);
				}
			}
		}
		
		//Soma dos gastos
		somaValorGasto += comprasPerfume + comprasHidratante + comprasProtetorSolar + comprasShampoo +
				comprasCondicionador + comprasSabonteLiquido;
		System.out.println("\n=========================================================================");
		System.out.println("Total gasto na loja at? o momento: R$" + somaValorGasto);
		System.out.println("=========================================================================\n");
	}

}