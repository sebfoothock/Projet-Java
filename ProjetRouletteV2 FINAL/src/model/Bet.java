package model;
import java.util.Observable;
import java.util.Random;

import controller.BetController;
/**
 * @author MASSON JULIEN, LAMBERT MAXIMLILIEN, RAEMDONCK SEBASTIEN 2TL2 
 * GROUPE 17
 * 
 * This class is the main bet model.
 */
public class Bet extends Observable{
	private static double total;
	private static double winAmount;
	private static int numP = Player.getNumP();
	private static double amountP = Player.getAmount();
	private static Player pOne = new Player(numP, amountP);
	private static int numR = getNumRandom();
	private static double totalWon;
	private static double totalLost;
	private static double totalWL;
	private static int nbWon;
	private static int nbLost;
	/**
	 * this method return Bet with the number bet and the amount bet as attribute
	 * @param caseP is the number that the player bet on.
	 * @param amountP is the amount that the player bet on.
	 */
	public Bet(int caseP, double amountP){
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
				BetController.win(36);
			} else {
				BetController.lost();
			}
		}
		
		//si rouge ou noir
		if(pOne.getNumP() == 37){
			if(((Case) getArrayCase(pOne.getNumP())).getColor() == ((Case) getArrayCase(getNumR())).getColor()){
				BetController.win(2);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 38){
			if(((Case) getArrayCase(pOne.getNumP())).getColor() == ((Case) getArrayCase(getNumR())).getColor()){
				BetController.win(2);
			} else {
				BetController.lost();
			}
		}
			
		//si on parie sur pair impair
		if(pOne.getNumP() == 39){
			if(((Case) getArrayCase(pOne.getNumP())).getParity() == ((Case) getArrayCase(getNumR())).getParity()){
				BetController.win(2);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 40){
			if(((Case) getArrayCase(pOne.getNumP())).getParity() == ((Case) getArrayCase(getNumR())).getParity()){
				BetController.win(2);
			} else {
				BetController.lost();
			}
		}
		
		// pari sur intervals
		if(pOne.getNumP() == 41){
			if(((Case) getArrayCase(pOne.getNumP())).getIntervals() == ((Case) getArrayCase(getNumR())).getIntervals()){
				BetController.win(3);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 42){
			if(((Case) getArrayCase(pOne.getNumP())).getIntervals() == ((Case) getArrayCase(getNumR())).getIntervals()){
				BetController.win(3);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 43){
			if(((Case) getArrayCase(pOne.getNumP())).getIntervals() == ((Case) getArrayCase(getNumR())).getIntervals()){
				BetController.win(3);
			} else {
				BetController.lost();
			}
		}
		
		// pari sur colonne
		if(pOne.getNumP() == 44){
			if(((Case) getArrayCase(pOne.getNumP())).getColumn() == ((Case) getArrayCase(getNumR())).getColumn()){
				BetController.win(3);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 45){
			if(((Case) getArrayCase(pOne.getNumP())).getColumn() == ((Case) getArrayCase(getNumR())).getColumn()){
				BetController.win(3);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 46){
			if(((Case) getArrayCase(pOne.getNumP())).getColumn() == ((Case) getArrayCase(getNumR())).getColumn()){
				BetController.win(3);
			} else {
				BetController.lost();
			}
		}
		
		// 1-18 19-36
		if(pOne.getNumP() == 47){
			if(numR >= 1 && numR <= 18){
				BetController.win(2);
			} else {
				BetController.lost();
			}
		}
		if(pOne.getNumP() == 48){
			if(numR >= 19 && numR <= 36){
				BetController.win(2);
			} else {
				BetController.lost();
			}
		}
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
	
	/**
	 * @return return the case
	 */
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
		int numR = new Random().nextInt(37);
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
	
	/**
	 * @return return the total money of the player
	 */
	public static double getTotal() {
		return total;
	}
	/**
	 * change the total money of the player
	 * @param total is new total monney to set
	 */
	public static void setTotal(double total) {
		Bet.total = total;
	}
	/**
	 * @return the number that the player bet on.
	 */
	public static int getNumP() {
		return numP;
	}
	/**
	 * change the number that the player bet on.
	 * @param numP is the number that the player bet on.
	 */
	public static void setNumP(int numP) {
		Bet.numP = numP;
	}
	/**
	 * @return the random number that the wheel give
	 */
	public static int getNumR() {
		return numR;
	}
	/**
	 * Change the random number of the wheel
	 * @param numR is the number of the wheel
	 */
	public static void setNumR(int numR) {
		Bet.numR = numR;
	}
	/**
	 * @return the total money that the player won
	 */
	public static double getTotalWon() {
		return totalWon;
	}
	/**
	 * Change the total money that the player won
	 * @param totalWon
	 */
	public static void setTotalWon(double totalWon) {
		Bet.totalWon = totalWon;
	}
	/**
	 * @return the total money that the player lost
	 */
	public static double getTotalLost() {
		return totalLost;
	}
	/**
	 * Change the total money that the player lost
	 * @param totalLost
	 */
	public static void setTotalLost(double totalLost) {
		Bet.totalLost = totalLost;
	}
	/**
	 * @return the difference between the total money won and the total money lost
	 */
	public static double getTotalWL() {
		return totalWL;
	}
	/**
	 * Change the difference between the total money won and the money
	 * @param totalWL is the new difference between the total money won and the money
	 */
	public static void setTotalWL(double totalWL) {
		Bet.totalWL = totalWL;
	}
	/**
	 * @return the total game number won
	 */
	public static int getNbWon() {
		return nbWon;
	}
	/**
	 * Change the total game number won
	 * @param nbWon is the the total game number won
	 */
	public static void setNbWon(int nbWon) {
		Bet.nbWon = nbWon;
	}
	/**
	 * @return the total game number lost
	 */
	public static int getNbLost() {
		return nbLost;
	}
	/**
	 * Change the total game number lost
	 * @param nbLost is the total game number lost
	 */
	public static void setNbLost(int nbLost) {
		Bet.nbLost = nbLost;
	}
	/**
	 * @return the win amount
	 */
	public static double getWinAmount() {
		return winAmount;
	}
	/**
	 * Change the win amount
	 * @param winAmount is the win amount
	 */
	public static void setWinAmount(double winAmount) {
		Bet.winAmount = winAmount;
	}
	/**
	 * @return the amount that the player bet on
	 */
	public static double getAmountP() {
		return amountP;
	}
	/**
	 * change the amount that the player bet on
	 * @param amountP
	 */
	public static void setAmountP(double amountP) {
		Bet.amountP = amountP;
	}

}
