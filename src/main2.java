import com.mysql.jdbc.DatabaseMetaData;

import java.sql.*;

/**
 * Created by Veronika on 2017-03-10.
 */
public class main2 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from students");
            while (resultSet.next()) {
                System.out.print("|");
                System.out.println(resultSet.getInt("id"));
                System.out.print("|");
                System.out.println(resultSet.getString("name"));
                System.out.print("|");
                System.out.println(resultSet.getString("surname"));

            }
            connection.close();
        } catch (Exception e) {
System.out.println(e);
        }


    }
}

