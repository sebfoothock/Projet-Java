package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import model.ModelParis;

public class ViewParis extends JFrame implements ActionListener{
	JRadioButton [] j;
	JRadioButton spin;
	JRadioButton numCase;
	JRadioButton red;
	JRadioButton black;
	JRadioButton even;
	JRadioButton odd;
	JRadioButton firstDiv2;
	JRadioButton secondDiv2;
	JRadioButton interOne;
	JRadioButton interTwo;
	JRadioButton interThree;
	JRadioButton columnOne;
	JRadioButton columnTwo;
	JRadioButton columnThree;
	JRadioButton parisUn;
	JRadioButton parisDeux;
	JRadioButton parisTrois;
	JRadioButton parisQuatre;
	JRadioButton parisCinq;
	ButtonGroup groupUn;
	ButtonGroup groupDeux;
	private JLabel cbParis;
	public static JLabel paris;
	static int numParis;
	public ViewParis(){
		setBounds(100, 100, 798, 619);
		setBackground(new Color(0, 128, 0));
		j = new JRadioButton[37];
		// PREMIERE LIGNE
		Box radioButtonUn = Box.createHorizontalBox();
		firstDiv2 = new JRadioButton("1 to 18");
		firstDiv2.setActionCommand("47");
		radioButtonUn.add(firstDiv2);
		secondDiv2 = new JRadioButton("19 to 36");
		secondDiv2.setActionCommand("48");
		radioButtonUn.add(secondDiv2);
		
		
		Box radioButtonDeux = Box.createHorizontalBox();
		for(int i =3; i<37; i ++) {
			j[i] = new JRadioButton(Integer.toString(i));
			j[i].setActionCommand(Integer.toString(i));
			radioButtonDeux.add(j[i]);
			i++;
			i++;
		}
		columnOne = new JRadioButton("2 to 1");
		columnOne.setActionCommand("44");
		radioButtonDeux.add(columnOne);

		Box radioButtonTrois = Box.createHorizontalBox();
		// j[0] = new JRadioButton(Integer.toString(0));
		// j[0].setActionCommand(Integer.toString(0));
		// radioButtonTrois.add(j[0]);
		for(int i =2; i<37; i ++) {
			j[i] = new JRadioButton(Integer.toString(i));
			j[i].setActionCommand(Integer.toString(i));
			radioButtonTrois.add(j[i]);
			i++;
			i++;
		}
		columnTwo = new JRadioButton("2 to 1");
		columnTwo.setActionCommand("45");
		radioButtonTrois.add(columnTwo);

		Box radioButtonQuatre = Box.createHorizontalBox();
		for(int i =1; i<37; i ++) {
			j[i] = new JRadioButton(Integer.toString(i));
			j[i].setActionCommand(Integer.toString(i));
			radioButtonQuatre.add(j[i]);
			i++;
			i++;
		}
		columnThree = new JRadioButton("2 to 1");
		columnThree.setActionCommand("46");
		radioButtonQuatre.add(columnThree);
		
		
		Box radioButtonCinq = Box.createHorizontalBox();
		interOne = new JRadioButton("1 to 12");
		interOne.setActionCommand("41");
		radioButtonCinq.add(interOne);
		
		interTwo = new JRadioButton("13 to 24");
		interTwo.setActionCommand("42");
		radioButtonCinq.add(interTwo);
		
		interThree = new JRadioButton("25 to 36");
		interThree.setActionCommand("43");
		radioButtonCinq.add(interThree);
		
        
        
        Box radioButtonSix = Box.createHorizontalBox();
        even = new JRadioButton("Even");
        even.setActionCommand("39");
        radioButtonSix.add(even);
        
        red = new JRadioButton("Red");
        red.setActionCommand("37");
        radioButtonSix.add(red);
        
        black = new JRadioButton("Black");
        black.setActionCommand("38");
        radioButtonSix.add(black);
        
        odd = new JRadioButton("Odd");
        odd.setActionCommand("40");
        radioButtonSix.add(odd);
        
        Box radioButtonSept = Box.createHorizontalBox();
        cbParis = new JLabel("Combien voulez vous parier?");
        
        parisUn = new JRadioButton("1");
        parisUn.setActionCommand("1");
        radioButtonSept.add(parisUn);
        
        parisDeux = new JRadioButton("5");
        parisDeux.setActionCommand("5");
        radioButtonSept.add(parisDeux);
        
        parisTrois = new JRadioButton("10");
        parisTrois.setActionCommand("10");
        radioButtonSept.add(parisTrois);
        
        parisQuatre = new JRadioButton("25");
        parisQuatre.setActionCommand("25");
        radioButtonSept.add(parisQuatre);
        
        parisCinq = new JRadioButton("50");
        parisCinq.setActionCommand("50");
        radioButtonSept.add(parisCinq);
        
		//METTRE EN COULEUR
        for(int i = 1; i <37; i++) {
        	if(i == 11) {
        		j[i].setBackground(Color.BLACK);
            	j[i].setForeground(Color.WHITE);
        	} else if(i == 20){
        		j[19].setBackground(Color.RED);
	        	j[19].setForeground(Color.WHITE);
	        	j[i].setBackground(Color.BLACK);
	        	j[i].setForeground(Color.WHITE);
        	} else if(i == 29) {
            	j[29].setBackground(Color.BLACK);
            	j[29].setForeground(Color.WHITE);
        	} else if(i == 36){
	        	j[i].setBackground(Color.RED);
	        	j[i].setForeground(Color.WHITE);
        	} else {
	        	j[i].setBackground(Color.RED);
	        	j[i].setForeground(Color.WHITE);
	        	i++;
	        	j[i].setBackground(Color.BLACK);
	        	j[i].setForeground(Color.WHITE);
        	}
        }
		
		
        //group
        groupUn = new ButtonGroup();
        for(int i = 0; i<37; i++) {
        	groupUn.add(j[i]);
        }
        groupUn.add(numCase);
        groupUn.add(red);
        groupUn.add(black);
        groupUn.add(even);
        groupUn.add(odd);
        groupUn.add(firstDiv2);
        groupUn.add(secondDiv2);
        groupUn.add(interOne);
        groupUn.add(interTwo);
        groupUn.add(interThree);	
        groupUn.add(columnOne);
        groupUn.add(columnTwo);
        groupUn.add(columnThree);
        
        groupDeux = new ButtonGroup();
        groupDeux.add(parisUn);
        groupDeux.add(parisDeux);
        groupDeux.add(parisTrois);
        groupDeux.add(parisQuatre);
        groupDeux.add(parisCinq);
        //le buton spin
        Box spinBox = Box.createHorizontalBox();
        JButton spin = new JButton("Spin");
        spinBox.add(spin);
        //ecouteurs
        spin.addActionListener(this);
        
        //champ texte
        Box textBox = Box.createHorizontalBox();
        paris = new JLabel("Faites un paris! Votre solde est de : " + ModelParis.getTotal());
        textBox.add(paris);
        
        //tout mettre dans la frame
        Box panelbox = Box.createVerticalBox();
		setContentPane(panelbox);
		panelbox.add(radioButtonUn);
		panelbox.add(radioButtonDeux);
		panelbox.add(radioButtonTrois);
		panelbox.add(radioButtonQuatre);
		panelbox.add(radioButtonCinq);
		panelbox.add(radioButtonSix);
		panelbox.add(radioButtonSept);
		panelbox.add(spinBox);
		panelbox.add(textBox);
        pack();
        
       
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "Spin":
			if(groupDeux.getSelection() == null) {
				paris.setText("Veuillez selectionner un montant à parier");
			} else if(groupUn.getSelection() == null) {
				paris.setText("Veuillez selectionner une case sur laquelle parier");
			} else if(red.isSelected()) {
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(), Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(black.isSelected()) {
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(even.isSelected()) {
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(odd.isSelected()) {
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(firstDiv2.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(secondDiv2.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(interOne.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(interTwo.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(interThree.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(columnOne.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(columnTwo.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else if(columnThree.isSelected()){
				setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
				ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
			} else {
				for(int i =1; i <37; i++) {
					if(j[i].isSelected()) {
						setNumParis(Integer.parseInt(groupUn.getSelection().getActionCommand()));
						ModelParis model = new ModelParis(getNumParis(),  Integer.parseInt(groupDeux.getSelection().getActionCommand()));
					}
				}
			}
			break;
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					ViewParis frame = new ViewParis();
					frame.setVisible(true);
					frame.setTitle("vue");
					frame.pack();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}




	public static int getNumParis() {
		return numParis;
	}




	public void setNumParis(int numParis) {
		this.numParis = numParis;
	}
}
