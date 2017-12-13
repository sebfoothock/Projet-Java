package view;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Bet;
import model.SQL;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import controller.BetController;
/**
 * This class is the GUI view of the application
 * @author JULIEN
 *
 */
public class ViewBetGUI extends JPanel implements ActionListener{
 
    private static final long serialVersionUID = 1L;
 

    private Image img;
    private model.Sound sound;
    private JLabel balanceAmount;
    private  static JLabel totalWon;
    private static JLabel totalLost;
    private static JLabel totalWL;
    private static JLabel bet;
    private static JLabel nbWon;
    private static JLabel nbFailed;
	private JLabel lblTotalWon;
	private static JLabel errorMsg;
	private JLabel lblTotalLost;
	private JLabel lblWl;
	private static JLabel gameLost;
	private static JLabel gameWon;
	
	static int numBet;
	static int select;
	
    JRadioButton j0;
    //
    JRadioButton j1;
    JRadioButton j4;
    JRadioButton j7;
    JRadioButton j10;
    JRadioButton j13;
    JRadioButton j16;
    JRadioButton j19;
    JRadioButton j22;
    JRadioButton j25;
    JRadioButton j28;
    JRadioButton j31;
    JRadioButton j34;
    //
    JRadioButton j2;
    JRadioButton j5;
    JRadioButton j8;
    JRadioButton j11;
    JRadioButton j14;
    JRadioButton j17;
    JRadioButton j20;
    JRadioButton j23;
    JRadioButton j26;
    JRadioButton j29;
    JRadioButton j32;
    JRadioButton j35;
    //
    JRadioButton j3;
    JRadioButton j6;
    JRadioButton j9;
    JRadioButton j12;
    JRadioButton j15;
    JRadioButton j18;
    JRadioButton j21;
    JRadioButton j24;
    JRadioButton j27;
    JRadioButton j30;
    JRadioButton j33;
    JRadioButton j36;
    //
	JRadioButton red;
	JRadioButton black;
	//
	JRadioButton even;
	JRadioButton odd;
	//
	JRadioButton firstDiv2;
	JRadioButton secondDiv2;
	//
	JRadioButton interOne;
	JRadioButton interTwo;
	JRadioButton interThree;
	//
	JRadioButton columnOne;
	JRadioButton columnTwo;
	JRadioButton columnThree;
	//
	JRadioButton betOne;
	JRadioButton betTwo;
	JRadioButton betThree;
	JRadioButton betFour;
	JRadioButton betFive;
	//
	ButtonGroup groupOne;
	ButtonGroup groupTwo;
	//
	private JButton spin;
	JButton reset;
	JButton quit;
	// 
	

