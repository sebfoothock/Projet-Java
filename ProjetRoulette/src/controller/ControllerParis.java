package controller;

import java.awt.Dimension;
import java.awt.EventQueue;

import model.ModelParis;
import view.ViewParisFenetre;

public class ControllerParis {
	private static ModelParis model;
	private static ViewParisFenetre vue;

	public ControllerParis(ModelParis p) {
		model = p;
	}

	public static void main(String[] args) {
		ViewParisFenetre frame = new ViewParisFenetre();
		frame.setVisible(true);
		frame.setTitle("vue");
		frame.setSize(new Dimension(1030, 803));
		frame.setResizable(false);

	}
}
