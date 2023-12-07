package MockVita1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("mysql://localhost:3306/product");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into product(id, name, price) values (? ,?, ?)");
        preparedStatement.setString(1,"1");
        preparedStatement.setString(2,"banana");
        preparedStatement.setString(3, "200");
        preparedStatement.execute();
        connection.close();
    }
}
