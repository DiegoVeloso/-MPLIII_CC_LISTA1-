package br.unipe.mlp.lista1.questao10;

public class Principal {
	public static void main(String[] args) {
		Lapis circulo= new Circulo();
		Lapis triangulo= new Triangulo();
		Lapis quadrado= new Quadrado();
		
		FiguraGeometrica figura= new FiguraGeometrica(circulo);
		FiguraGeometrica figura1= new FiguraGeometrica(triangulo);
		FiguraGeometrica figura2= new FiguraGeometrica(quadrado);
		
		figura.acao();
		figura1.acao();
		figura2.acao();
		
	}

}
