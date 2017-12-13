package model;
import java.util.Scanner;
/**
 * 
 * @author JULIEN
 * This class is the costructor to create one case of the play mat cases 
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