    /**
     * The window
     */
    public ViewBetGUI(Image img){
        this.img = img;
        
        balanceAmount = new JLabel("BALANCE AMOUNT");
        balanceAmount.setForeground(Color.WHITE);
        balanceAmount.setFont(new Font("Stencil", Font.PLAIN, 16));
        
        bet = new JLabel(Integer.toString(SQL.getTotal()) + "€");
        bet.setForeground(Color.WHITE);
        bet.setFont(new Font("Stencil", Font.PLAIN, 16));
        
        columnThree = new JRadioButton("3rd");
        columnThree.setFont(new Font("Stencil", Font.PLAIN, 14));
        columnThree.setBackground(new Color(1, 123, 50));
        columnThree.setForeground(Color.WHITE);
        columnThree.setActionCommand("46");
        
        columnTwo = new JRadioButton("2nd");
        columnTwo.setForeground(Color.WHITE);
        columnTwo.setBackground(new Color(1, 123, 50));
        columnTwo.setFont(new Font("Stencil", Font.PLAIN, 14));
        columnTwo.setActionCommand("45");
        
        columnOne = new JRadioButton("1ST");
        columnOne.setFont(new Font("Stencil", Font.PLAIN, 14));
        columnOne.setForeground(Color.WHITE);
        columnOne.setBackground(new Color(1, 123, 50));
        columnOne.setActionCommand("44");
        
        interOne = new JRadioButton("1 TO 12");
        interOne.setBackground(new Color(1,123,50));
        interOne.setForeground(Color.WHITE);
        interOne.setFont(new Font("Stencil", Font.PLAIN, 28));
        interOne.setActionCommand("41");
        
        interTwo = new JRadioButton("13 to 24");
        interTwo.setBackground(new Color(1,123,50));
        interTwo.setForeground(Color.WHITE);
        interTwo.setFont(new Font("Stencil", Font.PLAIN, 28));
        interTwo.setActionCommand("42");
        
        interThree = new JRadioButton("25 TO 36");
        interThree.setBackground(new Color(1,123,50));
        interThree.setForeground(Color.WHITE);
        interThree.setFont(new Font("Stencil", Font.PLAIN, 28));
        interThree.setActionCommand("43");
        
        firstDiv2 = new JRadioButton("1 - 18");
        firstDiv2.setBackground(new Color(1,123,50));
        firstDiv2.setForeground(Color.WHITE);
        firstDiv2.setFont(new Font("Stencil", Font.PLAIN, 28));
        firstDiv2.setActionCommand("47");
        
        even = new JRadioButton("EVEN");
        even.setBackground(new Color(1,123,50));
        even.setForeground(Color.WHITE);
        even.setFont(new Font("Stencil", Font.PLAIN, 28));
        even.setActionCommand("39");
        
        red = new JRadioButton("RED");
        red.setForeground(Color.WHITE);
        red.setBackground(Color.RED);
        red.setFont(new Font("Stencil", Font.PLAIN, 28));
        red.setActionCommand("37");
        
        black = new JRadioButton("BLACK");
        black.setFont(new Font("Stencil", Font.PLAIN, 28));
        black.setBackground(Color.BLACK);
        black.setForeground(Color.WHITE);
        black.setActionCommand("38");
        black.setOpaque(false);
        
        odd = new JRadioButton("ODD");
        odd.setFont(new Font("Stencil", Font.PLAIN, 28));
        odd.setBackground(new Color(1,123,50));
        odd.setForeground(Color.WHITE);
        odd.setActionCommand("40");
        
        secondDiv2 = new JRadioButton("19 - 36");
        secondDiv2.setBackground(new Color(1,123,50));
        secondDiv2.setForeground(Color.WHITE);
        secondDiv2.setFont(new Font("Stencil", Font.PLAIN, 28));
        secondDiv2.setActionCommand("48");
        
        j0 = new JRadioButton("0");
        j0.setForeground(Color.WHITE);
        j0.setFont(new Font("Stencil", Font.PLAIN, 20));
        j0.setActionCommand("0");
        j0.setOpaque(false);
        
        j1 = new JRadioButton("1");
        j1.setFont(new Font("Stencil", Font.PLAIN, 20));
        j1.setBackground(Color.RED);
        j1.setForeground(Color.WHITE);
        j1.setActionCommand("1");
        
        j4 = new JRadioButton("4");
        j4.setForeground(Color.WHITE);
        j4.setBackground(Color.BLACK);
        j4.setFont(new Font("Stencil", Font.PLAIN, 20));
        j4.setActionCommand("4");
        
        j7 = new JRadioButton("7");
        j7.setFont(new Font("Stencil", Font.PLAIN, 20));
        j7.setForeground(Color.WHITE);
        j7.setBackground(Color.RED);
        j7.setActionCommand("7");
        
        j10 = new JRadioButton("10");
        j10.setBackground(Color.BLACK);
        j10.setForeground(Color.WHITE);
        j10.setFont(new Font("Stencil", Font.PLAIN, 20));
        j10.setActionCommand("10");
        
        j13 = new JRadioButton("13");
        j13.setBackground(Color.BLACK);
        j13.setFont(new Font("Stencil", Font.PLAIN, 20));
        j13.setForeground(Color.WHITE);
        j13.setActionCommand("13");
        
        j16 = new JRadioButton("16");
        j16.setFont(new Font("Stencil", Font.PLAIN, 20));
        j16.setBackground(Color.RED);
        j16.setForeground(Color.WHITE);
        j16.setActionCommand("16");
        
        j19 = new JRadioButton("19");
        j19.setBackground(Color.RED);
        j19.setFont(new Font("Stencil", Font.PLAIN, 20));
        j19.setForeground(Color.WHITE);
        j19.setActionCommand("19");
        
        j22 = new JRadioButton("22");
        j22.setFont(new Font("Stencil", Font.PLAIN, 20));
        j22.setBackground(Color.BLACK);
        j22.setForeground(Color.WHITE);
        j22.setActionCommand("22");
        
        j25 = new JRadioButton("25");
        j25.setBackground(Color.RED);
        j25.setForeground(Color.WHITE);
        j25.setFont(new Font("Stencil", Font.PLAIN, 20));
        j25.setActionCommand("25");
        
        j28 = new JRadioButton("28");
        j28.setForeground(Color.WHITE);
        j28.setBackground(Color.BLACK);
        j28.setFont(new Font("Stencil", Font.PLAIN, 20));
        j28.setActionCommand("28");
        
        j31 = new JRadioButton("31");
        j31.setBackground(Color.BLACK);
        j31.setForeground(Color.WHITE);
        j31.setFont(new Font("Stencil", Font.PLAIN, 20));
        j31.setActionCommand("31");
        
        j34 = new JRadioButton("34");
        j34.setForeground(Color.WHITE);
        j34.setFont(new Font("Stencil", Font.PLAIN, 20));
        j34.setBackground(Color.RED);
        j34.setActionCommand("34");
        
        j2 = new JRadioButton("2");
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);
        j2.setFont(new Font("Stencil", Font.PLAIN, 20));
        j2.setActionCommand("2");
        
