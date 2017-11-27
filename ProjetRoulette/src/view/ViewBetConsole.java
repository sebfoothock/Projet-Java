package view;

import java.util.Random;
import java.util.Scanner;

import model.ModelParis;

public class ViewBetConsole {
	Scanner keyboard = new Scanner(System.in);
    Random generator = new Random();
    double total = 500;
    double amount;
    int choice, win = 0, lose = 0, spin = 0;
    int number;
    int rouletteNum = ModelParis.getNumRandom();
    int result;
    char response = 'y';
	public ViewBetConsole() {
		while (response == 'y' || response == 'Y' && total <= 0){
	        
			System.out.print("Enter your bet amount: ");
	        amount = keyboard.nextDouble();
	      
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
	        number = 0;
	        if (choice == 12)  {
	            while (number < 1 || number > 36) {
	                System.out.print("Place your bet on number(1-36): ");
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
	        ModelParis model = new ModelParis(number, amount);
	        System.out.println("The number is : " + ModelParis.getNumR());
	        System.out.println("You hayve $" + ModelParis.getTotal() + " remaining." );
	        System.out.print("\nWould you like to play another game? (y/n) ");
	        response = keyboard.next().charAt(0);
	        
	    }
	
	}
}
	
