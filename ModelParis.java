package model;
import java.util.Observable;
import java.util.Random;
import model.Case;
/**
 * @author JULIEN
 * This class is the main bet model.
 */
public class ModelParis extends Observable{
	static Player pUn = new Player(37, 50);
	static double total = 500;
	static double winAmount;
	public static void main(String[] args) {
		System.out.println(total);
		typeParis();
		System.out.println(total);
	}
	
	/**
	 * this method return ModelParis with the number bet and the amount bet as attribute
	 * @param caseP
	 * @param amountP
	 */
	public ModelParis(int caseP, double amountP){
		Player pUn = new Player(caseP, amountP);
		typeParis();
	}
	
	/**
	 * This method takes the number bet, the method looks which bet type it is.
	 * It subtracts the amount from the total.
	 * Return if the player win or loose his bet.
	 */
	public static void typeParis(){
		total = total - pUn.getAmount();
		int numR = getNumR();
		//si entre 1 & 36
		if(pUn.getNumP() >= 0 && pUn.getNumP() <=36){
			if(pUn.getNumP() == numR){
				gagne(36);
			} else {
				perd();
			}
		}
		
		//si rouge ou noir
		if(pUn.getNumP() == 37){
			if(((Case) getArrayCase(pUn.getNumP())).getColor() == ((Case) getArrayCase(numR)).getColor()){
				gagne(2);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 38){
			if(((Case) getArrayCase(pUn.getNumP())).getColor() == ((Case) getArrayCase(numR)).getColor()){
				gagne(2);
			} else {
				perd();
			}
		}
			
		//si on parie sur pair impair
		if(pUn.getNumP() == 39){
			if(((Case) getArrayCase(pUn.getNumP())).getParity() == ((Case) getArrayCase(numR)).getParity()){
				gagne(2);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 40){
			if(((Case) getArrayCase(pUn.getNumP())).getParity() == ((Case) getArrayCase(numR)).getParity()){
				gagne(2);
			} else {
				perd();
			}
		}
		
		// pari sur intervals
		if(pUn.getNumP() == 41){
			if(((Case) getArrayCase(pUn.getNumP())).getIntervals() == ((Case) getArrayCase(numR)).getIntervals()){
				gagne(3);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 42){
			if(((Case) getArrayCase(pUn.getNumP())).getIntervals() == ((Case) getArrayCase(numR)).getIntervals()){
				gagne(3);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 43){
			if(((Case) getArrayCase(pUn.getNumP())).getIntervals() == ((Case) getArrayCase(numR)).getIntervals()){
				gagne(3);
			} else {
				perd();
			}
		}
		
		// pari sur colonne
		if(pUn.getNumP() == 44){
			if(((Case) getArrayCase(pUn.getNumP())).getColumn() == ((Case) getArrayCase(numR)).getColumn()){
				gagne(3);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 45){
			if(((Case) getArrayCase(pUn.getNumP())).getColumn() == ((Case) getArrayCase(numR)).getColumn()){
				gagne(3);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 46){
			if(((Case) getArrayCase(pUn.getNumP())).getColumn() == ((Case) getArrayCase(numR)).getColumn()){
				gagne(3);
			} else {
				perd();
			}
		}
		
		// 1-18 19-36
		if(pUn.getNumP() == 47){
			if(numR >= 1 && numR <= 18){
				gagne(2);
			} else {
				perd();
			}
		}
		if(pUn.getNumP() == 48){
			if(numR >= 19 && numR <= 36){
				gagne(2);
			} else {
				perd();
			}
		}
	}
	
	/**
	 * This method is return if the player win his bet.
	 * The method add the amount won in total.
	 * @param ratio is the coefficient to know the amount won.	
	 */
	public static void gagne(int ratio){
		winAmount = pUn.getAmount() * ratio;
		total = total + winAmount;
		System.out.println("gagné!");
	}
	
	/**
	 * This method is return the player loose his bet.
	 */
	public static void perd(){
		System.out.println("perdu");
	}
	
	/**
	 * Return the bet number from the player.
	 */
	public int getCase(){
		return pUn.getNumP();
	}
	
	/**
	 * Change the bet number from the player.
	 * @param numP
	 */
	public void setCase(int numP){
		pUn.setNumP(numP);
	}
	
	/**
	 * @return a random number between 0 and 37
	 */
	public static int getNumR(){
		Random randGen = new Random();
		return randGen.nextInt(37);
	}
	
	/**
	 * 
	 * @return the player
	 */
	public Player getpUn() {
		return pUn;
	}
	
	/**
	 * Change player attributes
	 * @param pUn
	 */
	public void setpUn(Player pUn) {
		this.pUn = pUn;
	}
	
	/**
	 * This methods contains all play mat cases
	 * @param numCase is the attributes to find the case in the array.
	 * @return the cases with its attributes.
	 */
	public static Object getArrayCase(int numCase){
		Case [] arrayCase = new Case[49];
		arrayCase[0] = new Case(0, "N", "V", 0, 0);
		arrayCase[1] = new Case(1, "I", "R", 1, 1);
		arrayCase[2] = new Case(2, "P", "N", 1, 2);
		arrayCase[3] = new Case(3, "I", "R", 1, 3);
		arrayCase[4] = new Case(4, "P", "N", 1, 1);
		arrayCase[5] = new Case(5, "I", "R", 1, 2);
		arrayCase[6] = new Case(6, "P", "N", 1, 3);
		arrayCase[7] = new Case(7, "I", "R", 1, 1);
		arrayCase[8] = new Case(8, "P", "N", 1, 2);
		arrayCase[9] = new Case(9, "I", "R", 1, 3);
		arrayCase[10] = new Case(10, "P", "N", 1, 1);
		arrayCase[11] = new Case(11, "I", "N", 1, 2);
		arrayCase[12] = new Case(12, "P", "R", 1, 3);
		//Second intervals
		arrayCase[13] = new Case(13, "I", "N", 2, 1);
		arrayCase[14] = new Case(14, "P", "R", 2, 2);
		arrayCase[15] = new Case(15, "I", "N", 2, 3);
		arrayCase[16] = new Case(16, "P", "R", 2, 1);
		arrayCase[17] = new Case(17, "I", "N", 2, 2);
		arrayCase[18] = new Case(18, "P", "R", 2, 3);
		arrayCase[19] = new Case(19, "I", "R", 2, 1);
		arrayCase[20] = new Case(20, "P", "N", 2, 2);
		arrayCase[21] = new Case(21, "I", "R", 2, 3);
		arrayCase[22] = new Case(22, "P", "N", 2, 1);
		arrayCase[23] = new Case(23, "I", "R", 2, 2);
		arrayCase[24] = new Case(24, "P", "N", 2, 3);
		//Third intervals
		arrayCase[25] = new Case(25, "I", "R", 3, 1);
		arrayCase[26] = new Case(26, "P", "N", 3, 2);
		arrayCase[27] = new Case(27, "I", "R", 3, 3);
		arrayCase[28] = new Case(28, "P", "N", 3, 1);
		arrayCase[29] = new Case(29, "I", "N", 3, 2);
		arrayCase[30] = new Case(30, "P", "R", 3, 3);
		arrayCase[31] = new Case(31, "I", "N", 3, 1);
		arrayCase[32] = new Case(32, "P", "R", 3, 2);
		arrayCase[33] = new Case(33, "I", "N", 3, 3);
		arrayCase[34] = new Case(34, "P", "R", 3, 1);
		arrayCase[35] = new Case(35, "I", "N", 3, 2);
		arrayCase[36] = new Case(36, "P", "R", 3, 3);
		// SPECIAL CASE
		//color : red(37)-black(38)
		arrayCase[37] = new Case(37, null, "R", 4, 0);
		arrayCase[38] = new Case(38, null, "N", 4, 0);
		//parity : even(39) - odd(40)
		arrayCase[39] = new Case(39, "P", null, 4, 0);
		arrayCase[40] = new Case(40, "I", null, 4, 0);
		//intervals 1-12(41) 13-24(42) 25-36(43)
		arrayCase[41] = new Case(41, null, null, 1, 0);
		arrayCase[42] = new Case(42, null, null, 2, 0);
		arrayCase[43] = new Case(43, null, null, 3, 0);
		//Colonne 1ere(44) 2eme(45) 3eme(46)
		arrayCase[44] = new Case(44, null, null, -1, 1);
		arrayCase[45] = new Case(45, null, null, -1, 2);
		arrayCase[46] = new Case(46, null, null, -1, 3);
		//De 1-18 et de 19-36
		arrayCase[47] = new Case(47, null, null, -1, -1);
		arrayCase[48] = new Case(48, null, null, -1, -1);
		return arrayCase[numCase];
		}

}
