package HM20;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Hillel2020?"
                        + "useSSL=false&user=root&password=0481Ruslan");

//        infoForAllStudents(connection);
//        infoForStudentTeacherPointLessons("Томи_Пуля",connection);
//        gradePointAverage("Томи_Пуля",connection);
//        infoForStudentGroup(2,connection);
        infoForYearStudent("2019.06.03",connection);

//        connection.close();
    }

    public static void isWhile(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("Id: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Year: " + rs.getDate(3));
            System.out.println("Group Id: " + rs.getInt(4));
            System.out.println("====================");
        }
    }

    public static void isWhileFull(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("Name: "+rs.getString(1));
            System.out.println("Lesson: "+rs.getString(2));
            System.out.println("Grade: "+rs.getInt(3));
            System.out.println("Teacher: "+rs.getString(4));
            System.out.println("====================");
        }
    }

    public static void infoForAllStudents(Connection set) throws SQLException {

        Statement statement = set.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `students`;");

        isWhile(rs);

    }
    public static void infoForStudentGroup(int idGroup, Connection set) throws SQLException {
        String bigCode = "SELECT Student_ID,Full_Name,isgroup.Group_ID,Group_Name FROM `students`\n" +
                "left join isgroup on isgroup.Group_ID = students.Group_ID \n" +
                " where students.Group_ID = ?";

        PreparedStatement preparedStatement = set.prepareStatement(bigCode);
        preparedStatement.setInt(1,idGroup);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            System.out.println("Student_ID: "+rs.getInt(1));
            System.out.println("Student_Name: "+rs.getString(2));
            System.out.println("Group_ID: "+rs.getInt(3));
            System.out.println("Group_Name: "+rs.getString(4));
        }
    }
    public static void infoForYearStudent(String isYear, Connection set) throws SQLException {
        String bigCode = "SELECT * FROM `students`\n" +
                " where students.HowToJoin = ?";

        PreparedStatement preparedStatement = set.prepareStatement(bigCode);
        preparedStatement.setString(1,isYear);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            System.out.println("Student_ID:"+rs.getString(1));
            System.out.println("Student_Name:"+rs.getString(2));
            System.out.println("Date: "+rs.getString(3));
            System.out.println("Group_ID: "+rs.getInt(4));
        }
    }

        public static void infoForStudentTeacherPointLessons(String Student, Connection set) throws SQLException {
        String bigCode = "SELECT Full_Name,Lesson_Name,Grade,Teacher_Name FROM \n" +
                "students\n" +
                "left join grade on grade.Student_ID = students.Student_ID\n" +
                "left join lessons on lessons.Lesson_ID = grade.Lesson_ID\n" +
                "left join teachers on teachers.Teachers_ID = lessons.Teacher\n" +
                "where students.Full_Name = ?";

            PreparedStatement preparedStatement = set.prepareStatement(bigCode);
            preparedStatement.setString(1,Student);
            ResultSet rs = preparedStatement.executeQuery();

        isWhileFull(rs);

        }
        public static void gradePointAverage(String Student, Connection set) throws SQLException{
         String bigCode = "SELECT Full_Name,avg(grade.Grade) FROM students " +
                 "left join grade ON grade.Student_ID = students.Student_ID\n" +
                 "where students.Full_Name = ?";

            PreparedStatement preparedStatement = set.prepareStatement(bigCode);
            preparedStatement.setString(1,Student);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println("Name: "+rs.getString(1));
                System.out.println("AVG: "+rs.getDouble(2));
            }
        }
    }





