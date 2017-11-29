package controller;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JLabel;

import model.ModelParis;
import model.SQL;
import view.ViewBetConsole;
import view.ViewParisFenetre;
import view.ViewParisGUI;

public class ControllerParis {
	private static ModelParis model;
	private static ViewParisFenetre vue;
	private static ViewBetConsole cons;
	private static JLabel totalWon;
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
		ModelParis.setTotalWon(ModelParis.getTotalWon() + ModelParis.getWinAmount() - ModelParis.getpOne().getAmount());
		ModelParis.setTotalWL(ModelParis.getTotalWon() - ModelParis.getTotalLost());
		ModelParis.setNbWon(ModelParis.getNbWon() + 1);
		SQL.maj();
		SQL.recup();
		ViewParisGUI.getBet().setText(Double.toString(ModelParis.getTotal()) + " €");
		ViewParisGUI.getErrorMsg().setText("You win ! The number is : " + ModelParis.getNumR());
		ViewParisGUI.getTotalWon().setText(Double.toString(ModelParis.getTotalWon()));
		ViewParisGUI.getTotalWL().setText(Double.toString(ModelParis.getTotalWL()));
		ViewParisGUI.getNbWon().setText(Integer.toString(ModelParis.getNbWon()));
		System.out.println("You win ! The number is : " + ModelParis.getNumR());
		System.out.println("You win : " + ModelParis.getWinAmount());
		System.out.println("You have : " + ModelParis.getTotal() + "€");
	}
	
	/**
	 * This method is return the player loose his bet.
	 */
	public static void lost(){
		ModelParis.setTotal(ModelParis.getTotal() - ModelParis.getpOne().getAmount());
		ModelParis.setTotalLost(ModelParis.getTotalLost() + ModelParis.getpOne().getAmount());
		ModelParis.setTotalWL(ModelParis.getTotalWon() - ModelParis.getTotalLost());
		ModelParis.setNbLost(ModelParis.getNbLost() + 1);
		ModelParis.setNbLost(ModelParis.getNbLost());
		SQL.maj();
		SQL.recup();
		ViewParisGUI.getBet().setText(Double.toString(ModelParis.getTotal()) + " €");
		ViewParisGUI.getErrorMsg().setText("you loose ! The number is : " + ModelParis.getNumR());
		ViewParisGUI.getTotalLost().setText(Double.toString(ModelParis.getTotalLost()));
		ViewParisGUI.getTotalWL().setText(Double.toString(ModelParis.getTotalWL()));
		ViewParisGUI.getNbFailed().setText(Integer.toString(ModelParis.getNbLost()));
		System.out.println("You loose ! The number is : " + ModelParis.getNumR());
		System.out.println("You have : " + ModelParis.getTotal() + "€");

		
	}
	public static void reset() {
		SQL.reset();
		ViewParisGUI.getBet().setText(Double.toString(ModelParis.getTotal()) + " €");
		ViewParisGUI.getErrorMsg().setText("Game reset !");
		ViewParisGUI.getTotalWon().setText(Double.toString(ModelParis.getTotalWon()));
		ViewParisGUI.getTotalLost().setText(Double.toString(ModelParis.getTotalLost()));
		ViewParisGUI.getTotalWL().setText(Double.toString(ModelParis.getTotalWL()));
		ViewParisGUI.getNbFailed().setText(Integer.toString(ModelParis.getNbLost()));
		ViewParisGUI.getNbWon().setText(Integer.toString(ModelParis.getNbWon()));
	}
}
