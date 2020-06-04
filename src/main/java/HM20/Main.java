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

                //Все втуденты
//        ResultSet rs = statement.executeQuery("SELECT * FROM `student`;");
//        while (rs.next()) {
//            System.out.println("Id: "+rs.getInt(1));
//            System.out.println("Name: "+rs.getString(2));
//            System.out.println("Year: "+rs.getInt(3));
//            System.out.println("Group Id: "+rs.getInt(4));
//            System.out.println("====================");
//        }


        //Все студенты учащиеся в одной группе
//        ResultSet rs2 = statement.executeQuery("SELECT * FROM `student` where Group_ID = 1 ");
//        while (rs2.next()) {
//            System.out.println("Id: "+rs2.getInt(1));
//            System.out.println("Name: "+rs2.getString(2));
//            System.out.println("Year: "+rs2.getInt(3));
//            System.out.println("Group Id: "+rs2.getInt(4));
//            System.out.println("====================");
//        }

        //Все студенты одного года поступления
        ResultSet rs3 = statement.executeQuery("SELECT * FROM `student` where HowJoin = 2019");
        while (rs3.next()) {
            System.out.println("Id: "+rs3.getInt(1));
            System.out.println("Name: "+rs3.getString(2));
            System.out.println("Year: "+rs3.getInt(3));
            System.out.println("Group Id: "+rs3.getInt(4));
            System.out.println("====================");
        }
        connection.close();
    }
}




