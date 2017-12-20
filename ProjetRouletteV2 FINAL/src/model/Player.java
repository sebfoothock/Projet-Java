package model;
/**
 * this class is the constructor to create a player
 * @author MASSON JULIEN 2TL2
 * GROUPE 17
 *
 */
public class Player {
	private static double amount;
	private static int numP;
	public Player(int numP, double amount){
		this.amount = amount;
		Player.numP = numP;
	}
	/**
	 * @return the amount that the player bet on
	 */
	public static double getAmount() {
		return amount;
	}
	/**
	 * Change the amount that the player bet on
	 * @param amount is the amount that the player bet on
	 */
	public static void setAmount(double amount) {
		Player.amount = amount;
	}
	/**
	 * @return the number that the player bet on
	 */
	public static int getNumP() {
		return numP;
	}
	/**
	 * Change the number that the player bet on
	 * @param numP is the number that the player bet on
	 */
	public static void setNumP(int numP) {
		Player.numP = numP;
	}
}
