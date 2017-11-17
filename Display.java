package View;
/*
 * @author Raemdonck Sébastien 2TL2
 * The JFrame class
 */

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;

public class Display {

	public static PlayMats table;

	public static void main(String[] args) throws ParseException {
		JFrame f = new JFrame("Roulette Game");
		f.setSize(1500, 900);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		/*
		 * The windows appear in the middle of screen
		 */
		f.setResizable(false);
		f.setAlwaysOnTop(true);

		table = new PlayMats();

		f.setContentPane(table);
		/*
		 * to attach the "TableJeu" class to the JFrame
		 */
		f.setVisible(true);

	}

}
