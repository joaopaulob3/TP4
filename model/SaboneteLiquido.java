package model;

public class SaboneteLiquido extends Produto{
	//Atributos
	private String propriedadesDoSaboneteLiquido;
	
	//Construor
	public SaboneteLiquido(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			int quantidadeProduto, String propriedadesDoSaboneteLiquido) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, 
				marcaDoProduto, linhaDoProduto, quantidadeProduto);
		this.setPropriedadesDoSaboneteLiquido(propriedadesDoSaboneteLiquido);
	}

	//M�todos modificadores
	public void setPropriedadesDoSaboneteLiquido(String propriedadesDoSaboneteLiquido) {
		this.propriedadesDoSaboneteLiquido = propriedadesDoSaboneteLiquido;
	}
	
	//M�todos acessores
	public String getPropriedadesDoSaboneteLiquido() {
		return this.propriedadesDoSaboneteLiquido;
	}
	
}