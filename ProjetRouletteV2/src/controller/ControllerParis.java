package controller;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;

import model.ModelParis;
import view.ViewBetConsole;
import view.ViewParisFenetre;
import view.ViewParisGUI;

public class ControllerParis {
	private static ModelParis model;
	private static ViewParisFenetre vue;
	private static ViewBetConsole cons;
	
	public ControllerParis(int num, int amount){
		model = new ModelParis(num, amount);
		
		
	}
	
	/**
	 * This method is return if the player win his bet.
	 * The method add the amount won in total.
	 * @param ratio is the coefficient to know the the amount won.	
	 */
	public static void win(int ratio){
		ModelParis.setTotal(ModelParis.getTotal() - ModelParis.getpOne().getAmount());
		ModelParis.setWinAmount(ModelParis.getpOne().getAmount() * ratio);
		ModelParis.setTotal(ModelParis.getTotal() + ModelParis.getWinAmount());
		ModelParis.totalWon = ModelParis.totalWon + ModelParis.getWinAmount() - ModelParis.getpOne().getAmount();
		ModelParis.setTotalWL(ModelParis.totalWon - ModelParis.totalLost);
		ModelParis.nbWon += 1;
		ModelParis.setNbWon(ModelParis.getNbWon());
		ViewParisGUI.bet.setText(Double.toString(ModelParis.getTotal()) + " €");
		ViewParisGUI.errorMsg.setText("You win ! The number is : " + ModelParis.getNumR());
		ViewParisGUI.totalWon.setText(Double.toString(ModelParis.getTotalWon()));
		ViewParisGUI.totalWL.setText(Double.toString(ModelParis.getTotalWL()));
		ViewParisGUI.nbWon.setText(Integer.toString(ModelParis.getNbWon()));
		System.out.println("You win ! The number is : " + ModelParis.getNumR());
		System.out.println("You win : " + ModelParis.getWinAmount());
		System.out.println("You have : " + ModelParis.getTotal() + "€");
	}
	
	/**
	 * This method is return the player loose his bet.
	 */
	public static void lost(){
		ModelParis.setTotal(ModelParis.getTotal() - ModelParis.getpOne().getAmount());
		ModelParis.totalLost = ModelParis.totalLost + ModelParis.getpOne().getAmount();
		ModelParis.setTotalWL(ModelParis.getTotalWon() - ModelParis.getTotalLost());
		ModelParis.nbLost += 1;
		ModelParis.setNbLost(ModelParis.getNbLost());
		ViewParisGUI.bet.setText(Double.toString(ModelParis.getTotal()) + " €");
		ViewParisGUI.errorMsg.setText("you loose ! The number is : " + ModelParis.getNumR());
		ViewParisGUI.totalLost.setText(Double.toString(ModelParis.getTotalLost()));
		ViewParisGUI.totalWL.setText(Double.toString(ModelParis.getTotalWL()));
		ViewParisGUI.nbFailed.setText(Integer.toString(ModelParis.getNbLost()));
		System.out.println("You loose ! The number is : " + ModelParis.getNumR());
		System.out.println("You have : " + ModelParis.getTotal() + "€");
		
		
	}
	public static void reset() {
		ModelParis.nbLost = 0;
		ModelParis.nbWon = 0;
		ModelParis.total = 2500;
		ModelParis.totalLost = 0;
		ModelParis.totalWon = 0;
		ModelParis.totalWL = 0;
		ViewParisGUI.bet.setText(Double.toString(ModelParis.total) + " €");
		ViewParisGUI.errorMsg.setText("Game reset !");
		ViewParisGUI.totalWon.setText(Double.toString(ModelParis.totalWon));
		ViewParisGUI.totalLost.setText(Double.toString(ModelParis.totalLost));
		ViewParisGUI.totalWL.setText(Double.toString(ModelParis.totalWL));
		ViewParisGUI.nbFailed.setText(Integer.toString(ModelParis.nbLost));
		ViewParisGUI.nbWon.setText(Integer.toString(ModelParis.nbWon));
	}
}
