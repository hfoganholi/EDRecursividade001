package view;

import controller.SomaNumNaturalController;

public class Principal {

	public static void main(String[] args) {
		// Somente números naturais
		
		SomaNumNaturalController sCtrl = new SomaNumNaturalController();
				int numN = 10;
				int numBase = 0;
				int SomaRec = sCtrl.SomaRec(numBase, numN);
				System.out.println(SomaRec);
	}
	
}
