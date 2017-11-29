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
