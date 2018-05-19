-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `biblioteca` DEFAULT CHARACTER SET utf8 ;
USE `biblioteca` ;

-- -----------------------------------------------------
-- Table `biblioteca`.`Emprestimo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`Emprestimo` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`Emprestimo` (
  `emprestimoNumero` INT NOT NULL,
  `codUsuario` VARCHAR(45) NOT NULL,
  `codLivro` VARCHAR(45) NOT NULL,
  `dataEmprestimo` DATE NOT NULL,
  `dataDevolucao` DATE NOT NULL,
  PRIMARY KEY (`emprestimoNumero`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
