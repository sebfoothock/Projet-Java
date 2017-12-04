package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import model.SQL;

import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewBetHome extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	static ViewBetHome home ;
	
	private static JPanel contentPane;
	private static JTextField textUser;
	private static JTextField textPwd;
	private static JLabel connexion;
	private static JLabel username;
	private static JLabel password;
	private static JLabel errorMsg;
	private static JButton login;
	private static JButton exit;
	private JButton createAccount;
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "LOGIN":
			SQL.connexion();
		break;
		case "EXIT" :
			this.dispose();
		break;
		case "CREATE ACCOUNT" :
			this.dispose();
			ViewBetAccount.openAccount();
		}
	}
	
	public static void closeHome() {
		home.dispose();
	}
	
	public static void openHome() {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						home = new ViewBetHome();
						home.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
	
	public ViewBetHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 803);
		setResizable(false);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		connexion = new JLabel("Connexion");
		connexion.setFont(new Font("Stencil", Font.PLAIN, 40));
		connexion.setForeground(Color.WHITE);
		
		username = new JLabel("USERNAME");
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Stencil", Font.PLAIN, 40));
		
		password = new JLabel("PASSWORD");
		password.setFont(new Font("Stencil", Font.PLAIN, 40));
		password.setForeground(Color.WHITE);
		
		textUser = new JTextField();
		textUser.setColumns(10);
		
		textPwd = new JTextField();
		textPwd.setColumns(10);
		
		login = new JButton("LOGIN");
		login.setForeground(Color.WHITE);
		login.setFont(new Font("Stencil", Font.PLAIN, 40));
		login.addActionListener(this);
		login.setOpaque(false);
		login.setBorderPainted(false);
		login.setFocusPainted(false);
		login.setBackground(Color.BLACK);
		
		
		exit = new JButton("EXIT");
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("Stencil", Font.PLAIN, 40));
		exit.setOpaque(false);
		exit.addActionListener(this);
		exit.setBorderPainted(false);
		exit.setFocusPainted(false);
		exit.setBackground(Color.BLACK);
		
		errorMsg = new JLabel("");
		errorMsg.setForeground(Color.RED);
		errorMsg.setHorizontalAlignment(SwingConstants.CENTER);
		errorMsg.setFont(new Font("Stencil", Font.PLAIN, 30));
		
		createAccount = new JButton("CREATE ACCOUNT");
		createAccount.setForeground(Color.WHITE);
		createAccount.setFont(new Font("Stencil", Font.PLAIN, 40));
		createAccount.addActionListener(this);
		createAccount.setOpaque(false);
		createAccount.setBorderPainted(false);
		createAccount.setFocusPainted(false);
		createAccount.setBackground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(370)
							.addComponent(connexion))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(200)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(username)
								.addComponent(password))
							.addGap(134)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textPwd, 220, 220, 220)
								.addComponent(textUser, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(254, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(85)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(login)
						.addComponent(errorMsg))
					.addGap(62)
					.addComponent(createAccount)
					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
					.addComponent(exit, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(141))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(184)
					.addComponent(connexion)
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textUser)
						.addComponent(username, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textPwd)
						.addComponent(password, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(createAccount, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(login)
						.addComponent(exit))
					.addGap(18)
					.addComponent(errorMsg, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(109, Short.MAX_VALUE))
		);
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setLayout(gl_contentPane);
	}
	public static JTextField getTextUser() {
		return textUser;
	}

	public static void setTextUser(JTextField textUser) {
		ViewBetHome.textUser = textUser;
	}

	public static JTextField getTextPwd() {
		return textPwd;
	}

	public static void setTextPwd(JTextField textPwd) {
		ViewBetHome.textPwd = textPwd;
	}

	public static JLabel getErrorMsg() {
		return errorMsg;
	}

	public static void setErrorMsg(JLabel errorMsg) {
		ViewBetHome.errorMsg = errorMsg;
	}
}