        j5 = new JRadioButton("5");
        j5.setForeground(Color.WHITE);
        j5.setFont(new Font("Stencil", Font.PLAIN, 20));
        j5.setBackground(Color.RED);
        j5.setActionCommand("5");
        
        j8 = new JRadioButton("8");
        j8.setFont(new Font("Stencil", Font.PLAIN, 20));
        j8.setBackground(Color.BLACK);
        j8.setForeground(Color.WHITE);
        j8.setActionCommand("8");
        
        j11 = new JRadioButton("11");
        j11.setForeground(Color.WHITE);
        j11.setBackground(Color.BLACK);
        j11.setFont(new Font("Stencil", Font.PLAIN, 20));
        j11.setActionCommand("11");
        
        j14 = new JRadioButton("14");
        j14.setBackground(Color.RED);
        j14.setFont(new Font("Stencil", Font.PLAIN, 20));
        j14.setForeground(Color.WHITE);
        j14.setActionCommand("14");
        
        j17 = new JRadioButton("17");
        j17.setForeground(Color.WHITE);
        j17.setFont(new Font("Stencil", Font.PLAIN, 20));
        j17.setBackground(Color.BLACK);
        j17.setActionCommand("17");
        
        j20 = new JRadioButton("20");
        j20.setFont(new Font("Stencil", Font.PLAIN, 20));
        j20.setBackground(Color.BLACK);
        j20.setForeground(Color.WHITE);
        j20.setActionCommand("20");
        
        j23 = new JRadioButton("23");
        j23.setBackground(Color.RED);
        j23.setForeground(Color.WHITE);
        j23.setFont(new Font("Stencil", Font.PLAIN, 20));
        j23.setActionCommand("23");
        
        j26 = new JRadioButton("26");
        j26.setFont(new Font("Stencil", Font.PLAIN, 20));
        j26.setForeground(Color.WHITE);
        j26.setBackground(Color.BLACK);
        j26.setActionCommand("26");
        
        j29 = new JRadioButton("29");
        j29.setFont(new Font("Stencil", Font.PLAIN, 20));
        j29.setForeground(Color.WHITE);
        j29.setBackground(Color.BLACK);
        j29.setActionCommand("29");
        
        j32 = new JRadioButton("32");
        j32.setFont(new Font("Stencil", Font.PLAIN, 20));
        j32.setForeground(Color.WHITE);
        j32.setBackground(Color.RED);
        j32.setActionCommand("32");
        
        j35 = new JRadioButton("35");
        j35.setForeground(Color.WHITE);
        j35.setBackground(Color.BLACK);
        j35.setFont(new Font("Stencil", Font.PLAIN, 20));
        j35.setActionCommand("35");
        
        j3 = new JRadioButton("3");
        j3.setForeground(Color.WHITE);
        j3.setFont(new Font("Stencil", Font.PLAIN, 20));
        j3.setBackground(Color.RED);
        j3.setActionCommand("3");
        
        j6 = new JRadioButton("6");
        j6.setForeground(Color.WHITE);
        j6.setFont(new Font("Stencil", Font.PLAIN, 20));
        j6.setBackground(Color.BLACK);
        j6.setActionCommand("6");
        
        j9 = new JRadioButton("9");
        j9.setFont(new Font("Stencil", Font.PLAIN, 20));
        j9.setForeground(Color.WHITE);
        j9.setBackground(Color.RED);
        j9.setActionCommand("9");
        
