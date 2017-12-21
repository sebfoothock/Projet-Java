package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.SQL;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
/**
 * This class is the create account frame
 * @author MASSON JULIEN RAEMDONCK SEBASTIEN LAMBERT MAXIMILIEN 2TL2
 * GROUPE 17
 *
 */
public class ViewBetAccount extends JFrame implements ActionListener {

	private JPanel contentPane;
	private static JTextField username;
	private static JTextField password;
	private static JTextField password1;
	private static JLabel msgError;

	/**
	 * Open the account creation frame
	 */
	public static void openAccount() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBetAccount frame = new ViewBetAccount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * the actionPerformed of the frame
	 */
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "CREATE ACCOUNT" :
			SQL.create();
			break;
		case "HOME" :
			this.dispose();
			ViewBetHome.openHome();
			break;
		}
	}
	
	/**
	 * Create the frame
	 */
	public ViewBetAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 803);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 79, 8));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCreateAAccount = new JLabel("CREATE A ACCOUNT");
		lblCreateAAccount.setForeground(Color.WHITE);
		lblCreateAAccount.setFont(new Font("Stencil", Font.PLAIN, 40));
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Stencil", Font.PLAIN, 30));
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 30));
		
		JLabel lblRepeatPassword = new JLabel("REPEAT PASSWORD");
		lblRepeatPassword.setForeground(Color.WHITE);
		lblRepeatPassword.setFont(new Font("Stencil", Font.PLAIN, 30));
		
		username = new JTextField();
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		
		password1 = new JTextField();
		password1.setColumns(10);
		
		JButton createAccount = new JButton("CREATE ACCOUNT");
		createAccount.setForeground(Color.WHITE);
		createAccount.setFont(new Font("Stencil", Font.PLAIN, 30));
		createAccount.addActionListener(this);
		createAccount.setOpaque(false);
		createAccount.setBorderPainted(false);
		createAccount.setFocusPainted(false);
		createAccount.setBackground(Color.BLACK);
		
		JButton HOME = new JButton("HOME");
		HOME.setForeground(Color.WHITE);
		HOME.setFont(new Font("Stencil", Font.PLAIN, 30));
		HOME.addActionListener(this);
		HOME.setOpaque(false);
		HOME.setBorderPainted(false);
		HOME.setFocusPainted(false);
		HOME.setBackground(Color.BLACK);
		
		msgError = new JLabel("");
		msgError.setHorizontalAlignment(SwingConstants.CENTER);
		msgError.setForeground(Color.RED);
		msgError.setFont(new Font("Stencil", Font.PLAIN, 25));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(308)
							.addComponent(lblCreateAAccount))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(136)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(msgError, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUsername)
										.addComponent(lblPassword)
										.addComponent(lblRepeatPassword)
										.addComponent(createAccount))
									.addGap(126)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(HOME, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(password1)
										.addComponent(password)
										.addComponent(username, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))))
					.addContainerGap(242, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(74)
					.addComponent(lblCreateAAccount)
					.addGap(90)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRepeatPassword)
						.addComponent(password1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(139)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(createAccount)
						.addComponent(HOME))
					.addGap(51)
					.addComponent(msgError, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * @return the text field of the username
	 */
	public static JTextField getUsername() {
		return username;
	}

	/**
	 * Change the text field of the username
	 * @param username
	 */
	public static void setUsername(JTextField username) {
		ViewBetAccount.username = username;
	}

	/**
	 * @return the text field of the password
	 */
	public static JTextField getPassword() {
		return password;
	}

	/**
	 * change de text field of the password
	 * @param password
	 */
	public static void setPassword(JTextField password) {
		ViewBetAccount.password = password;
	}

	/**
	 * @return the error message
	 */
	public static JLabel getMsgError() {
		return msgError;
	}

	/**
	 * Change de error message
	 * @param msgError
	 */
	public static void setMsgError(JLabel msgError) {
		ViewBetAccount.msgError = msgError;
	}

	/**
	 * @return the second password text field
	 */
	public static JTextField getPassword1() {
		return password1;
	}

	/**
	 * Change de second password text field
	 * @param password1
	 */
	public static void setPassword1(JTextField password1) {
		ViewBetAccount.password1 = password1;
	}
}
