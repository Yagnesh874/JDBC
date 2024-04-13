import java.sql.*;

public class demo1 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            String brand = "asus";
            int  warranty_year = 3;
            int price = 60000;

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");

            String str = "insert into laptop (brand,warranty_year,price) values(?,?,?)";

            PreparedStatement ps = connection.prepareStatement(str);
            ps.setString(1,brand);
            ps.setInt(2,warranty_year);
            ps.setInt(3,price);

            ps.executeUpdate();
            System.out.println("data inserted");
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