        j12 = new JRadioButton("12");
        j12.setFont(new Font("Stencil", Font.PLAIN, 20));
        j12.setForeground(Color.WHITE);
        j12.setBackground(Color.RED);
        j12.setActionCommand("12");
        
        j15 = new JRadioButton("15");
        j15.setFont(new Font("Stencil", Font.PLAIN, 20));
        j15.setForeground(Color.WHITE);
        j15.setBackground(Color.BLACK);
        j15.setActionCommand("15");
        
        j18 = new JRadioButton("18");
        j18.setFont(new Font("Stencil", Font.PLAIN, 20));
        j18.setForeground(Color.WHITE);
        j18.setBackground(Color.RED);
        j18.setActionCommand("18");
        
        j21 = new JRadioButton("21");
        j21.setFont(new Font("Stencil", Font.PLAIN, 20));
        j21.setForeground(Color.WHITE);
        j21.setBackground(Color.RED);
        j21.setActionCommand("21");
        
        j24 = new JRadioButton("24");
        j24.setFont(new Font("Stencil", Font.PLAIN, 20));
        j24.setForeground(Color.WHITE);
        j24.setBackground(Color.BLACK);
        j24.setActionCommand("24");
        
        j27 = new JRadioButton("27");
        j27.setFont(new Font("Stencil", Font.PLAIN, 20));
        j27.setForeground(Color.WHITE);
        j27.setBackground(Color.RED);
        j27.setActionCommand("27");
        
        j30 = new JRadioButton("30");
        j30.setFont(new Font("Stencil", Font.PLAIN, 20));
        j30.setForeground(Color.WHITE);
        j30.setBackground(Color.RED);
        j30.setActionCommand("30");
        
        j33 = new JRadioButton("33");
        j33.setFont(new Font("Stencil", Font.PLAIN, 20));
        j33.setForeground(Color.WHITE);
        j33.setBackground(Color.BLACK);
        j33.setActionCommand("33");
        
        j36 = new JRadioButton("36");
        j36.setFont(new Font("Stencil", Font.PLAIN, 20));
        j36.setForeground(Color.WHITE);
        j36.setBackground(Color.RED);
        j36.setActionCommand("36");
        
       
        
        betOne = new JRadioButton("");
        betOne.setHorizontalAlignment(SwingConstants.RIGHT);
        betOne.setActionCommand("1");
        betOne.setOpaque(false);
        
        betTwo = new JRadioButton("");
        betTwo.setHorizontalAlignment(SwingConstants.CENTER);
        betTwo.setActionCommand("5");
        betTwo.setOpaque(false);
        
        betThree = new JRadioButton("");
        betThree.setHorizontalAlignment(SwingConstants.RIGHT);
        betThree.setOpaque(false);
        betThree.setActionCommand("50");
        
        betFour = new JRadioButton("");
        betFour.setHorizontalAlignment(SwingConstants.RIGHT);
        betFour.setOpaque(false);
        betFour.setActionCommand("100");
        
        betFive = new JRadioButton("");
        betFive.setHorizontalAlignment(SwingConstants.RIGHT);
        betFive.setActionCommand("500");
        betFive.setOpaque(false);
       
        
        errorMsg = new JLabel("Let's bet !");
        errorMsg.setForeground(Color.WHITE);
        errorMsg.setFont(new Font("Stencil", Font.PLAIN, 20));
        
        lblTotalWon = new JLabel("Total won");
        lblTotalWon.setForeground(Color.WHITE);
        lblTotalWon.setFont(new Font("Stencil", Font.PLAIN, 16));
        
        lblTotalLost = new JLabel("TOTAL LOST");
        lblTotalLost.setForeground(Color.WHITE);
        lblTotalLost.setFont(new Font("Stencil", Font.PLAIN, 16));
        
        lblWl = new JLabel("W/L");
        lblWl.setFont(new Font("Stencil", Font.PLAIN, 20));
        lblWl.setForeground(Color.WHITE);
        
        totalWon = new JLabel(Double.toString(Bet.getTotalWon()) + "€");
        totalWon.setFont(new Font("Stencil", Font.PLAIN, 20));
        totalWon.setForeground(Color.WHITE);
        
