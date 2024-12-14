package Configuration;

import java.sql.*;

public class Database {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        createConnection();
    }
    
    public static void createConnection() throws ClassNotFoundException, SQLException {
        
        String totalCount = null;
        String getUsersCount = "select count(id) from employee";
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(getUsersCount);
        
        while (resultSet.next()) {
            totalCount = resultSet.getString("totalCount");
        }
        
        System.out.println("Total count is: "+totalCount);
        
    }
    
}
