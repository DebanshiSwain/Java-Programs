import java.sql.*;

class DisplayData {
    public static void main(String args[]) {
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

            // Select query
            String qry = "SELECT * FROM students";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("First Name\tLast Name\tMobile\t\tEmail\t\tCGPA");

            while (rs.next()) {
                System.out.println(
                        rs.getString("first_name") + "\t\t" +
                        rs.getString("last_name") + "\t\t" +
                        rs.getLong("mobile") + "\t" +
                        rs.getString("email") + "\t" +
                        rs.getDouble("cgpa")
                );
            }

            // Close resources
            rs.close();
            stmt.close();
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
