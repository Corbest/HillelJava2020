Create database Hillel2020;

create table students
(
    Student_ID int             not null
    auto_increment    primary key,
    Full_Name  varchar(255)   not null,
    IdGroup    int  not null,
    HowJoin    year            not null,
    foreign key (IdGroup) references team (Group_ID)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table team
(
    Group_ID int not null
        auto_increment primary key,
    InGroup    enum ('Elementary') not null
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table assessment
(
 Assessment_ID bigint not null auto_increment primary key,
 Lesson_ID int not null,
 Student_ID int not null,
 foreign key (Lesson_ID) references lessons(Lesson_ID),
 foreign key (Student_ID) references students(Student_ID)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table lessons
(
    Lesson_ID int not null auto_increment primary key ,
    Name_of_lesson enum ('Mathematics','
Programming','Work') not null ,
    Teacher_ID int not null,
    Semester int not null,
    Year year,
    foreign key (Teacher_ID) references teachers(Teacher_ID)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table teachers
(
    Teacher_ID int not null auto_increment primary key,
    Name_of_teacher varchar(255) not null ,
    Department_ID int not null,
    foreign key (Department_ID) references  Department(Department_ID)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table Department
(
    Department_ID int not null auto_increment primary key,
    Name_of_department enum ('Mathematics','Programming','Work'),
    head_of varchar(255) not null
)ENGINE = InnoDB DEFAULT CHARSET = utf8;