        groupOne = new ButtonGroup();
        groupOne.add(j0);
        groupOne.add(j1);
        groupOne.add(j2);
        groupOne.add(j3);
        groupOne.add(j4);
        groupOne.add(j5);
        groupOne.add(j6);
        groupOne.add(j7);
        groupOne.add(j8);
        groupOne.add(j9);
        groupOne.add(j10);
        groupOne.add(j11);
        groupOne.add(j12);
        groupOne.add(j13);
        groupOne.add(j14);
        groupOne.add(j15);
        groupOne.add(j16);
        groupOne.add(j17);
        groupOne.add(j18);
        groupOne.add(j19);
        groupOne.add(j20);
        groupOne.add(j21);
        groupOne.add(j22);
        groupOne.add(j23);
        groupOne.add(j24);
        groupOne.add(j25);
        groupOne.add(j26);
        groupOne.add(j27);
        groupOne.add(j28);
        groupOne.add(j29);
        groupOne.add(j30);
        groupOne.add(j31);
        groupOne.add(j32);
        groupOne.add(j33);
        groupOne.add(j34);
        groupOne.add(j35);
        groupOne.add(j36);
        groupOne.add(red);
        groupOne.add(black);
        groupOne.add(even);
        groupOne.add(odd);
        groupOne.add(firstDiv2);
        groupOne.add(secondDiv2);
        groupOne.add(interOne);
        groupOne.add(interTwo);
        groupOne.add(interThree);	
        groupOne.add(columnOne);
        groupOne.add(columnTwo);
        groupOne.add(columnThree);
      
        
        groupTwo = new ButtonGroup();
        groupTwo.add(betOne);
        groupTwo.add(betTwo);
        groupTwo.add(betThree);
        groupTwo.add(betFour);
        groupTwo.add(betFive);
        
        totalLost = new JLabel(Double.toString(Bet.getTotalLost()) + "€");
        totalLost.setHorizontalAlignment(SwingConstants.CENTER);
        totalLost.setForeground(Color.WHITE);
        totalLost.setFont(new Font("Stencil", Font.PLAIN, 20));
        
        totalWL = new JLabel(Double.toString(Bet.getTotalWL()) + "€");
        totalWL.setForeground(Color.WHITE);
        totalWL.setFont(new Font("Stencil", Font.PLAIN, 20));
        
        gameWon = new JLabel("Game Won");
        gameWon.setHorizontalAlignment(SwingConstants.CENTER);
        gameWon.setForeground(Color.WHITE);
        gameWon.setFont(new Font("Stencil", Font.PLAIN, 16));
        
        nbWon = new JLabel(Integer.toString((int)Bet.getNbWon()));
        nbWon.setVerticalAlignment(SwingConstants.TOP);
        nbWon.setHorizontalAlignment(SwingConstants.CENTER);
        nbWon.setForeground(Color.WHITE);
        nbWon.setFont(new Font("Stencil", Font.PLAIN, 20));
        
        gameLost = new JLabel("Game FAiled");
        gameLost.setVerticalAlignment(SwingConstants.TOP);
        gameLost.setHorizontalAlignment(SwingConstants.CENTER);
        gameLost.setFont(new Font("Stencil", Font.PLAIN, 16));
        gameLost.setForeground(Color.WHITE);
        
        nbFailed = new JLabel(Integer.toString((int)Bet.getNbLost()));
        nbFailed.setForeground(Color.WHITE);
        nbFailed.setFont(new Font("Stencil", Font.PLAIN, 20));
        
        reset = new JButton("RESET");
        reset.setForeground(Color.WHITE);
        reset.setBackground(Color.BLACK);
        reset.setFont(new Font("Stencil", Font.PLAIN, 28));
        reset.addActionListener(this);
        reset.setOpaque(false);
        reset.setBorderPainted(false);
        reset.setFocusPainted(false);
        
        spin = new JButton("SPIN");
        spin.setBackground(Color.BLACK);
        spin.setForeground(Color.WHITE);
        spin.setFont(new Font("Stencil", Font.PLAIN, 28));
        spin.addActionListener(this);
        spin.setOpaque(false);
        spin.setBorderPainted(false);
        spin.setFocusPainted(false);
        
