import java.sql.*;
public class demo2 {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");

            Statement statement;
            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from youtuber");

            while(rs.next())
            {
             
               System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
            connection.close();
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
