package controller;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JLabel;

import model.Bet;
import model.SQL;
import view.ViewBetConsole;
import view.ViewBetWindow;
import view.ViewBetGUI;

public class BetController {
	private static Bet model;
	private static ViewBetWindow vue;
	private static ViewBetConsole cons;
	private static JLabel totalWon;
	
	public BetController(int num, int amount){
		model = new Bet(num, amount);
		
		
	}
	
	/**
	 * This method is return if the player win his bet.
	 * The method add the amount won in total.
	 * @param ratio is the coefficient to know the the amount won.	
	 */
	public static void win(int ratio){
		Bet.setTotal(Bet.getTotal() - Bet.getpOne().getAmount());
		Bet.setWinAmount(Bet.getpOne().getAmount() * ratio);
		Bet.setTotal(Bet.getTotal() + Bet.getWinAmount());
		Bet.setTotalWon(Bet.getTotalWon() + Bet.getWinAmount() - Bet.getpOne().getAmount());
		Bet.setTotalWL(Bet.getTotalWon() - Bet.getTotalLost());
		Bet.setNbWon(Bet.getNbWon() + 1);
		SQL.maj(SQL.getId());
		SQL.recup(SQL.getPlayer());
		ViewBetGUI.getBet().setText(Double.toString(Bet.getTotal()) + " €");
		ViewBetGUI.getErrorMsg().setText("You win ! The number is : " + Bet.getNumR());
		ViewBetGUI.getTotalWon().setText(Double.toString(Bet.getTotalWon()));
		ViewBetGUI.getTotalWL().setText(Double.toString(Bet.getTotalWL()));
		ViewBetGUI.getNbWon().setText(Integer.toString(Bet.getNbWon()));
		System.out.println("You win ! The number is : " + Bet.getNumR());
		System.out.println("You win : " + Bet.getWinAmount());
		System.out.println("You have : " + Bet.getTotal() + "€");
	}
	
	/**
	 * This method is return the player loose his bet.
	 */
	public static void lost(){
		Bet.setTotal(Bet.getTotal() - Bet.getpOne().getAmount());
		Bet.setTotalLost(Bet.getTotalLost() + Bet.getpOne().getAmount());
		Bet.setTotalWL(Bet.getTotalWon() - Bet.getTotalLost());
		Bet.setNbLost(Bet.getNbLost() + 1);
		Bet.setNbLost(Bet.getNbLost());
		SQL.maj(SQL.getId());
		SQL.recup(SQL.getPlayer());
		ViewBetGUI.getBet().setText(Double.toString(Bet.getTotal()) + " €");
		ViewBetGUI.getErrorMsg().setText("you loose ! The number is : " + Bet.getNumR());
		ViewBetGUI.getTotalLost().setText(Double.toString(Bet.getTotalLost()));
		ViewBetGUI.getTotalWL().setText(Double.toString(Bet.getTotalWL()));
		ViewBetGUI.getNbFailed().setText(Integer.toString(Bet.getNbLost()));
		System.out.println("You loose ! The number is : " + Bet.getNumR());
		System.out.println("You have : " + Bet.getTotal() + "€");
		
	}
	/**
	 * This methods reset the player game.
	 */
	public static void reset() {
		SQL.reset(SQL.getId());
		ViewBetGUI.getBet().setText(Double.toString(Bet.getTotal()) + " €");
		ViewBetGUI.getErrorMsg().setText("Game reset !");
		ViewBetGUI.getTotalWon().setText(Double.toString(Bet.getTotalWon()));
		ViewBetGUI.getTotalLost().setText(Double.toString(Bet.getTotalLost()));
		ViewBetGUI.getTotalWL().setText(Double.toString(Bet.getTotalWL()));
		ViewBetGUI.getNbFailed().setText(Integer.toString(Bet.getNbLost()));
		ViewBetGUI.getNbWon().setText(Integer.toString(Bet.getNbWon()));
	}
}
