import java.sql.*;
public class demo_table_2 {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");

            Statement statement;
            statement = connection.createStatement();
            System.out.println("connected");

            connection.close();
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
