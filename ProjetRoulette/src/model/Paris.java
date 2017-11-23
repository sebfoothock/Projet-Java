package model;

import java.util.Observable;
import java.util.Random;
import java.util.Scanner;

import model.Case;

public class Paris {
	/**
	Random randGen = new Random();
	private int numR;
	numR = randGen.nextInt(37);
	static double total;
	double winAmount;
	static double amount;
	Player pUn = new Player(null, 0,0, 0);
	public static void main(String[] args) {
		double amount;
		int caseP;
		char response = 'y';
		total = 500;
		Player pUn = new Player(null, 0,0 ,50);
		while (response == 'y' || response == 'Y' && total <= 0){
			//scan
			Scanner amountScan = new Scanner(System.in);
			Scanner caseScan = new Scanner(System.in);
			Scanner YNScan = new Scanner(System.in);
			System.out.print("Enter your bet amount: ");
		    amount = amountScan.nextDouble();
		    System.out.print("Enter your case: ");
		    caseP = (int) caseScan.nextDouble();
		    //
		    total = total - amount;
		    Player pDeux = new Player(null, amount, caseP, total);
			System.out.println(total);
			System.out.println("Le chiffre était " + numR);
			System.out.print("\nWould you like to play another game? (y/n) ");
	        response = YNScan.next().charAt(0);
		
		}
	}
	public void Paris(){
		//paris sur case
		if(pUn.getNumP() >=0 && pUn.getNumP() <=36){
			betCase();
		}
		/**
		//paris sur rouge
		if(pUn.getNumP() == 37){
			betColor();
		}
		//paris sur noir
		if(pUn.getNumP() == 38){
			betColor();
		}
		// paris sur pair
		if(pUn.getNumP() == 39){
			betColor();
		}
		// paris sur impair
		if(pUn.getNumP() == 40){
			betColor();
		}
		//paris sur 1ere interals
		if(pUn.getNumP() == 41){
			betIntervals();
		}
		//paris sur 2eme intervals
		if(pUn.getNumP() == 42){
			betIntervals();
		}
		// paris sur 3eme intervals
		if(pUn.getNumP() == 43){
			betIntervals();
		}
		// paris sur 1ere colonne
		if(pUn.getNumP() == 44){
			betColumn();
		}
		//paris sur 2eme colonne
		if(pUn.getNumP() == 45){
			betColumn();
		}
		// paris sur 3eme colonne
		if(pUn.getNumP() == 46){
			betColumn();
		}
		// paris entre 1 et 18
		if(pUn.getNumP() == 47){
			betInterDouble(1,18);
		}
		// paris entre 19 et 36
		if(pUn.getNumP() == 48){
			betInterDouble(19,36);
		}
	}
	
	// Si on parie sur une case
	public void betCase() {
		//si on gagne
		if(pUn.getNumP() == numR){
			winAmount = amount * 36;
			total = total + winAmount;
		}
	}
	/**
	// Si on parie sur une paritée
	public void betParity(){
		if(arrayCase[pUn.getNumP()].getParity() == arrayCase[numR].getParity()){
			winAmount = amount * 2;
			pUn.setTotal(pUn.getTotal() + winAmount);
		}
	}
	
	// reset le total
	public void reset() {
		total = 500;
	}

	//si on parie sur une couleur
	public void betColor() {
		if(arrayCase[pUn.getNumP()].getColor() == arrayCase[numR].getColor()){
			winAmount = amount * 2;
			pUn.setTotal(pUn.getTotal() + winAmount);
		}
	}
	
	// si on parie entre 1-18 et 19-36
	public void betInterDouble(int a, int b) {
		if(numR >= a && numR <= b){
			winAmount = amount * 2;
			pUn.setTotal(pUn.getTotal() + winAmount);
		}
	}
	
	// si on parie entre les 3 intervals
	public void betIntervals() {
		if(arrayCase[pUn.getNumP()].getIntervals() == arrayCase[numR].getIntervals()){
			winAmount = amount * 3;
			pUn.setTotal(pUn.getTotal() + winAmount);
		}
		
	}
	
	// si on parie entre les trois colonnes
	public void betColumn() {
		if(arrayCase[pUn.getNumP()].getColumn() == arrayCase[numR].getColumn()){
			winAmount = amount * 3;
			pUn.setTotal(pUn.getTotal() + winAmount);		
		}
	}
	**/
}
