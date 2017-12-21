package view;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * This class is the class that insert the background image in the main window "ViewBetGUI"
 * @author MASSON JULIEN RAEMDONCK SEBASTIEN LAMBERT MAXIMILIEN 2TL2
 * GROUPE 17
 *
 */
public class ViewBetWindow extends JFrame {
    private static ViewBetWindow vue = new ViewBetWindow();
    public ViewBetWindow(){
        this.setContentPane(new ViewBetGUI(new ImageIcon("img\\jeuVierge3.jpg").getImage()));
    }
    /**
     * Allows to open the window GUI with the background image 
     */
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
    /**
     * Allow to close the window
     */
    public static void closeWindow() {
    	vue.dispose();
    }
}