//package connectFive;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.HashMap;
//
//public class DatabaseMethods {
//
//	// random notes for future use:
//	// insert creates a new row, replace can replace^^
//	public Connection conn = null;
//	private int userID;
//	private ResultSet resultSet;
//
//	String[] names = { "restaurant1", "restaurant2", "restaurant3", "club1",
//			"club2", "club3", "carpool1", "carpool2", "carpool3",
//			"entertainment1", "entertainment2", "entertainment3", "roomate1",
//			"roomate2", "roomate3" };
//
//	DatabaseMethods() throws ClassNotFoundException {
//		// connects to database
//		// use appropriate methods
//
//		try {
//			System.out.println("Loading Driver");
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			// I load driver^ correctly
//			// java.sql.Driver d=new com.mysql.jdbc.Driver();
//			System.out.println("Success");
//			System.out.println("Trying to establish connection");
//			conn = DriverManager.getConnection(
//					"jdbc:mysql://sql4.freemysqlhosting.net:3306/sql459231",
//					"sql459231", "jW6!aA6!");
//			// databaseName /sql459231
//			System.out.println(conn);
//			// Do something with the Connection
//		} catch (SQLException ex) {
//			// handle any errors
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out
//					.println("SQLState: " + ((SQLException) ex).getSQLState());
//			System.out.println("VendorError: "
//					+ ((SQLException) ex).getErrorCode());
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("driver instatiation");
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("driver instatiation");
//		}
//
//	}
//
//	public boolean confirmUser(String Name, String Password)
//			throws SQLException {
//		// verifies user account
//		ResultSet temp = selectQuery("userVerification");
//
//		// method also updates userID
//		while (temp.next()) {
//			if (Name == temp.getString(2) && Password == temp.getString(3)) {
//				userID = temp.getInt(1);
//				return true;
//			}
//		}
//		return false;
//
//	}
//
//	private ResultSet selectQuery(String table) {
//		// returns selected query
//		// returns table
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		String executeStatement = String.format("SELECT * FROM %s", table);
//
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(executeStatement);
//
//			return rs;
//		} catch (SQLException ex) {
//			// handle any errors
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		} finally {
//			// it is a good idea to release
//			// resources in a finally{} block
//			// in reverse-order of their creation
//			// if they are no-longer needed
//
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException sqlEx) {
//				} // ignore
//
//				rs = null;
//			}
//
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException sqlEx) {
//				} // ignore
//
//				stmt = null;
//			}
//		}
//		return rs;
//	}
//
//	public void addUser(String userName, String password) {
//		// TODO add blank rows for other tables of smame ID
//		// assumes the userID field is generated within the database
//		// create giant while loop
//
//		String[] executor = new String[3];
//		executor[0] = String.format(
//				"INSERT INTO userVerification (userName, userPassword) "
//						+ "VALUES ('%s', '%s')", userName, password);
//
//		executor[1] = String.format("INSERT INTO userValues (userID)"
//				+ "VALUES (%s)", userID);
//		executor[2] = String.format("INSERT INTO returnUser (userID)"
//				+ "VALUES (%s)", userID);
//		for (int i = 0; i < 3; i++) {
//			Statement stmt = null;
//			ResultSet rs = null;
//			try {
////TODO Fix CURRENT ERROR, needs to create void rows with user ID
//				stmt = conn.createStatement(); // erryor here, if we have
//												// nullpinter problem is with
//												// conn
//				if (i == 1) {// update userID
//					try {
//						confirmUser(userName, password);
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				stmt.executeUpdate(executor[i]);
//
//			} catch (SQLException ex) {
//				// handle any errors
//				System.out.println("SQLException: " + ex.getMessage());
//				System.out.println("SQLState: " + ex.getSQLState());
//				System.out.println("VendorError: " + ex.getErrorCode());
//			} finally {
//				// it is a good idea to release
//				// resources in a finally{} block
//				// in reverse-order of their creation
//				// if they are no-longer needed
//
//				if (rs != null) {
//					try {
//						rs.close();
//					} catch (SQLException sqlEx) {
//					} // ignore
//
//					rs = null;
//				}
//
//				if (stmt != null) {
//					try {
//						stmt.close();
//					} catch (SQLException sqlEx) {
//					} // ignore
//
//					stmt = null;
//				}
//			}
//		}
//	}
//
//	public void pushData(int[] values, String collumn) {
//		// TODO forgot to make sure it adds to the right rows
//
//		// convert array to int
//		StringBuilder strNum = new StringBuilder();
//
//		for (int num : values) {
//			strNum.append(num);
//		}
//		int key = Integer.parseInt(strNum.toString());
//
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		String executor = String.format("INSERT INTO userValues (%s) "
//				+ "VALUES ('%s')", collumn, key);
//		try {
//
//			stmt = conn.createStatement();
//			stmt.executeUpdate(executor);
//
//		} catch (SQLException ex) {
//			// handle any errors
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		} finally {
//			// it is a good idea to release
//			// resources in a finally{} block
//			// in reverse-order of their creation
//			// if they are no-longer needed
//
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException sqlEx) {
//				} // ignore
//
//				rs = null;
//			}
//
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException sqlEx) {
//				} // ignore
//
//				stmt = null;
//			}
//		}
//	}
//
//	public void updateData() {
//
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		String executeStatement = "";
//		String[] collumn = { "carPoolingID", "restaurantsID", "clubsID",
//				"entertainmentID", "roomateID" };
//		int count = 0;
//		try {
//
//			for (int i = 0; i < 5; i++) {
//				executeStatement = String.format(
//						"SELECT * FROM userValues ORDER by "
//								+ "abs(%s - userValues.%s)", collumn[i],
//						collumn[i]);
//
//				stmt = conn.createStatement();
//				rs = stmt.executeQuery(executeStatement);
//				int p = 0;
//				while (rs.next() && p != 3) {
//					String tempValue = rs.getString(i + 1);
//					p++;
//
//					// sorts through the top three matching results of the
//					// sorted query
//					// takes the absolute distance to find matches
//					// to work with restaurants we should make a if statement
//					// that checks whether or not it is a non-user
//
//					Statement sta = conn.createStatement();
//					String statement = String.format(
//							"INSERT INTO returnUser (%s) " + "VALUES ('%s')",
//							names[count], tempValue);
//					sta.executeUpdate(statement);
//					count++;
//				}
//
//			}
//		} catch (SQLException ex) {
//			// handle any errors
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		} finally {
//			// it is a good idea to release
//			// resources in a finally{} block
//			// in reverse-order of their creation
//			// if they are no-longer needed
//
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException sqlEx) {
//				} // ignore
//
//				rs = null;
//			}
//
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException sqlEx) {
//				} // ignore
//
//				stmt = null;
//			}
//		}
//	}
//
//	public HashMap<String, String> getUserReturnValues() throws SQLException {
//		// returns given row values from userID as hashmap
//		HashMap<String, String> returnValue = null;
//
//		// select query here
//		// returns full return user database
//		resultSet = selectQuery("returnUser");
//		// resultSet is initialized before the first data set
//		while (resultSet.absolute(userID)) {
//			// it is possible to get the columns via name
//			// also possible to get the columns via the column number
//			// which starts at 1
//			for (int i = 0; i < 15; i++) {
//				returnValue.put(names[i], resultSet.getString(i + 2));
//			}
//
//		}
//		return returnValue;
//	}
//
//	public static void main(String args[]) {
//		DatabaseMethods tator;
//		try {
//			tator = new DatabaseMethods();
//			tator.addUser("Baked", "potato");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//}
