package connectFive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DatabaseMethods {

	// random notes for future use:
	// insert creates a new row, replace can replace^^
	public Connection conn = null;
	private int userID;
	String[] names = { "Restaurant 1", "Restaurant 2", "Restaurant 3",
			"Club 1", "Club 2", "Club 3", "Carpool 1", "Carpool 2",
			"Carpool 3", "Entertainment 1", "Entertainment 2",
			"Entertainment 3", "Roomate 1", "Roomate 2", "Roomate 3" };

	DatabaseMethods() throws ClassNotFoundException {
		// connects to database
		// use appropriate methods

		try {
			System.out.println("Loading Driver");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// I load driver^ correctly
			// java.sql.Driver d=new com.mysql.jdbc.Driver();
			System.out.println("Success");
			System.out.println("Trying to establish connection");
			conn = DriverManager.getConnection(
					"jdbc:mysql://sql4.freemysqlhosting.net:3306/sql459231",
					"sql459231", "jW6!aA6!");
			// databaseName /sql459231
			System.out.println(conn);
			// Do something with the Connection
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out
					.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendorError: "
					+ ((SQLException) ex).getErrorCode());
		} catch (InstantiationException e) {
			e.printStackTrace();
			System.out.println("driver instatiation");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			System.out.println("driver instatiation");
		}

	}

	public boolean confirmUser(String Name, char[] pass) throws SQLException {
		// verifies user account
		// fetching table
		Statement stmt = null;
		ResultSet rs = null;
		String executeStatement = "SELECT * FROM userVerification";
		boolean result = false;
		String Password = "";
		Password = String.valueOf(pass);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(executeStatement);

			// method also updates userID
			while (rs.next()) {
				if (result) {
					break;
				}
				int id = rs.getInt(1);
				// System.out.println ("id = " + id);
				String name = rs.getString(2);
				// System.out.println("name = " + name);
				// System.out.println("Name = " + Name);
				String password = rs.getString(3);
				if ((Name.equals(name) && Password.equals(password))
						|| name.equals(Name) && password.equals(Password)) {
					result = true;
					userID = id;
					// System.out.println(userID);
				}
				if (rs.wasNull()) {
					System.out.println("name is null");
				} else {
					// System.out.println("name is not null");
				}
				// System.out.println("-----------------------");
			}

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt = null;
			}
		}
		return result;

	}

	public void addUser(String userName, char[] pass) {
		// add blank rows for other tables of same ID
		// assumes the userID field is generated within the database
		// create giant while loop
		String password = String.valueOf(pass);
		String[] executor = new String[3];
		executor[0] = String.format(
				"INSERT INTO userVerification (userName, userPassword) "
						+ "VALUES ('%s', '%s')", userName, password);

		executor[1] = "";
		executor[2] = "";
		for (int i = 0; i < 3; i++) {
			Statement stmt = null;
			ResultSet rs = null;
			try {
				// needs to create void rows with user
				// ID
				stmt = conn.createStatement(); // erryor here, if we have
												// nullpinter problem is with
												// conn
				if (i == 1) {// update userID
					try {
						confirmUser(userName, pass);
					} catch (SQLException e) {

						e.printStackTrace();
						System.out.println("it broke");
					}
					executor[1] = String.format(
							"INSERT INTO userValues (userID)" + "VALUES (%s)",
							userID);
					executor[2] = String.format(
							"INSERT INTO returnUser (userID)" + "VALUES (%s)",
							userID);
				}
				// performs the function for this loop iteration
				stmt.executeUpdate(executor[i]);

			} catch (SQLException ex) {
				// handle any errors
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
			} finally {
				// it is a good idea to release
				// resources in a finally{} block
				// in reverse-order of their creation
				// if they are no-longer needed

				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException sqlEx) {
					} // ignore

					rs = null;
				}

				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlEx) {
					} // ignore

					stmt = null;
				}
			}
		}
	}

	public void pushData(int[] values, String collumn) {
		// have to update to specific row!
		// convert array to int
		// StringBuilder strNum = new StringBuilder();
		// problem is here>>
		// for (int num : values) {
		// strNum.append(num);
		// }
		// int key = Integer.parseInt(strNum.toString());

		int key = 0;
		for (int i = 0; i < values.length; i++) {
			key += Math.pow(10, i) * values[values.length - i - 1];
		}
		System.out.println(key);

		Statement stmt = null;
		ResultSet rs = null;

		String executor = String.format("UPDATE userValues SET %s='%d' "
				+ "WHERE userID=%d", collumn, key, userID);
		try {

			stmt = conn.createStatement();
			stmt.executeUpdate(executor);

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt = null;
			}
		}
		// calls for an update
		// TODO updateData();
	}

	public void updateData() {
		// TODO fix this
		// SO broken
		Statement stmt = null;
		ResultSet rs = null;

		String executeStatement = "";
		String[] collumn = { "carpoolingID", "restaurantsID", "clubsID",
				"entertainmentID", "roomateID" };
		int count = 0;
		try {

			for (int i = 0; i < 5; i++) {
				// get temp value for comparisons
				int tempID = 0;
				ResultSet tempResult = null;
				Statement tempState = conn.createStatement();
				String request = String.format(
						"SELECT %s FROM userValues WHERE " + "userID='%d'",
						collumn[i], userID);
				tempResult = tempState.executeQuery(request);
				tempID = tempResult.getInt(1);
				// may need to move this before closing
				//close statement
				tempState.close();
				tempResult.close();

				// update exxecute statemtn, then get sorted results
				executeStatement = String.format(
						// error here TODO
						// return a table
						// sorted by abs(collumn - value)
						"SELECT userID, %s FROM userValues ORDER by "
								+ "abs(%s - %d)", collumn[i], collumn[i],
						tempID);

				stmt = conn.createStatement();
				rs = stmt.executeQuery(executeStatement);
				int p = 0;
				while (rs.next() && p != 3) {
					int tempValue = rs.getInt(2);// maybe?
					String tempName = "";
					// get associated name with tempValue from userVerification

					String forName = String.format(
							"SELECT userName FROM userVerification WHERE "
									+ "userID='%d'", tempValue);
					Statement tempo = conn.createStatement();
					ResultSet tempa = tempo.executeQuery(forName);
					if (tempResult.first()) {
						tempName = tempa.getString(1);
					}
					tempo.close();
					tempa.close();

					// sorts through the top three matching results of the
					// sorted query
					// takes the absolute distance to find matches
					// to work with restaurants we should make a if statement
					// that checks whether or not it is a non-user

					Statement sta = conn.createStatement();
					String statement = String.format(
							"UPDATE returnUser SET %s='%s' WHERE userID=%d",
							names[count], tempName, userID);
					sta.executeUpdate(statement);
					// close for safety
					sta.close();
					count++;
					p++;
					// count is used for column names
				}
				stmt.close();
				rs.close();

			}
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt = null;
			}
		}
	}

	public HashMap<String, String> getUserReturnValues() throws SQLException {
		// returns given row values from userID as hashmap
		HashMap<String, String> returnValue = new HashMap<String, String>();

		Statement stmt = null;
		ResultSet rs = null;
		String executeStatement = String.format(
				"SELECT * FROM returnUser WHERE userID='%d'", userID);

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(executeStatement);

			// resultSet is initialized before the first data set
			if (rs.next()) {
				// it is possible to get the columns via name
				// also possible to get the columns via the column number
				// which starts at 1
				for (int i = 0; i < 15; i++) {
					returnValue.put(names[i], rs.getString(i + 2));
				}

			}

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt = null;
			}
		}

		return returnValue;
	}

	public static void main(String args[]) {
		DatabaseMethods tator;
		char[] password = { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		
		HashMap<String, String> results;
		try {
			tator = new DatabaseMethods();
			tator.confirmUser("Andrew", password);
			int[] values = {1,2,3,1,2,3,1};
			//tator.pushData(values, "carpoolingID");
			tator.updateData();
			//results = tator.getUserReturnValues();
			//Set<String> setOfKeys = results.keySet();
			//Iterator<String> iterator = setOfKeys.iterator();
			//while (iterator.hasNext()) {
			//	String key = (String) iterator.next();
			//	String value = (String) results.get(key);

			//	System.out.println("Key: " + key + ", Value: " + value);
			//}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
