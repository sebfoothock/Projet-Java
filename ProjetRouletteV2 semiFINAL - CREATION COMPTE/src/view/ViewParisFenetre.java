package view;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//import model.ModelParis;
//import model.SQL;
 
public class ViewParisFenetre extends JFrame {
    private static final long serialVersionUID = 1L;
    private static ViewParisFenetre vue = new ViewParisFenetre();
    public ViewParisFenetre(){
        this.setContentPane(new ViewParisGUI(new ImageIcon("img\\jeuVierge3.jpg").getImage()));
    }
    public static void window() {
    EventQueue.invokeLater(new Runnable(){
		public void run(){
			try{
				vue.setVisible(true);
				vue.setTitle("Wheel");
				vue.setSize(new Dimension(1030, 803));
				vue.setResizable(false);
				//ViewBetConsole cons = new ViewBetConsole();

			} catch(Exception e){
				e.printStackTrace();
			}
		}
	});
    }
    public static void closeWindow() {
    	vue.dispose();
    }
}
