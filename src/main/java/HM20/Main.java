package HM20;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/student?"
                        + "useSSL=false&user=root&password=0481Ruslan");

                Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from student.student");
        System.out.println(rs.getMetaData().getColumnName(1));
        connection.close();
    }
}





