-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2022 at 03:10 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `portfolio`
--

-- --------------------------------------------------------

--
-- Table structure for table `education`
--

CREATE TABLE `education` (
  `id_education` bigint(20) NOT NULL,
  `title` varchar(70) DEFAULT NULL,
  `institution` varchar(70) DEFAULT NULL,
  `description` varchar(240) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `id_person` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `experience`
--

CREATE TABLE `experience` (
  `id_experience` bigint(20) NOT NULL,
  `title` varchar(70) DEFAULT NULL,
  `company` varchar(70) DEFAULT NULL,
  `description` varchar(240) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `id_person` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `language`
--

CREATE TABLE `language` (
  `id_language` bigint(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `person_id_person` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id_person` bigint(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  `about` varchar(470) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `linkedin_url` varchar(70) DEFAULT NULL,
  `github_url` varchar(70) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `banner_url` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `id_project` bigint(20) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(170) DEFAULT NULL,
  `technologies` varchar(45) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `live_url` varchar(100) DEFAULT NULL,
  `repo_url` varchar(100) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `id_person` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id_role` bigint(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `skill`
--

CREATE TABLE `skill` (
  `id_skill` bigint(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `lvl` int(11) DEFAULT NULL,
  `id_person` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `soft_skill`
--

CREATE TABLE `soft_skill` (
  `id_soft_skill` bigint(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `id_person` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` bigint(20) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user_has_role`
--

CREATE TABLE `user_has_role` (
  `id_user` bigint(20) NOT NULL,
  `id_role` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `education`
--
ALTER TABLE `education`
  ADD PRIMARY KEY (`id_education`,`id_person`),
  ADD KEY `fk_education_person1` (`id_person`);

--
-- Indexes for table `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`id_experience`,`id_person`),
  ADD KEY `fk_experience_person1` (`id_person`);

--
-- Indexes for table `language`
--
ALTER TABLE `language`
  ADD PRIMARY KEY (`id_language`,`person_id_person`),
  ADD KEY `fk_language_person1` (`person_id_person`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id_person`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`id_project`,`id_person`),
  ADD KEY `fk_project_person1` (`id_person`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id_role`);

--
-- Indexes for table `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`id_skill`,`id_person`),
  ADD KEY `fk_skill_person1` (`id_person`);

--
-- Indexes for table `soft_skill`
--
ALTER TABLE `soft_skill`
  ADD PRIMARY KEY (`id_soft_skill`,`id_person`),
  ADD KEY `fk_extra_skill_person1` (`id_person`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `user_has_role`
--
ALTER TABLE `user_has_role`
  ADD PRIMARY KEY (`id_user`,`id_role`),
  ADD KEY `fk_user_has_role_role1` (`id_role`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `education`
--
ALTER TABLE `education`
  MODIFY `id_education` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `experience`
--
ALTER TABLE `experience`
  MODIFY `id_experience` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id_person` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `id_project` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id_role` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `skill`
--
ALTER TABLE `skill`
  MODIFY `id_skill` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `soft_skill`
--
ALTER TABLE `soft_skill`
  MODIFY `id_soft_skill` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `education`
--
ALTER TABLE `education`
  ADD CONSTRAINT `fk_education_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `experience`
--
ALTER TABLE `experience`
  ADD CONSTRAINT `fk_experience_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `language`
--
ALTER TABLE `language`
  ADD CONSTRAINT `fk_language_person1` FOREIGN KEY (`person_id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `fk_project_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `skill`
--
ALTER TABLE `skill`
  ADD CONSTRAINT `fk_skill_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `soft_skill`
--
ALTER TABLE `soft_skill`
  ADD CONSTRAINT `fk_extra_skill_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user_has_role`
--
ALTER TABLE `user_has_role`
  ADD CONSTRAINT `fk_user_has_role_role1` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_user_has_role_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
