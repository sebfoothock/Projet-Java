package View;
/*
 *@author Raemdonck Sébastien 2TL2 
 * The JPanel Class
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PlayMats extends JPanel {

	private ImageIcon image;
	private Image mats;
	private Color color;
	
	public PlayMats() {
		super();
		this.color = new Color(1, 123, 50);
		super.setBackground(color);
		this.image = new ImageIcon(getClass().getResource("/image/roulette.png"));
		this.mats = image.getImage();
		JButton button = new JButton("Start the wheel");
		JLabel label = new JLabel("Welcome");
		JTextField money = new JTextField(10);//The length is 10px
		JTextArea instruction = new JTextArea(25, 40);
		ButtonGroup bet = new ButtonGroup();
		JRadioButton even = new JRadioButton("pari pair");
		JRadioButton odd = new JRadioButton("pari impair");
		JRadioButton int1 = new JRadioButton("intervalle 1-18");
		JRadioButton int2 = new JRadioButton("intervalle 19-36");
		JRadioButton int3 = new JRadioButton("intervalle 1-12");
		JRadioButton int4 = new JRadioButton("intervalle 13-24");
		JRadioButton int5 = new JRadioButton("intervalle 25-36");
		JRadioButton betNb = new JRadioButton("pari sur un nombre");
		
		JPanel panel = new JPanel();
		

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instruction.append("The roulette had been launch !\n");
				System.out.println("The roulette had been launch !");
			}
		});
		
		//setLayout(new GridBagLayout());//add a gridbagLayout to the JPanel
		GridBagConstraints gc = new GridBagConstraints(); //define the position and the size of the element
		GridBagLayout gcb = new GridBagLayout();
		setLayout(gcb);
		gcb.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gcb.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gcb.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gcb.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};

		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 2;
		gc.gridy = 18;
		add(button,gc);
		
		gc.gridx = 10;
		gc.gridy = 10;
		add(money,gc);
		
		//gc.anchor = GridBagConstraints.LAST_LINE_START;//en bas à gauche
		gc.gridx = 0;
		gc.gridy = 20;
		add(new JScrollPane(instruction),gc);
		
		gc.gridx = 10;
		gc.gridy = 3;
		add(label,gc);
		
		gc.gridx = 5;
		gc.gridy = 15;
		//bet.add(even,gc);
		
		
		//setLayout(new BorderLayout());
		//add(new JScrollPane(instruction), BorderLayout.WEST);
	

		
		//add(label);
		//add(money);
		//add(new JScrollPane(instruction));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(mats, 515, 0, null);
	}
	

}
