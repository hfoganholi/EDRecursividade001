package view;
import controller.SomaNumNaturalController;

public class Principal {

	public static void main(String[] args) {
		// Somente números naturais
		
		SomaNumNaturalController sc = new SomaNumNaturalController();
				int quabtidade = 6; // insira seu número
				int soma = sc.recSoma(quantidade);
				System.out.println(soma);
	}
	
}
