import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            String url="jdbc:mysql://localhost:3306/";
            String databaseName="my_db1";
            String username="root";
            String password="aditya";

Connection connection = DriverManager.getConnection(url, username, 
password);
String sqlQuery = "CREATE DATABASE testDB";
Statement statement = (Statement) connection.createStatement();
// ResultSet resultSet = statement.executeQuery(sqlQuery);
statement.executeUpdate(sqlQuery);
System.out.println("Database created successfully...");
} catch (SQLException e) {
e.printStackTrace();

        }

    }
}
