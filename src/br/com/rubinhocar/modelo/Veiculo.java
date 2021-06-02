package br.com.rubinhocar.modelo;

public class Veiculo {
	private String modelo;
	private float valor;
	private boolean status;
	private short ano;
	private short velocidadeAtual;
	
	public float retornaValor() {
		return valor;
	}
	
	public void preencherValor (float param) {
		valor = param;
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo (String param) {
		modelo = param;
	}
	
	
}
