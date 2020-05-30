SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `Student` DEFAULT CHARACTER SET utf8 ;
USE `Student` ;

CREATE TABLE IF NOT EXISTS `Student`.`Group` (
                                                 `Group_ID` INT NOT NULL AUTO_INCREMENT,
                                                 `Group` VARCHAR(20) NOT NULL,
                                                 PRIMARY KEY (`Group_ID`))
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Student`.`Student` (
                                                   `Student_ID` INT NOT NULL AUTO_INCREMENT,
                                                   `Full_Name` VARCHAR(20) NOT NULL,
                                                   `HowJoin` YEAR NOT NULL,
                                                   `Group_ID` INT NOT NULL,
                                                   PRIMARY KEY (`Student_ID`),
                                                   INDEX `Group_idx` (`Group_ID` ASC) VISIBLE,
                                                   CONSTRAINT `Group`
                                                       FOREIGN KEY (`Group_ID`)
                                                           REFERENCES `Student`.`Group` (`Group_ID`)
                                                           ON DELETE CASCADE
                                                           ON UPDATE CASCADE)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Student`.`Department` (
                                                      `Department_ID` INT NOT NULL AUTO_INCREMENT,
                                                      `Name_of_department` VARCHAR(20) NOT NULL,
                                                      `head_of` VARCHAR(20) NOT NULL,
                                                      PRIMARY KEY (`Department_ID`))
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Student`.`teachers` (
                                                    `Teachers_ID` INT NOT NULL AUTO_INCREMENT,
                                                    `Name_of_teacher` VARCHAR(20) NOT NULL,
                                                    `Department_ID` INT NOT NULL,
                                                    PRIMARY KEY (`Teachers_ID`),
                                                    INDEX `department_idx` (`Department_ID` ASC) VISIBLE,
                                                    CONSTRAINT `department`
                                                        FOREIGN KEY (`Department_ID`)
                                                            REFERENCES `Student`.`Department` (`Department_ID`)
                                                            ON DELETE CASCADE
                                                            ON UPDATE CASCADE)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `Student`.`lessons` (
                                                   `Lessons_ID` INT NOT NULL AUTO_INCREMENT,
                                                   `Name_of_lesson` VARCHAR(20) NOT NULL,
                                                   `Teacher_ID` INT NOT NULL,
                                                   `Semester` INT NOT NULL,
                                                   `Year` YEAR NOT NULL,
                                                   PRIMARY KEY (`Lessons_ID`),
                                                   INDEX `teacher_idx` (`Teacher_ID` ASC) VISIBLE,
                                                   CONSTRAINT `teacher`
                                                       FOREIGN KEY (`Teacher_ID`)
                                                           REFERENCES `Student`.`teachers` (`Teachers_ID`)
                                                           ON DELETE CASCADE
                                                           ON UPDATE CASCADE)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `Student`.`assessment` (
                                                      `Assessment_ID` INT NOT NULL AUTO_INCREMENT,
                                                      `Lesson_ID` INT NOT NULL,
                                                      `Student_ID` INT NOT NULL,
                                                      `Point_ID` INT NOT NULL,
                                                      PRIMARY KEY (`Assessment_ID`),
                                                      INDEX `Stud_idx` (`Student_ID` ASC) VISIBLE,
                                                      INDEX `lesson_idx` (`Lesson_ID` ASC) VISIBLE,
                                                      CONSTRAINT `Stud`
                                                          FOREIGN KEY (`Student_ID`)
                                                              REFERENCES `Student`.`Student` (`Student_ID`)
                                                              ON DELETE CASCADE
                                                              ON UPDATE CASCADE,
                                                      CONSTRAINT `lesson`
                                                          FOREIGN KEY (`Lesson_ID`)
                                                              REFERENCES `Student`.`lessons` (`Lessons_ID`)
                                                              ON DELETE CASCADE
                                                              ON UPDATE CASCADE)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
