DROP DATABASE IF EXISTS `spring_security_app`;

CREATE DATABASE IF NOT EXISTS `spring_security_app`;
USE `spring_security_app`;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`
(
    `username` varchar(50) NOT NULL,
    `password` varchar(68) NOT NULL,
    `enabled`  tinyint(1)  NOT NULL,
    PRIMARY KEY (`username`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;

--
-- Inserting data for table `users`
--
-- all bcrypted passwords are: 'test123'

INSERT INTO `users`
VALUES ('bob', '{bcrypt}$2y$14$r.5g21q32J3oHz5qpNftHOq7MBhTsU51lWCZbSs8kfZweRmiXUtvq', 1),
       ('patrick', '{bcrypt}$2y$14$dnD48qCW3UaYQoFmp5M5JOg7KGAIP//gDagdYY5GNxeF.zh65osD.', 1),
       ('alice', '{bcrypt}$2y$14$A49tIBfmmtQ/HUQcuAYVaO4SNN/HLZkc710XgvcgW6dJ/LZtKa/qq', 1);


--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities`
(
    `username`  varchar(50) NOT NULL,
    `authority` varchar(50) NOT NULL,
    UNIQUE KEY `authorities_idx_1` (`username`, `authority`),
    CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;

--
-- Inserting data for table `authorities`
--

INSERT INTO `authorities`
VALUES ('patrick', 'ROLE_EMPLOYEE'),
       ('bob', 'ROLE_EMPLOYEE'),
       ('bob', 'ROLE_MANAGER'),
       ('alice', 'ROLE_EMPLOYEE'),
       ('alice', 'ROLE_ADMIN');


