package br.unipe.mpl.lista1.questao6;

public class Fatura {
	private String numero;
	private String descricao;
	private int qntComprada;
	private double preco;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQntComprada() {
		return qntComprada;
	}
	public void setQntComprada(int qntComprada) {
		this.qntComprada = qntComprada;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Fatura(String numero, String descricao, int qntComprada, double preco){
		this.numero = numero;
		this.descricao= descricao;
		this.qntComprada = qntComprada;
		this.preco = preco;
	}
	
	//M�todo para calcular o valor da fatura
	
	public double getValorfatura(){
		
		if(this.qntComprada<=0.0){
			return 0.;
		}
		
		if(this.precoItem<=0.0){
			return 0.0;
		}
		
		return  (this.qntComprada * this.precoItem);	
		
	}
}
