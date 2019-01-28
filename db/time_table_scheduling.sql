-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2018 at 05:18 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `time_table_scheduling`
--

-- --------------------------------------------------------

--
-- Table structure for table `app_user`
--

CREATE TABLE `app_user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `app_user`
--

INSERT INTO `app_user` (`user_id`, `username`, `firstname`, `lastname`, `password`) VALUES
(1, 'muhammad', 'Muhammad', '', 'muhammad');

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `class_id` int(11) NOT NULL,
  `class_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`class_id`, `class_name`) VALUES
(1, '100 Level'),
(2, '200 Level'),
(3, '300 Level'),
(4, '400 Level');

-- --------------------------------------------------------

--
-- Table structure for table `class_courses`
--

CREATE TABLE `class_courses` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `class_room`
--

CREATE TABLE `class_room` (
  `class_room_id` int(11) NOT NULL,
  `class_room_name` varchar(100) NOT NULL,
  `space_capacity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_id` int(11) NOT NULL,
  `course_name` varchar(100) NOT NULL,
  `maximum_number_of_student` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_instructor`
--

CREATE TABLE `course_instructor` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `instructor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE `instructor` (
  `instructor_id` int(11) NOT NULL,
  `instructor_name` varchar(100) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `meeting_time`
--

CREATE TABLE `meeting_time` (
  `time_id` int(11) NOT NULL,
  `time_title` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meeting_time`
--

INSERT INTO `meeting_time` (`time_id`, `time_title`) VALUES
(1, 'MON: 08 AM -- 09 AM'),
(2, 'MON: 09 AM -- 10 AM'),
(3, 'MON: 10 AM -- 11 AM'),
(4, 'MON: 11 AM -- 12 PM'),
(5, 'MON: 12 AM -- 01 PM'),
(7, 'MON: 02 PM -- 03 PM'),
(8, 'MON: 03 PM -- 04 PM'),
(9, 'MON: 04 PM -- 05 PM'),
(10, 'MON: 05 PM -- 06 PM'),
(11, 'TUE: 08 AM -- 09 AM'),
(12, 'TUE: 09 AM -- 10 AM'),
(13, 'TUE: 10 AM -- 11 AM'),
(14, 'TUE: 11 AM -- 12 PM'),
(15, 'TUE: 12 AM -- 01 PM'),
(16, 'TUE: 02 PM -- 03 PM'),
(17, 'TUE: 03 PM -- 04 PM'),
(18, 'TUE: 04 PM -- 05 PM'),
(19, 'TUE: 05 PM -- 06 PM'),
(20, 'WED: 08 AM -- 09 AM'),
(21, 'WED: 09 AM -- 10 AM'),
(22, 'WED: 10 AM -- 11 AM'),
(23, 'WED: 11 AM -- 12 PM'),
(24, 'WED: 12 AM -- 01 PM'),
(25, 'WED: 02 PM -- 03 PM'),
(26, 'WED: 03 PM -- 04 PM'),
(27, 'WED: 04 PM -- 05 PM'),
(28, 'WED: 05 PM -- 06 PM'),
(29, 'THU: 08 AM -- 09 AM'),
(30, 'THU: 09 AM -- 10 AM'),
(31, 'THU: 10 AM -- 11 AM'),
(32, 'THU: 11 AM -- 12 PM'),
(33, 'THU: 12 AM -- 01 PM'),
(34, 'THU: 02 PM -- 03 PM'),
(35, 'THU: 03 PM -- 04 PM'),
(36, 'THU: 04 PM -- 05 PM'),
(37, 'THU: 05 PM -- 06 PM'),
(38, 'FRI: 08 AM -- 09 AM'),
(39, 'FRI: 09 AM -- 10 AM'),
(40, 'FRI: 10 AM -- 11 AM'),
(41, 'FRI: 11 AM -- 12 PM'),
(42, 'FRI: 12 AM -- 01 PM'),
(43, 'FRI: 02 PM -- 03 PM'),
(44, 'FRI: 03 PM -- 04 PM'),
(45, 'FRI: 04 PM -- 05 PM'),
(46, 'FRI: 05 PM -- 06 PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `app_user`
--
ALTER TABLE `app_user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`class_id`);

--
-- Indexes for table `class_courses`
--
ALTER TABLE `class_courses`
  ADD PRIMARY KEY (`id`),
  ADD KEY `class_courses_ibfk_1` (`course_id`),
  ADD KEY `class_courses_ibfk_2` (`class_id`);

--
-- Indexes for table `class_room`
--
ALTER TABLE `class_room`
  ADD PRIMARY KEY (`class_room_id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`);

--
-- Indexes for table `course_instructor`
--
ALTER TABLE `course_instructor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `course_instructor_ibfk_1` (`course_id`),
  ADD KEY `course_instructor_ibfk_2` (`instructor_id`);

--
-- Indexes for table `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`instructor_id`);

--
-- Indexes for table `meeting_time`
--
ALTER TABLE `meeting_time`
  ADD PRIMARY KEY (`time_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `app_user`
--
ALTER TABLE `app_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `class`
--
ALTER TABLE `class`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `class_courses`
--
ALTER TABLE `class_courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `class_room`
--
ALTER TABLE `class_room`
  MODIFY `class_room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `course_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course_instructor`
--
ALTER TABLE `course_instructor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `instructor`
--
ALTER TABLE `instructor`
  MODIFY `instructor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `meeting_time`
--
ALTER TABLE `meeting_time`
  MODIFY `time_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `class_courses`
--
ALTER TABLE `class_courses`
  ADD CONSTRAINT `class_courses_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `class_courses_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `course_instructor`
--
ALTER TABLE `course_instructor`
  ADD CONSTRAINT `course_instructor_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `course_instructor_ibfk_2` FOREIGN KEY (`instructor_id`) REFERENCES `instructor` (`instructor_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
