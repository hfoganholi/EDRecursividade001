package controller;

public class SomaNumNaturalController {

	public SomaNumNaturalController() {
		
		super();

	}

	public int recSoma(int quantidade) {
		if (quantidade < 0) { // Condição de parada
			return 0;
		}
		else {
			return quantidade + recSoma(quantidade - 1);
		}
	}
}
/*
 * Enquanto quantidade dos números naturais estiver acima ou igual a zero,
 * recSoma continuará empilhando e diminuindo a quantidade em um. 
 * Quando menor que zero, retorna zero e começa a desemplihar somando.
 */