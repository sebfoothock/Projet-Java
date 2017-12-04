package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import view.ViewBetAccount;
import view.ViewBetConsole;
import view.ViewBetHome;
import view.ViewParisFenetre;

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
	
	public static void connexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			sql = "Select * from wheel where player = '" + ViewBetHome.getTextUser().getText() + "' and pwd= '" + ViewBetHome.getTextPwd().getText() + "'";
			player = ViewBetHome.getTextUser().getText();
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				SQL.recup(player);
				ViewBetHome.closeHome();
				//ViewBetConsole cons = new ViewBetConsole();
				ViewParisFenetre.window();
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
				ModelParis.setTotal(total);
				ModelParis.setNbLost(nbLost);
				ModelParis.setNbWon(nbWon);
				ModelParis.setTotalWon(totalWin);
				ModelParis.setTotalLost(totalLoose);
				ModelParis.setTotalWL(WL);
				
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
		
	public static void maj(int id) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			
			String sql =	"update wheel "
							+ "set total =" + ModelParis.getTotal() + ", "
							+ "totalWin =" + ModelParis.getTotalWon() + ", "
							+ "totalLoose =" + ModelParis.getTotalLost() + ", "
							+ "nbWon =" + ModelParis.getNbWon() + ", "
							+ "nbLost =" + ModelParis.getNbLost() + ", "
							+ "WL =" + ModelParis.getTotalWL()
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
			} else {
				if(ViewBetAccount.getPassword().getText().toString().equals("")) {
					ViewBetAccount.getMsgError().setText("PLEASE CHOOSE A PASSWORD");
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
				} else { 
					ViewBetAccount.getMsgError().setText("PASSWORD NOT CORRECT");
					System.out.println(ViewBetAccount.getPassword().getText().toString());
					System.out.println(ViewBetAccount.getPassword1().getText().toString());
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
	
	public static void verify() {	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			sql = "Select * from wheel where player = '" + ViewBetHome.getTextUser().getText() + "'";
			player = ViewBetHome.getTextUser().getText();
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				SQL.recup(player);
				ViewBetHome.closeHome();
				//ViewBetConsole cons = new ViewBetConsole();
				ViewParisFenetre.window();
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
	
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		SQL.total = total;
	}
	public static int getTotalWin() {
		return totalWin;
	}
	public static void setTotalWin(int totalWin) {
		SQL.totalWin = totalWin;
	}
	public static int getTotalLoose() {
		return totalLoose;
	}
	public static void setTotalLoose(int totalLoose) {
		SQL.totalLoose = totalLoose;
	}
	public static int getNbWon() {
		return nbWon;
	}
	public static void setNbWon(int nbWon) {
		SQL.nbWon = nbWon;
	}
	public static int getNbLost() {
		return nbLost;
	}
	public static void setNbLost(int nbLost) {
		SQL.nbLost = nbLost;
	}
	public static int getWL() {
		return WL;
	}
	public static void setWL(int wL) {
		WL = wL;
	}
	public static String getPlayer() {
		return player;
	}
	public static void setPlayer(String player) {
		SQL.player = player;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		SQL.id = id;
	}
}
