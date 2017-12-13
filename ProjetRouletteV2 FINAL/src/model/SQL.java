package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import view.ViewBetAccount;
import view.ViewBetConsole;
import view.ViewBetHome;
import view.ViewBetWindow;
/**
 * This methods allows the connection between the program and the DBA on my SQL.
 * @author JULIEN
 *
 */
public class SQL {
	private static String url = "jdbc:mysql://localhost/wheel";
	private static String user = "root";
	private static String pwd = "root";
	
	private static Connection cn = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	private static String player = null;
	private static String pwdPlayer = null;
	private static int total;
	private static int totalWin;
	private static int totalLoose;
	private static int nbWon;
	private static int nbLost;
	private static int id;
	private static int WL;
	private static String sql = "";
	private static int nbId;
	
	private static ViewBetWindow vue;
	private static ViewBetConsole cons;
	private static SQL sqlOpen;
	
	/**
	 * This void allows the connection to connect the player to his game.
	 */
	public static void connexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			sql = "Select * from wheel where player = '" + ViewBetHome.getTextUser().getText() + "' and binary pwd= '" + ViewBetHome.getTextPwd().getText() + "'";
			player = ViewBetHome.getTextUser().getText();
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				ViewBetHome.closeHome();
				SQL.recup(player);
				ViewBetWindow.window();
				//ViewBetConsole.cons();
			} else {
				ViewBetHome.getErrorMsg().setText("INCORRECT LOGIN OR PASSWORD");
				ViewBetHome.getTextUser().setText("");
				ViewBetHome.getTextPwd().setText("");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			try {
				cn.close();
				st.close();
			 } catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * This void allows to recover the player's information to put it on the game frame.
	 * @param player is used to recover the good player's information
	 */
	public static void recup(String player)  {
		try {	
				Class.forName("com.mysql.jdbc.Driver");
				cn = DriverManager.getConnection(url, user, pwd);
				st = cn.createStatement();
				
				String sql = "Select * FROM wheel where player = '" + player + "'";

				rs = st.executeQuery(sql);
				while(rs.next()) {
					
					total = rs.getInt("total");
					totalWin = rs.getInt("totalWin");
					totalLoose = rs.getInt("totalLoose");
					nbWon = rs.getInt("nbWon");
					nbLost = rs.getInt("nbLost");
					WL = rs.getInt("WL");
					id = rs.getInt("id");
					
				}
				Bet.setTotal(total);
				Bet.setNbLost(nbLost);
				Bet.setNbWon(nbWon);
				Bet.setTotalWon(totalWin);
				Bet.setTotalLost(totalLoose);
				Bet.setTotalWL(WL);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			} finally {
				try {
					cn.close();
					st.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	/**
	 * This vois allows to do an update of the DBA
	 * @param id is used to know which player the void have to update
	 */
	public static void maj(int id) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			
			String sql =	"update wheel "
							+ "set total =" + Bet.getTotal() + ", "
							+ "totalWin =" + Bet.getTotalWon() + ", "
							+ "totalLoose =" + Bet.getTotalLost() + ", "
							+ "nbWon =" + Bet.getNbWon() + ", "
							+ "nbLost =" + Bet.getNbLost() + ", "
							+ "WL =" + Bet.getTotalWL()
							+ " where id =" + id;
			st.executeUpdate(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			try {
				cn.close();
				//st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * This void allows to reset the player's game
	 * @param id is used to know which player's game the void have to reset
	 */
	public static void reset(int id) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			
			String sql =	"update wheel "
							+ "set total =2500, "
							+ "totalWin = 0 , "
							+ "totalLoose = 0, "
							+ "nbWon = 0, "
							+ "nbLost = 0, "
							+ "WL = 0"
							+ " where id = " + id;
			st.executeUpdate(sql);
			recup(player);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			try {
				cn.close();
				//st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * This void allows to count the id in the DBA
	 */
	public static void nbId() {
		try {	
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			
			String sql = "Select count(id) as id from wheel";

			rs = st.executeQuery(sql);
			while(rs.next()) {
				
				nbId = rs.getInt("id");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			try {
				cn.close();
				st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * This void allows to create an account in the DBA
	 * It print the errors messages
	 */
	public static void create() {
		SQL.nbId();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			sql = "Select * from wheel where player = '" + ViewBetAccount.getUsername().getText() + "'";
			rs = st.executeQuery(sql);
			if(ViewBetAccount.getUsername().getText().toString().equals("")) {
				ViewBetAccount.getMsgError().setText("PLEASE CHOOSE A LOGIN");
			}else if(rs.next()) {
				ViewBetAccount.getMsgError().setText("THIS LOGIN ALREADY EXIST");
				ViewBetAccount.getPassword().setText("");
				ViewBetAccount.getPassword1().setText("");
			} else {
				if(ViewBetAccount.getPassword().getText().toString().equals("")) {
					ViewBetAccount.getMsgError().setText("PLEASE CHOOSE A PASSWORD");
					ViewBetAccount.getPassword().setText("");
					ViewBetAccount.getPassword1().setText("");
				} else if(ViewBetAccount.getPassword().getText().toString().equals(ViewBetAccount.getPassword1().getText().toString())){
					nbId += 1;
					String sql =	"insert into wheel values ("
							+ nbId + ", "
							+ "'" + ViewBetAccount.getUsername().getText() + "', "
							+ "2500, "
							+ "0 , "
							+ "0, "
							+ "0, "
							+ "0, "
							+ "0 ,"
							+ "'" + ViewBetAccount.getPassword().getText() + "');";
					
					st.executeUpdate(sql);
					ViewBetAccount.getMsgError().setText("ACCOUNT CREATED!");
					ViewBetAccount.getPassword().setText("");
					ViewBetAccount.getPassword1().setText("");
					ViewBetAccount.getUsername().setText("");
				} else { 
					ViewBetAccount.getMsgError().setText("PASSWORD NOT CORRECT");
					ViewBetAccount.getPassword().setText("");
					ViewBetAccount.getPassword1().setText("");
				}
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			try {
				cn.close();
				st.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @return the total monney of the player in the dba
	 */
	public static int getTotal() {
		return total;
	}

	/**
	 * @return the total monney won of the player in the dba
	 */
	public static int getTotalWin() {
		return totalWin;
	}

	/**
	 * @return the total monney lost of the player in the dba
	 */
	public static int getTotalLoose() {
		return totalLoose;
	}

	/**
	 * @return the total game number won of the player in the dba
	 */
	public static int getNbWon() {
		return nbWon;
	}

	/**
	 * @return the total game number lost of the player in the dba
	 */
	public static int getNbLost() {
		return nbLost;
	}

	/**
	 * @return the difference between the total game lost and the total game won in the dba
	 */
	public static int getWL() {
		return WL;
	}
	
	/**
	 * @return the player name in the dba
	 */
	public static String getPlayer() {
		return player;
	}

	/**
	 * @return the id of the player in the dba
	 */
	public static int getId() {
		return id;
	}


}
