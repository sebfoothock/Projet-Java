package test;

import java.awt.Dimension;
import java.awt.EventQueue;

import controller.ControllerParis;
import model.ModelParis;
import model.SQL;
import view.ViewBetConsole;
import view.ViewParisFenetre;

public class Test {
	private static ViewParisFenetre vue;
	private static ViewBetConsole cons;
	public static void main(String[] args) {
		SQL.recup();
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				
				try{
					
					vue = new ViewParisFenetre();
					vue.setVisible(true);
					vue.setTitle("Wheel");
					vue.setSize(new Dimension(1050, 816));
					//cons = new ViewBetConsole();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}
