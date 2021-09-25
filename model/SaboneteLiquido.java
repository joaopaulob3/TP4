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
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Marca do sabonete l�quido: " + this.getMarcaDoProduto() + 
				"\nLinha do sabonete l�quido: " + this.getLinhaDoProduto() + 
				"\nPropriedades do sabonete l�quido: " + this.getPropriedadesDoSaboneteLiquido() +
				"\nC�digo do sabonete l�quido: " + this.getCodigoDoProduto() +
				"\nPre�o do sabonete l�quido: R$" + this.getPrecoDoProduto() +
				"\nVolume do sabonete l�quido (ml): " + this.getVolumeDoProduto() +
				"\n-------------------------------------------------------------------------" + 
				"\nQuantidade no estoque: " + this.getQuantidadeProduto();
	}
	
	//Retorna uma String com os dados relevantes para a listagem das compras
	@Override
	public String listarDadosFormaSeletiva() {
		return "\nMarca do sabonete l�quido: " + this.getMarcaDoProduto() + 
				"\nC�digo do sabonete l�quido: " + this.getCodigoDoProduto() +
				"\nPre�o do sabonete l�quido: R$" + this.getPrecoDoProduto();
	}
}