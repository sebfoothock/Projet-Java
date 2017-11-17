package model;
import java.util.Scanner;
/**
 * 
 * @author Sébastien Raemdonck 2TL2
 * This class is the costructor to create one case of the play mat cases 
 */
public class Case {
	
	private int num;
	private String parity;
	private String color;
	private int intervals;
	int column;
	/**
	 * The constructor of the differents caracteristics of a case 
	 * @param num the number of the case
	 * @param parity the parity (odd or even)
	 * @param color the color (red or black)
	 * @param intervals the interval where the case is 
	 * @param column the columns where the case is  
	 */
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
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getParity() {
		return parity;
	}
	public void setParity(String parity) {
		this.parity = parity;
	}
	public int getIntervals() {
		return intervals;
	}
	public void setIntervals(int intervals) {
		this.intervals = intervals;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
}
