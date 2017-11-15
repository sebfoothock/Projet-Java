package jeu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class TableJeu extends JPanel{
	
	private ImageIcon image; 
	private Image tapis;
	private Color couleur;
	
	public TableJeu() {
		super();
		this.couleur = new Color (1, 123, 50);
		super.setBackground(couleur);
		this.image = new ImageIcon(getClass().getResource("/image/roulette.png"));
		this.tapis = image.getImage();
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//l'élément graphique est le g
		g.drawImage(tapis, 515, 0, null);
	}
	
}
