package controller;

public class SomaNumNaturalController {

	public SomaNumNaturalController() {
		super();
		
	}
	
	public int SomaRec(int numBase, int numN) {
		// Condição de Parada
		if (numN < 0) {
			return 0;
		}
		
		/* Condição de chamada dos passos
		 * Iteração chama numN, se numN >= 0, faz a diminuição de numN em numN -1, e leva para recursão SomaRec
		 * se numN < 0, retorna 0 e desfaz a pilha. 
		 */
		else {
			numBase = numN;
			numN -= 1;
			return numBase + SomaRec(numBase, numN);
		}
	}
}
