package HM20;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {

    static List<Student> students = new ArrayList<>();
    private int Student_ID;
    private String Full_name;
    private String HowJoin;
    private int Group_ID;
}
