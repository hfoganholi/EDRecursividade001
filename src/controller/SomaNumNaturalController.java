package controller;

public class SomaNumNaturalController {

	public SomaNumNaturalController() {
		super();
		
	}
	
	public int SomaRec(int numBase, int numN) {
		//
		if (numN < 0) {
			return 0;
		}
		else {
			numBase = numN;
			numN -= 1;
			return numBase + SomaRec(numBase, numN);
		}
	}
}
