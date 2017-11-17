package View;
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
	private Image mats;
	private Color color;
	private JTextField bet;
	private JPanel contentPane;

	public PlayMats() {
		super();
		this.color = new Color(1, 123, 50);
		super.setBackground(color);
		this.image = new ImageIcon(getClass().getResource("/image/roulette.png"));
		this.mats = image.getImage();
		this.bet = new JTextField();
		JButton button = new JButton("Start the wheel");
		JLabel label = new JLabel("Welcome");
		JTextField mise = new JTextField(10);
		/*
		 * The length is 10px
		 */
		JTextArea instruction = new JTextArea(35, 20);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instruction.append("The roulette had been launch !\n");
				System.out.println("The roulette had been launch !");
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
		add(bet);
		add(new JScrollPane(instruction));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(mats, 515, 0, null);
	}
}

