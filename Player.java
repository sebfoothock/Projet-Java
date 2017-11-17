package model;
/**
 * this class is the constructor to create a player
 * @author JULIEN
 *
 */
public class Player {
	private double amount;
	private int numP;
	public Player(int numP, double amount){
		this.amount = amount;
		this.numP = numP;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNumP() {
		return numP;
	}
	public void setNumP(int numP) {
		this.numP = numP;
	}
}
