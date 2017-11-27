package model;
import java.util.Random;

import controller.ControllerParis;
import model.Case;
import view.ViewParisGUI;
import view.ViewParisFenetre;
/**
 * @author MASSON JULIEN 
 * HE201348 
 * 2TL2 
 * GROUPE 17
 * 
 * This class is the main bet model.
 */
public class ModelParis{
	public static double total = 2500;
	static double winAmount;
	static int numP = Player.getNumP();
	static double amountP = Player.getAmount();
	static Player pOne = new Player(numP, amountP);
	static int numR = getNumRandom();
	public static double totalWon;
	public static double totalLost;
	public static double totalWL;
	public static int nbWon;
	public static int nbLost;
	/**
	 * this method return ModelParis with the number bet and the amount bet as attribute
	 * @param caseP
	 * @param amountP
	 */
	public ModelParis(int caseP, double amountP){
		Player.setNumP(caseP);
		Player.setAmount(amountP);
		Player pOne;
		typeBet();
	}
	
	/**
	 * This method takes the number bet, the method looks which bet type it is.
	 * It subtracts the amount from the total.
	 * Return if the player win or loose his bet.
	 */
	public static void typeBet(){
		setNumR(getNumRandom());
		//si entre 1 & 36
		if(pOne.getNumP() >= 0 && pOne.getNumP() <=36){
			if(pOne.getNumP() == numR){
				ControllerParis.win(36);
			} else {
				ControllerParis.lost();
			}
		}
		
		//si rouge ou noir
		if(pOne.getNumP() == 37){
			if(((Case) getArrayCase(pOne.getNumP())).getColor() == ((Case) getArrayCase(getNumR())).getColor()){
				ControllerParis.win(2);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 38){
			if(((Case) getArrayCase(pOne.getNumP())).getColor() == ((Case) getArrayCase(getNumR())).getColor()){
				ControllerParis.win(2);
			} else {
				ControllerParis.lost();
			}
		}
			
		//si on parie sur pair impair
		if(pOne.getNumP() == 39){
			if(((Case) getArrayCase(pOne.getNumP())).getParity() == ((Case) getArrayCase(getNumR())).getParity()){
				ControllerParis.win(2);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 40){
			if(((Case) getArrayCase(pOne.getNumP())).getParity() == ((Case) getArrayCase(getNumR())).getParity()){
				ControllerParis.win(2);
			} else {
				ControllerParis.lost();
			}
		}
		
		// pari sur intervals
		if(pOne.getNumP() == 41){
			if(((Case) getArrayCase(pOne.getNumP())).getIntervals() == ((Case) getArrayCase(getNumR())).getIntervals()){
				ControllerParis.win(3);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 42){
			if(((Case) getArrayCase(pOne.getNumP())).getIntervals() == ((Case) getArrayCase(getNumR())).getIntervals()){
				ControllerParis.win(3);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 43){
			if(((Case) getArrayCase(pOne.getNumP())).getIntervals() == ((Case) getArrayCase(getNumR())).getIntervals()){
				ControllerParis.win(3);
			} else {
				ControllerParis.lost();
			}
		}
		
		// pari sur colonne
		if(pOne.getNumP() == 44){
			if(((Case) getArrayCase(pOne.getNumP())).getColumn() == ((Case) getArrayCase(getNumR())).getColumn()){
				ControllerParis.win(3);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 45){
			if(((Case) getArrayCase(pOne.getNumP())).getColumn() == ((Case) getArrayCase(getNumR())).getColumn()){
				ControllerParis.win(3);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 46){
			if(((Case) getArrayCase(pOne.getNumP())).getColumn() == ((Case) getArrayCase(getNumR())).getColumn()){
				ControllerParis.win(3);
			} else {
				ControllerParis.lost();
			}
		}
		
		// 1-18 19-36
		if(pOne.getNumP() == 47){
			if(numR >= 1 && numR <= 18){
				ControllerParis.win(2);
			} else {
				ControllerParis.lost();
			}
		}
		if(pOne.getNumP() == 48){
			if(numR >= 19 && numR <= 36){
				ControllerParis.win(2);
			} else {
				ControllerParis.lost();
			}
		}
	}
	
	
	
	/**
	 * Return the bet number from the player.
	 */

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
	public int getCase(){
		return pOne.getNumP();
	}
	
	/**
	 * Change the bet number from the player.
	 * @param numP
	 */
	public void setCase(int numP){
		pOne.setNumP(numP);
	}
	
	/**
	 * @return a random number between 0 and 37
	 */
	public static int getNumRandom(){
		Random randGen = new Random();
		int numR;
		numR = randGen.nextInt(37);
		return numR;
	}
	
	/**
	 * 
	 * @return the player
	 */
	public static Player getpOne() {
		return pOne;
	}
	
	/**
	 * Change player attributes
	 * @param pOne
	 */
	public void setpOne(Player pOne) {
		this.pOne = pOne;
	}
	
	
	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		ModelParis.total = total;
	}

	public static int getNumP() {
		return numP;
	}

	public static void setNumP(int numP) {
		ModelParis.numP = numP;
	}

	public static int getNumR() {
		return numR;
	}

	public static void setNumR(int numR) {
		ModelParis.numR = numR;
	}

	public static double getTotalWon() {
		return totalWon;
	}

	public static void setTotalWon(double totalWon) {
		ModelParis.totalWon = totalWon;
	}

	public static double getTotalLost() {
		return totalLost;
	}

	public static void setTotalLost(double totalLost) {
		ModelParis.totalLost = totalLost;
	}

	public static double getTotalWL() {
		return totalWL;
	}

	public static void setTotalWL(double totalWL) {
		ModelParis.totalWL = totalWL;
	}

	public static int getNbWon() {
		return nbWon;
	}

	public static void setNbWon(int nbWon) {
		ModelParis.nbWon = nbWon;
	}

	public static int getNbLost() {
		return nbLost;
	}

	public static void setNbLost(int nbLost) {
		ModelParis.nbLost = nbLost;
	}

	public static double getWinAmount() {
		return winAmount;
	}

	public static void setWinAmount(double winAmount) {
		ModelParis.winAmount = winAmount;
	}

	public static double getAmountP() {
		return amountP;
	}

	public static void setAmountP(double amountP) {
		ModelParis.amountP = amountP;
	}

}
