package model;

public class Condicionador extends Produto{
	//Atributos
	private String tipoDeCabeloDoCondicionador;
	private String propriedadesDoCondicionador;
	private String condicaoDosFiosDoCondicionador;
		
	//Construtor
	public Condicionador(double precoDoProduto, double volumeDoProduto, String codigoDoProduto,
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto, 
			String tipoDeCabeloDoCondicionador, String propriedadesDoCondicionador, 
			String condicaoDosFiosDoCondicionador) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto,
				quantidadeProduto);
		this.setTipoDeCabeloDoCondicionador(tipoDeCabeloDoCondicionador);
		this.setPropriedadesDoCondicionador(propriedadesDoCondicionador);
		this.setCondicaoDosFiosDoCondicionador(condicaoDosFiosDoCondicionador);
	}
		
	//M�todos modificadores
	public void setTipoDeCabeloDoCondicionador(String tipoDeCabeloDoCondicionador) {
		this.tipoDeCabeloDoCondicionador = tipoDeCabeloDoCondicionador;
	}
	public void setPropriedadesDoCondicionador(String propriedadesDoCondicionador) {
		this.propriedadesDoCondicionador = propriedadesDoCondicionador;
	}
	public void setCondicaoDosFiosDoCondicionador(String condicaoDosFiosDoCondicionador) {
		this.condicaoDosFiosDoCondicionador = condicaoDosFiosDoCondicionador;
	}
	
	//M�todos acessores
	public String getTipoDeCabeloDoCondicionador() {
		return this.tipoDeCabeloDoCondicionador;
	}
	public String getPropriedadesDoCondicionador() {
		return this.propriedadesDoCondicionador;
	}
	public String getCondicaoDosFiosDoCondicionador() {
		return this.condicaoDosFiosDoCondicionador;
	}
		
}