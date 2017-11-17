package vue;
/*
 *@author Raemdonck Sébastien 2TL2 
 * The JPanel Class
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PlayMats extends JPanel {

	private ImageIcon image;
	private Image tapis;
	private Color couleur;
	private JTextField mise;
	private JPanel contentPane;

	public PlayMats() {
		super();
		this.couleur = new Color(1, 123, 50);
		super.setBackground(couleur);
		this.image = new ImageIcon(getClass().getResource("/image/roulette.png"));
		this.tapis = image.getImage();
		this.mise = new JTextField();
		JButton button = new JButton("Lancer la roue");
		JLabel label = new JLabel("Bienvenue");
		JTextField mise = new JTextField(10);
		/*
		 * champ texte de taille de 10 px
		 */
		JTextArea instruction = new JTextArea(35, 20);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instruction.append("La roulette a été lancé !\n");
				System.out.println("La roulette a été lancé !");
			}
		});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		/*
		 * rows, columns, hgap, vgap
		 */
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		add(button);
		add(label);
		add(mise);
		add(new JScrollPane(instruction));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(tapis, 515, 0, null);
	}
}
