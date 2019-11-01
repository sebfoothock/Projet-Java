package model;
/**
 * this class is the constructor to create a player with or without amount
 * @author JULIEN
 *
 */
public class Player {
	private double amount;
	private int numP;
	private string nom;
	public Player(int numP, double amount,string nom){
		this.nom = nom;
		this.amount = amount;
		this.numP = numP;
	}
	public Player(int numP, string nom){
		this.numP=numP;
		this.nom=nom;
	}
	public string getNom(){
		return nom;
	}
	public void setNom(string nom){
		this.nom=nom;
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
