package model;
/**
 * this class is the constructor to create a player
 * @author JULIEN
 *
 */
public class Player {
	private static double amount;
	private static int numP;
	public Player(int numP, double amount){
		this.amount = amount;
		Player.numP = numP;
	}
	
	public static double getAmount() {
		return amount;
	}
	public static void setAmount(double amount) {
		Player.amount = amount;
	}
	public static int getNumP() {
		return numP;
	}
	public static void setNumP(int numP) {
		Player.numP = numP;
	}
}
