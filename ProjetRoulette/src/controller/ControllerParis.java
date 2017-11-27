package controller;
import java.awt.Dimension;
import java.awt.EventQueue;

import model.ModelParis;
import view.ViewBetConsole;
import view.ViewParisFenetre;

public class ControllerParis {
	private static ModelParis model;
	private static ViewParisFenetre vue;
	private static ViewBetConsole cons;
	
	public ControllerParis(ModelParis p){
		model = p;
	}
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
