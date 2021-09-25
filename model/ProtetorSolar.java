package model;

public class ProtetorSolar extends Produto{
	//Atributos
	private String propriedadesDoProtetorSolar;
	private int fpsDoProtetorSolar;
	
	//Construtor
	public ProtetorSolar(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto, 
			String propriedadesDoProtetorSolar, int fpsDoProtetorSolar) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto,
				quantidadeProduto);
		this.setPropriedadesDoProtetorSolar(propriedadesDoProtetorSolar);
		this.setFpsDoProtetorSolar(fpsDoProtetorSolar);
	}
	
	//M�todos modificadores
	public void setPropriedadesDoProtetorSolar(String propriedadesDoProtetorSolar) {
		this.propriedadesDoProtetorSolar = propriedadesDoProtetorSolar;
	}
	public void setFpsDoProtetorSolar(int fpsDoProtetorSolar) {
		this.fpsDoProtetorSolar = fpsDoProtetorSolar;
	}
	
	//M�todos acessores
	public String getPropriedadesDoProtetorSolar() {
		return this.propriedadesDoProtetorSolar;
	}
	public int getFpsDoProtetorSolar() {
		return this.fpsDoProtetorSolar;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Marca do protetor solar: " + this.getMarcaDoProduto() + 
				"\nLinha do protetor solar: " + this.getLinhaDoProduto() + 
				"\nPropriedades do protetor solar: " + this.getPropriedadesDoProtetorSolar() + 
				"\nFPS do protetor solar: " + this.getFpsDoProtetorSolar() +
				"\nC�digo do protetor solar: " + this.getCodigoDoProduto() +
				"\nPre�o do protetor solar: R$" + this.getPrecoDoProduto() +
				"\nVolume do protetor solar (ml): " + this.getVolumeDoProduto() +
				"\n-------------------------------------------------------------------------" + 
				"\nQuantidade no estoque: " + this.getQuantidadeProduto();
	}
	
	//Retorna uma String com os dados relevantes para a listagem das compras
	@Override
	public String listarDadosFormaSeletiva() {
		return "\nMarca do protetor solar: " + this.getMarcaDoProduto() + 
				"\nC�digo do protetor solar: " + this.getCodigoDoProduto() +
				"\nPre�o do protetor solar: R$" + this.getPrecoDoProduto();
	}
}