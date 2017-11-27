package test;

import java.awt.Dimension;
import java.awt.EventQueue;

import controller.ControllerParis;
import model.ModelParis;
import view.ViewBetConsole;
import view.ViewParisFenetre;

public class Test {
	private static ViewParisFenetre vue;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					//cons = new ViewBetConsole();
					vue = new ViewParisFenetre();
					vue.setVisible(true);
					vue.setTitle("Wheel");
					vue.setSize(new Dimension(1050, 816));
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}
