package test;
import java.awt.EventQueue;

import controller.ControllerParis;
import model.ModelParis;
import model.SQL;
import view.ViewBetConsole;
import view.ViewBetHome;
import view.ViewParisFenetre;

public class Test {
	private static ViewParisFenetre vue;
	private static ViewBetConsole cons;
	public static void main(String[] args) {
		ViewBetHome.openHome();
		/**
		SQL.recup();
		ViewParisFenetre.window();
		ViewBetConsole.cons();
		**/
	}
}
