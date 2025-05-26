package connection;

import java.sql.*;

public class DEconnection {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/vit", "root", "Jeff295911@");  
            
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from student");  

            while(rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
            }

            con.close();  

        } catch (Exception e) {
            System.out.println("Sorry for the inconvenience, please check credentials.");
            e.printStackTrace();
        }
    }
}
