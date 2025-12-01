import java.sql.*;

class InsertData {
    public static void main(String args[]) {
        // JDBC connection parameters
        String driverName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://192.168.1.17:5432/sample_db";
        String username = "cse";
        String password = "cse123";

        try {
            // Load the JDBC driver
            Class.forName(driverName);

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Connected to database");
            } else {
                System.out.println("Connection failed");
                return;
            }

            // Insert query
            String qry = "INSERT INTO students(first_name, last_name, mobile, email, cgpa) " +
                         "VALUES('A', 'B', 1234567890, 'a@mail.com', 8.6)";

            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate(qry);

            if (i > 0) {
                System.out.println(i + " row inserted successfully");
            }

            // Close connection
            con.close();

        } catch (ClassNotFoundException ce) {
            System.out.println("Driver not found");
            ce.printStackTrace();
        } catch (SQLException se) {
            System.out.println("Database error");
            se.printStackTrace();
        }
    }
}
