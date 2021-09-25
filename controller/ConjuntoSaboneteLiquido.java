package controller;

import java.util.ArrayList;

import model.SaboneteLiquido;

public class ConjuntoSaboneteLiquido {
	//Cria��o do ArrayList de objetos do tipo SaboneteLiquido
	private static final ArrayList<SaboneteLiquido> listaSabonetesLiquido = new ArrayList<>();

	//Adicionar o objeto do tipo SaboneteLiquido no ArrayList
	public static void cadastrarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.add(sabonete);
	}

	//Deletar o objeto do tipo SaboneteLiquido do ArrayList
	public static void deletarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.remove(sabonete);
	}
	
	//Pesquisa o objeto do tipo SaboneteLiquido pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
	//objeto, retorna null
	public static SaboneteLiquido pesquisarSaboneteLiquido(String codigo) {
		for (SaboneteLiquido sabonete : listaSabonetesLiquido) {
			if (codigo.equals(sabonete.getCodigoDoProduto())) {
				return sabonete;
			}
		}
		return null;
	}
	
	//Verifica se h� objeto do tipo SaboneteLiquido cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temSaboneteLiquido() {
		if (listaSabonetesLiquido.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos sabonetes l�quido do Arraylist
	public static void listaSaboneteLiquido() {
		int i = 1;
		
		for (SaboneteLiquido sabonete : listaSabonetesLiquido) {
			System.out.println("\n################################### " + (i++) + " ###################################");
			System.out.println(sabonete.listarDados());
			System.out.println("#########################################################################");
		}
	}
	
	//Retorna a quantidade de objetos do tipo Condicionador no ArrayList
	public static int quantidade() {
		return listaSabonetesLiquido.size();
	}
}