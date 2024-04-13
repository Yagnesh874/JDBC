import java.sql.*;

public class demo4 {
    public static void main(String[] args) {
        Connection connection = null;
        try {

            String employee_name = "harshal patel";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");

            String str = "DELETE from employee where employee_name = ?";

            PreparedStatement ps = connection.prepareStatement(str);
            ps.setString(1, employee_name);
            ps.executeUpdate();
            System.out.println("delete");
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
