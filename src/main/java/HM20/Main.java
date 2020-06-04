package HM20;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Hillel2020?"
                        + "useSSL=false&user=root&password=0481Ruslan");

        infoForAllStudents(connection);


//        connection.close();
    }

    public static void isWhile(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("Id: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Year: " + rs.getInt(3));
            System.out.println("Group Id: " + rs.getInt(4));
            System.out.println("====================");
        }
    }

    public static void infoForAllStudents(Connection set) throws SQLException {

        Statement statement = set.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `students`;");

        isWhile(rs);

    }
    public static void infoForStudentGroup(String idGroup, Connection set) throws SQLException {
        Statement statement = set.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM `students` where Group_ID = idGroup");

        isWhile(rs);

    }
    public static void infoForYearStudent(String isYear,Connection set) throws SQLException {
        Statement statement = set.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM `students` where HowJoin = isYear");

        isWhile(rs);
    }
        public static void infoForStudentTeacherPointLessons() {

        }
}