        quit = new JButton("QUIT");
        quit.setVerticalAlignment(SwingConstants.TOP);
        quit.setForeground(Color.WHITE);
        quit.setBackground(Color.BLACK);
        quit.setFont(new Font("Stencil", Font.PLAIN, 28));
        quit.setOpaque(false);
        quit.addActionListener(this);
        quit.setBorderPainted(false);
        quit.setFocusPainted(false);
        
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(180)
        			.addComponent(interOne, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
        			.addGap(116)
        			.addComponent(interTwo, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
        			.addGap(109)
        			.addComponent(interThree)
        			.addContainerGap(314, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(65)
        			.addComponent(quit, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        			.addGap(67)
        			.addComponent(lblTotalWon, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 635, Short.MAX_VALUE)
        			.addComponent(bet)
        			.addGap(102))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(54)
        					.addComponent(j0))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(64)
        					.addComponent(nbFailed)))
        			.addGap(29)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(firstDiv2)
        							.addGap(40)
        							.addComponent(even))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addGap(23)
        									.addComponent(gameWon, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
        								.addGroup(groupLayout.createSequentialGroup()
        									.addGap(75)
        									.addComponent(nbWon, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(betOne, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
        					.addGap(30)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(betTwo, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(betThree, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(betFour, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(red)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(black)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(odd)
        							.addGap(59)
        							.addComponent(secondDiv2))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(4)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(balanceAmount)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(betFive, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        									.addGap(32)
        									.addComponent(spin)
        									.addGap(18)
        									.addComponent(reset)))))
        					.addContainerGap(180, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(j1)
        						.addComponent(j2)
        						.addComponent(j3))
        					.addGap(30)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(j4)
        						.addComponent(j5)
        						.addComponent(j6))
        					.addGap(27)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(j8)
        						.addComponent(j7)
        						.addComponent(j9))
        					.addGap(29)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(j10)
        									.addComponent(j11))
        								.addComponent(j12))
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(j13)
        								.addComponent(j14)
        								.addComponent(j15)))
        						.addComponent(totalWon))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(j16)
        								.addComponent(j17)
        								.addComponent(j18))
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(j19)
        								.addComponent(j20)
        								.addComponent(j21))
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(j22)
        								.addComponent(j23)
        								.addComponent(j24))
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(j25)
        								.addComponent(j26)
        								.addComponent(j27))
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(j28)
        								.addComponent(j29)
        								.addComponent(j30)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblTotalLost)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addGap(10)
        									.addComponent(totalLost, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
        							.addGap(109)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(totalWL)
        								.addComponent(lblWl))))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(j31)
        						.addComponent(j32)
        						.addComponent(j33))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(j35)
        						.addComponent(j36)
        						.addComponent(j34))
        					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(columnThree, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(columnTwo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(columnOne, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(61))))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(128)
        			.addComponent(errorMsg)
        			.addContainerGap(863, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(gameLost, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(1016, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(quit, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblTotalWon)
        						.addComponent(lblTotalLost)
        						.addComponent(lblWl)
        						.addComponent(balanceAmount))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(bet)
        							.addGap(131)
        							.addComponent(columnThree)
        							.addGap(58))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(totalLost)
        								.addComponent(totalWL)
        								.addComponent(totalWon))
        							.addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(j3)
        								.addComponent(j6)
        								.addComponent(j9)
        								.addComponent(j12)
        								.addComponent(j15)
        								.addComponent(j18)
        								.addComponent(j21)
        								.addComponent(j24)
        								.addComponent(j27)
        								.addComponent(j30)
        								.addComponent(j33)
        								.addComponent(j36))
        							.addGap(49)))
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(columnTwo)
        							.addComponent(j20)
        							.addComponent(j23)
        							.addComponent(j26)
        							.addComponent(j29)
        							.addComponent(j32)
        							.addComponent(j35))
        						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(j2)
        							.addComponent(j5)
        							.addComponent(j8)
        							.addComponent(j11)
        							.addComponent(j14)
        							.addComponent(j17)
        							.addComponent(j0)))
        					.addGap(58)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(columnOne)
        							.addGap(51)
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(interOne, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        								.addComponent(interTwo, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        								.addComponent(interThree))
        							.addGap(36))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(j1)
        								.addComponent(j4)
        								.addComponent(j10)
        								.addComponent(j7)
        								.addComponent(j13)
        								.addComponent(j16)
        								.addComponent(j19)
        								.addComponent(j22)
        								.addComponent(j25)
        								.addComponent(j31)
        								.addComponent(j28)
        								.addComponent(j34))
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(firstDiv2)
        						.addComponent(even)
        						.addComponent(red)
        						.addComponent(secondDiv2)
        						.addComponent(odd)
        						.addComponent(black))
        					.addGap(73)
        					.addComponent(errorMsg)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(38)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(gameLost, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(gameWon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(nbFailed)
        									.addGap(62))
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(nbWon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addGap(38))))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addGap(44)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(betTwo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        								.addComponent(betFour, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        								.addComponent(betThree, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        								.addComponent(betOne, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        									.addComponent(spin, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        									.addComponent(reset))
        								.addComponent(betFive, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        							.addGap(59)))
        					.addGap(76))))
        );
        setLayout(groupLayout);
    }
    /**
     * Set the background JFrame
     */
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    /**
     * The ActionPerformed of the window
     */
    public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "SPIN":
			if(groupTwo.getSelection() == null) {
				errorMsg.setText("Please choose a bet amount");
			} else if(groupOne.getSelection() == null) {
				errorMsg.setText("Please choose a case");
			} else {
			sound = new model.Sound();
			sound.sound();
			if(Bet.getTotal() == 0) {
			errorMsg.setText("You have 0€. Click reset to play again !");
			} else if(Integer.parseInt(groupTwo.getSelection().getActionCommand()) > Bet.getTotal()) {
				errorMsg.setText("You want to bet " + groupTwo.getSelection().getActionCommand() + "€ and you have only " + Bet.getTotal() + "€");
			} else if(red.isSelected()) {
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
			} else if(black.isSelected()) {
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(even.isSelected()) {
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(odd.isSelected()) {
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(firstDiv2.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(secondDiv2.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(interOne.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(interTwo.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(interThree.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(columnOne.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(columnTwo.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(columnThree.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j0.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j1.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j2.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j3.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
			} else if(j4.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j5.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j6.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j7.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j8.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j9.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j10.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j11.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
			} else if(j12.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j13.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j14.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j15.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j16.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j17.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j18.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j19.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j20.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j21.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j22.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j23.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j24.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j25.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
				
			} else if(j26.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
			} else if(j27.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
			} else if(j28.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));		
			} else if(j29.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));		
			} else if(j30.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));	
			} else if(j31.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));		
			} else if(j32.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));		
			} else if(j33.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));		
			} else if(j34.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));			
			} else if(j35.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));			
			} else if(j36.isSelected()){
				BetController contr = new BetController(Integer.parseInt(groupOne.getSelection().getActionCommand()), Integer.parseInt(groupTwo.getSelection().getActionCommand()));
			}	
		} 	
			break;
			
			case "RESET" :
				BetController.reset();
				break;
			case "QUIT" :
				ViewBetWindow.closeWindow();
		}
	}
    /**
     * @return the case number that the player bet on
     */
	public static int getNumBet() {
		return numBet;
	}

	
	/**
	 * @return the choice of amount money that the player bet on
	 */
	public static int getSelect() {
		return select;
	}
	
	/**
	 * @return the total that the player has won
	 */
	public static JLabel getTotalWon() {
		return totalWon;
	}
	
	/**
	 * Change the total that the player has won
	 * @param totalWon
	 */
	public static void setTotalWon(JLabel totalWon) {
		ViewBetGUI.totalWon = totalWon;
	}
	
	/**
	 * @return the total that the player has lost
	 */
	public static JLabel getTotalLost() {
		return totalLost;
	}
	
	/**
	 * Change the total that the player has lost
	 * @param totalLost
	 */
	public static void setTotalLost(JLabel totalLost) {
		ViewBetGUI.totalLost = totalLost;
	}
	
	/**
	 * @return the total difference between the total that the player has won and the total that the player has lost
	 */
	public static JLabel getTotalWL() {
		return totalWL;
	}
	
	/**
	 * Change the total difference between the total that the player has won and the total that the player has lost
	 * @param totalWL
	 */
	public static void setTotalWL(JLabel totalWL) {
		ViewBetGUI.totalWL = totalWL;
	}
	
	/**
	 * @return the total of the balance
	 */
	public static JLabel getBet() {
		return bet;
	}
	
	/**
	 * @return the total number that the player has won
	 */
	public static JLabel getNbWon() {
		return nbWon;
	}
	
	/**
	 * @return the total number that the player has lost
	 */
	public static JLabel getNbFailed() {
		return nbFailed;
	}
	
	/**
	 * @return the error message
	 */
	public static JLabel getErrorMsg() {
		return errorMsg;
	}

}