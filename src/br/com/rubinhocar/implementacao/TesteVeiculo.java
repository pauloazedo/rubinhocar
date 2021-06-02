package br.com.rubinhocar.implementacao;

import java.util.Scanner;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o modelo");
		
		objeto.preencherModelo(sc.next());
		
		System.out.println("Digite o valor");
		
		objeto.preencherValor(sc.nextFloat());
		
		System.out.println("Modelo: " + objeto.retornarModelo() + "\n\nValor: " + objeto.retornaValor());
			
		sc.close();
		
	}

}
