-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 28, 2022 at 11:08 PM
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
  `id_education` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `institution` varchar(45) DEFAULT NULL,
  `description` varchar(240) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `id_person` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `education`
--

INSERT INTO `education` (`id_education`, `title`, `institution`, `description`, `date`, `img_url`, `id_person`) VALUES
(1, 'University Technician in Development of Compu', 'UNICEN (Universidad Nacional del Centro de la', 'University student in the faculty of Exactas in the Career TUDAI (University Technician in Development of Computer Applications). ', 'Mar 2021 - At present', 'assets/images/icons/unicen-logo.png', 1),
(2, 'Fundamentals of programming', 'Argentina Programa', 'Course about basic notions of JavaScript, Ruby, and OOP.', 'Oct 2021 - Dec 2021', 'assets/images/icons/mumuki-logo.png', 1),
(3, 'Full stack web developer jr', 'Argentina Programa', 'Course about JavaScript, TypeScript, Java, MySQL, Angular, Spring Boot, Bootstrap. And other concepts like DevOps, Testing, Web Security, Effective Communication, OOP, Figma, SCRUM.', 'Feb 2022 - Aug 2022', 'assets/images/icons/arg-programa-logo.png', 1),
(4, 'ONE - Oracle Next Education', 'Oracle', 'Course about programming, Front-end, Java, Entrepreneurship and fundamentals of the business world.', 'Jul 2022 - At present', 'assets/images/icons/one-logo.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `experience`
--

CREATE TABLE `experience` (
  `id_experience` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `description` varchar(240) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `id_person` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experience`
--

INSERT INTO `experience` (`id_experience`, `title`, `company`, `description`, `date`, `img_url`, `id_person`) VALUES
(1, 'Freelance Work', NULL, 'Development of projects (Java and Full stack webs) to improve the performance of my abilities.', '2022 - At present', 'assets/images/icons/freelance-logo.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `extra_skill`
--

CREATE TABLE `extra_skill` (
  `id_extra_skill` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `id_person` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `extra_skill`
--

INSERT INTO `extra_skill` (`id_extra_skill`, `name`, `id_person`) VALUES
(1, 'Scrum', 1),
(2, 'GoogleSearch', 1),
(3, 'Bootstrap', 1),
(4, 'Git', 1);

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id_person` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  `about` varchar(470) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `linkedin_url` varchar(70) DEFAULT NULL,
  `github_url` varchar(70) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `banner_url` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id_person`, `name`, `job_title`, `about`, `email`, `linkedin_url`, `github_url`, `img_url`, `banner_url`) VALUES
(1, 'Federico Bayerque', 'Full Stack Developer Jr', 'I\'m a developer from Tandil, Buenos Aires, Argentina. Passionate for programming and creating new and innovative software. Well-versed in promoting objective-oriented approaches to real-time software development. Analytical, empathic and detail-oriented. With interest in learning new technologies and meeting new people.', 'federicobayerque@gmail.com', 'https://www.linkedin.com/in/federicobayerque', 'https://github.com/FedeBayer', 'assets/images/img/profilePhoto.png', 'assets/images/img/hero-image.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `id_project` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(170) DEFAULT NULL,
  `languages` varchar(45) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `live_url` varchar(100) DEFAULT NULL,
  `repo_url` varchar(100) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `id_person` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`id_project`, `title`, `description`, `languages`, `img_url`, `live_url`, `repo_url`, `year`, `id_person`) VALUES
(1, 'Portfolio - Argentina Programa #YoProgramo', 'Designed in the course Full stack web development Argentina Programa.', 'PHP-MySQL-JS', 'assets/images/img/project1.png', 'https://fedebayer.github.io/portfolio-FrontEnd/index.html', 'https://github.com/FedeBayer/tpeWeb2', 2022, 1),
(2, 'Algorithms/Data structures Java project', 'Java project includes OOP, data structures, recursion, sort, trees, graphs, backtracking and greedy.', 'Java', 'assets/images/img/project2.png', NULL, 'https://github.com/FedeBayer/tpeProg3', 2022, 1),
(3, 'Web page with DataBase and Api Rest', 'Page back-end oriented, includes MVC, database, users administration and Api Rest.', 'PHP-MySQL-JS', 'assets/images/img/project3.png', NULL, 'https://github.com/FedeBayer/tpeWeb2', 2021, 1),
(4, 'Web Page of medical Turns', 'Page front/back-end, includes MVC, database, Api Rest, UML, practice of SCRUM with classmates in University.', 'PHP-MySQL-JS', 'assets/images/img/project4.png', '', 'https://github.com/FedeBayer/tpeMetodologias', 2022, 1),
(5, 'Single Page Application Simpson', 'Front-end page, includes Responsive design, extracting elements from API and SPA.', 'JS-HTML-CSS', 'assets/images/img/project5.png', NULL, 'https://github.com/FedeBayer/tpeWeb1', 2021, 1),
(6, 'Object oriented Java project', 'Java project includes object-oriented paradigm, Composite, and Strategy pattern design.', 'Java', 'assets/images/img/project6.png', '', 'https://github.com/FedeBayer/tpeProg2', 2021, 1);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id_role` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id_role`, `name`) VALUES
(1, 'user'),
(2, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `skill`
--

CREATE TABLE `skill` (
  `id_skill` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `lvl` int(11) DEFAULT NULL,
  `id_person` int(11) NOT NULL,
  `id_skill_type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skill`
--

INSERT INTO `skill` (`id_skill`, `name`, `lvl`, `id_person`, `id_skill_type`) VALUES
(1, 'Java', 75, 1, 1),
(2, 'PHP', 70, 1, 1),
(3, 'MySQL', 70, 1, 1),
(4, 'HTML', 80, 1, 1),
(5, 'CSS', 75, 1, 1),
(6, 'JavaScript', 65, 1, 1),
(7, 'TypeScript', 60, 1, 1),
(8, 'Angular', 55, 1, 1),
(9, 'SpringBoot', 55, 1, 1),
(10, 'English', 70, 1, 2),
(11, 'Spanish', 100, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `skill_type`
--

CREATE TABLE `skill_type` (
  `id_skill_type` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skill_type`
--

INSERT INTO `skill_type` (`id_skill_type`, `name`) VALUES
(1, 'technology'),
(2, 'language');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'user', 'user'),
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `user_has_role`
--

CREATE TABLE `user_has_role` (
  `id_user` int(11) NOT NULL,
  `id_role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_has_role`
--

INSERT INTO `user_has_role` (`id_user`, `id_role`) VALUES
(1, 1),
(2, 2);

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
-- Indexes for table `extra_skill`
--
ALTER TABLE `extra_skill`
  ADD PRIMARY KEY (`id_extra_skill`,`id_person`),
  ADD KEY `fk_extra_skill_person1` (`id_person`);

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
  ADD PRIMARY KEY (`id_skill`,`id_person`,`id_skill_type`),
  ADD KEY `fk_skill_person1` (`id_person`),
  ADD KEY `fk_skill_skill_type1` (`id_skill_type`);

--
-- Indexes for table `skill_type`
--
ALTER TABLE `skill_type`
  ADD PRIMARY KEY (`id_skill_type`);

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
  MODIFY `id_education` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `experience`
--
ALTER TABLE `experience`
  MODIFY `id_experience` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `extra_skill`
--
ALTER TABLE `extra_skill`
  MODIFY `id_extra_skill` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id_person` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `id_project` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id_role` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `skill`
--
ALTER TABLE `skill`
  MODIFY `id_skill` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `skill_type`
--
ALTER TABLE `skill_type`
  MODIFY `id_skill_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
-- Constraints for table `extra_skill`
--
ALTER TABLE `extra_skill`
  ADD CONSTRAINT `fk_extra_skill_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `fk_project_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `skill`
--
ALTER TABLE `skill`
  ADD CONSTRAINT `fk_skill_person1` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_skill_skill_type1` FOREIGN KEY (`id_skill_type`) REFERENCES `skill_type` (`id_skill_type`) ON DELETE NO ACTION ON UPDATE NO ACTION;

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
