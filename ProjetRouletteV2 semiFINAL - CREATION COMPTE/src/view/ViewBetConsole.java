package view;

import java.util.Random;
import java.util.Scanner;

import controller.ControllerParis;
import model.ModelParis;

public class ViewBetConsole {
	private static Scanner keyboard = new Scanner(System.in);
	private static Random generator = new Random();
	private static int amount;
	private static int choice, win = 0, lose = 0, spin = 0;
	private static int number;
	private static int rouletteNum = ModelParis.getNumRandom();
	private static int result;
	private static char response = 'y';
	public ViewBetConsole() {
		while (response == 'y' || response == 'Y' && ModelParis.getTotal() <= 0){
			System.out.print("Enter your bet amount: ");
	        amount = keyboard.nextInt();
			while (amount > ModelParis.getTotal())
	           {
				System.out.print("You have only " + ModelParis.getTotal() + " You can't bet " + amount + "\n");
				System.out.print("Enter your bet amount: ");
		        amount = keyboard.nextInt();
	           }
			
	      
	        System.out.print("0 - Even\n1 - Odd\n"
	        		+ "2 - Red\n3 - Black\n"
	        		+ "4 - 1 to 18\n5 - 19 to 36\n"
	        		+ "6 - First Interval (1-12)\n7 - Second interval (13-24)\n8 - Third interval (25-36)\n"
	        		+ "9 - First column\n10 - Second column\n11 - Third column\n"
	        		+ "12 - number\n");
	        
	        choice = -1;
	        while (choice < 0 || choice > 12) {
	            System.out.print("Place your bet on :");
	            choice = keyboard.nextInt();
	        }
	        number = -1;
	        if (choice == 12)  {
	            while (number < 0 || number > 36) {
	                System.out.print("Place your bet on number(0-36): ");
	                number = keyboard.nextInt();
	            }
	        }
	        if( choice == 11) {
	        	number = 46;
	        }
	        if( choice == 10) {
	        	number = 45;
	        }
	        if( choice == 9) {
	        	number = 44;
	        }
	        if( choice == 8) {
	        	number = 43;
	        }
	        if( choice == 7) {
	        	number = 42;
	        }
	        if( choice == 6) {
	        	number = 41;
	        }
	        if( choice == 5) {
	        	number = 48;
	        }
	        if( choice == 4) {
	        	number = 47;
	        }
	        if( choice == 3) {
	        	number = 38;
	        }
	        if( choice == 2) {
	        	number = 37;
	        }
	        if( choice == 1) {
	        	number = 40 ;
	        }
	        if( choice == 0) {
	        	number = 39;
	        }
	        ControllerParis contr = new ControllerParis(number, amount);
	        System.out.print("\nWould you like to play another game? (y/n) ");
	        response = keyboard.next().charAt(0);
	    }
	
	}
	public static char getResponse() {
		return response;
	}
	public static void setResponse(char response) {
		ViewBetConsole.response = response;
	}
}
	
