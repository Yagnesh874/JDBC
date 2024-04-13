import java.sql.*;
public class demo {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");

            Statement statement;
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from y");

            while(rs.next())
            {
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " ");
            }
            statement.close();
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
