SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `Hillel2020` DEFAULT CHARACTER SET utf8 ;
USE `Hillel2020` ;

CREATE TABLE IF NOT EXISTS `Hillel2020`.`isGroup` (
                                                      `Group_ID` INT NOT NULL AUTO_INCREMENT,
                                                      `Group_Name` VARCHAR(45) NOT NULL,
                                                      PRIMARY KEY (`Group_ID`))
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Hillel2020`.`Departmen` (
                                                        `Departmen_ID` INT NOT NULL AUTO_INCREMENT,
                                                        `Name_Departmen` VARCHAR(45) NOT NULL,
                                                        `Big_Boss` VARCHAR(45) NOT NULL,
                                                        PRIMARY KEY (`Departmen_ID`))
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `Hillel2020`.`Teachers` (
                                                       `Teachers_ID` INT NOT NULL AUTO_INCREMENT,
                                                       `Teacher_Name` VARCHAR(45) NOT NULL,
                                                       `Department` INT NOT NULL,
                                                       PRIMARY KEY (`Teachers_ID`),
                                                       INDEX `Dep_idx` (`Department` ASC) VISIBLE,
                                                       CONSTRAINT `Dep`
                                                           FOREIGN KEY (`Department`)
                                                               REFERENCES `Hillel2020`.`Departmen` (`Departmen_ID`)
                                                               ON DELETE NO ACTION
                                                               ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `Hillel2020`.`Lessons` (
                                                      `Lesson_ID` INT NOT NULL AUTO_INCREMENT,
                                                      `Lesson_Name` VARCHAR(45) NOT NULL,
                                                      `Teacher` INT NOT NULL,
                                                      `Semestr` INT NOT NULL,
                                                      `Year` DATE NOT NULL,
                                                      PRIMARY KEY (`Lesson_ID`),
                                                      INDEX `Teacher_idx` (`Teacher` ASC) VISIBLE,
                                                      CONSTRAINT `Teacher`
                                                          FOREIGN KEY (`Teacher`)
                                                              REFERENCES `Hillel2020`.`Teachers` (`Teachers_ID`)
                                                              ON DELETE NO ACTION
                                                              ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `Hillel2020`.`Assessment` (
                                                         `Assessment_ID` INT NOT NULL AUTO_INCREMENT,
                                                         `Lesson_ID` INT NOT NULL,
                                                         `Assessmentcol` VARCHAR(45) NOT NULL,
                                                         `Point_ID` INT NOT NULL,
                                                         `Student_ID` INT NOT NULL,
                                                         PRIMARY KEY (`Assessment_ID`),
                                                         CONSTRAINT `Lesson`
                                                             FOREIGN KEY (`Assessment_ID`)
                                                                 REFERENCES `Hillel2020`.`Lessons` (`Lesson_ID`)
                                                                 ON DELETE NO ACTION
                                                                 ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `Hillel2020`.`Students` (
                                                       `Student_ID` INT NOT NULL AUTO_INCREMENT,
                                                       `Full_Name` VARCHAR(45) NOT NULL,
                                                       `HowToJoin` DATE NOT NULL,
                                                       `Group_ID` INT NOT NULL,
                                                       PRIMARY KEY (`Student_ID`),
                                                       INDEX `id_idx` (`Group_ID` ASC) VISIBLE,
                                                       CONSTRAINT `id`
                                                           FOREIGN KEY (`Group_ID`)
                                                               REFERENCES `Hillel2020`.`isGroup` (`Group_ID`)
                                                               ON DELETE NO ACTION
                                                               ON UPDATE NO ACTION,
                                                       CONSTRAINT `Assessment`
                                                           FOREIGN KEY (`Student_ID`)
                                                               REFERENCES `Hillel2020`.`Assessment` (`Assessment_ID`)
                                                               ON DELETE NO ACTION
                                                               ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
