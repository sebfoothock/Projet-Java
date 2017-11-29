package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {
	private static String url = "jdbc:mysql://localhost/wheel";
	private static String user = "root";
	private static String pwd = "root";
	
	private static Connection cn = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	private static String player = null;
	private static int total;
	private static int totalWin;
	private static int totalLoose;
	private static int nbWon;
	private static int nbLost;
	private static int id;
	private static int WL;
	
		public static void recup()  {
		try {
				
				Class.forName("com.mysql.jdbc.Driver");
				cn = DriverManager.getConnection(url, user, pwd);
				st = cn.createStatement();
				
				String sql = "Select * FROM wheel";

				rs = st.executeQuery(sql);
				while(rs.next()) {
					player = rs.getString("player");
					total = rs.getInt("total");
					totalWin = rs.getInt("totalWin");
					totalLoose = rs.getInt("totalLoose");
					nbWon = rs.getInt("nbWon");
					nbLost = rs.getInt("nbLost");
					WL = rs.getInt("WL");
					
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
	public static void maj() {
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
							+ " where id = 1;";
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
	public static void reset() {
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
							+ " where id = 1;";
			st.executeUpdate(sql);
			recup();
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
}
