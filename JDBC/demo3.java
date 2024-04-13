import java.sql.*;

public class demo3 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            String name = "one plus";
            int price = 50000;
            //int  warranty_year = 2;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");

            String str = "update phones set price = ? where  name = ?";
            PreparedStatement ps = connection.prepareStatement(str);
            ps.setString(1,name);
            ps.setDouble(2,price);
            ps.executeUpdate();
            System.out.println("data Update");
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
