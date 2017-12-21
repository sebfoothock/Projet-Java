package model;
import java.util.Scanner;
/**
 * @author MASSON JULIEN, LAMBERT MAXIMLILIEN, RAEMDONCK SEBASTIEN 2TL2
 * GROUPE 17
 * 
 * This class is the constructor to create one case of the play mat cases 
 */
public class Case {
	
	private int num;
	private String parity;
	private String color;
	private int intervals;
	private int column;
	public Case(int num, String parity, String color, int intervals, int column){
		this.num = num;
		this.parity = parity;
		this.color = color;
		this.intervals = intervals;
		this.column = column;
	}
	
	/**
	 * @return the color of the case
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return the number of the case
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @return the parity of the case
	 */
	public String getParity() {
		return parity;
	}
	/**
	 * @return the interval of the case
	 */
	public int getIntervals() {
		return intervals;
	}
	/**
	 * @return the column of the case
	 */
	public int getColumn() {
		return column;
	}

}
