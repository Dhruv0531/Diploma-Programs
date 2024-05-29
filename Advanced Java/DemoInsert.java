import java.sql.*;

class DemoInsert {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Demo";
            Connection con = DriverManager.getConnection(url, "root", "DHru31@#");
            Statement stmt = con.createStatement();
            String qry = "INSERT INTO Stud VALUES(12,'Ram',93)";
            int n = stmt.executeUpdate(qry);
            if (n > 0) {
                System.out.println("Record Inserted");
            } else {
                System.out.println("Error");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
