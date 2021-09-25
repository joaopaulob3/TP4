package controller;

import java.util.ArrayList;

import model.Perfumaria;

public class ConjuntoPerfumaria{
	//Cria��o do ArrayList de objetos do tipo Perfumaria
	private static final ArrayList<Perfumaria> listaPerfumes = new ArrayList<>();
	
	//Adicionar o objeto do tipo Perfumaria no ArrayList
	public static void cadastrarPerfume(Perfumaria perfume) {
		listaPerfumes.add(perfume);
	}

	//Deletar o objeto do tipo Perfumaria do ArrayList
	public static void deletarPerfume(Perfumaria perfume) {
		listaPerfumes.remove(perfume);
	}
	
	//Pesquisa o objeto do tipo Perfumaria pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
	//objeto, retorna null
	public static Perfumaria pesquisarPerfume(String codigo) {
		for (Perfumaria perfume : listaPerfumes) {
			if (codigo.equals(perfume.getCodigoDoProduto())) {
				return perfume;
			}
		}
		return null;
	}
	
	//Verifica se h� objeto do tipo Perfumaria cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temPerfume() {
		if (listaPerfumes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos perfumes do Arraylist
	public static void listaPerfumes() {
		int i = 1;
		
		for (Perfumaria perfume : listaPerfumes) {
			System.out.println("\n################################### " + (i++) + " ###################################");
			System.out.println(perfume.listarDados());
			System.out.println("#########################################################################");
		}
	}
	
	//Retorna a quantidade de objetos do tipo Perfumaria no ArrayList
	public static int quantidade() {
		return listaPerfumes.size();
	}
}