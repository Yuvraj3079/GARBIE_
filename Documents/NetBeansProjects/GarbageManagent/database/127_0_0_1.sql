-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 06, 2017 at 10:12 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `garbage`
--
CREATE DATABASE IF NOT EXISTS `garbage` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `garbage`;

-- --------------------------------------------------------

--
-- Table structure for table `addbus`
--

CREATE TABLE `addbus` (
  `licence` varchar(100) NOT NULL,
  `volume` varchar(10) NOT NULL,
  `type` varchar(20) NOT NULL,
  `discharge` varchar(15) NOT NULL,
  `assigned` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addbus`
--

INSERT INTO `addbus` (`licence`, `volume`, `type`, `discharge`, `assigned`) VALUES
('124555', '200', 'PISTON', '2', 1),
('abc123', 'abc123', 'REAR', 'abc123', 0),
('AVCBDE1', '458', 'PISTON', '123', 0);

-- --------------------------------------------------------

--
-- Table structure for table `addcollector`
--

CREATE TABLE `addcollector` (
  `collector_id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` date NOT NULL,
  `image` varchar(100) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `assigned` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addcollector`
--

INSERT INTO `addcollector` (`collector_id`, `name`, `address`, `phone`, `gender`, `dob`, `image`, `Salary`, `assigned`) VALUES
(1, 'acv', 'aaa', '9646104241', 'Male', '2017-01-11', NULL, 100, 1),
(3, 'aaa', 'abcabc', '44556612', 'Male', '2017-01-01', 'Images\\1484821642106_image.jpg', 100, 0),
(4, 'ddd', 'jaladhar', '4444444', 'Male', '2017-01-05', 'Images\\1485614699100_Screenshot (20).png', 100, 1),
(5, 'name ', 'address1', '63124578', 'Female', '2017-02-19', 'Default\\mypic', 100, 0),
(6, 'nas', 'nas', '4585212', 'Male', '2017-02-09', 'Default\\mypic.png', 100, 0);

-- --------------------------------------------------------

--
-- Table structure for table `adddriver`
--

CREATE TABLE `adddriver` (
  `driver_id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` date NOT NULL,
  `image` varchar(100) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `assigned` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adddriver`
--

INSERT INTO `adddriver` (`driver_id`, `name`, `address`, `phone`, `gender`, `dob`, `image`, `Salary`, `assigned`) VALUES
(1, 'kunal', 'tu ki karna', '47596123', 'Male', '2017-01-01', 'Default\\mypic', 1000, 1),
(2, 'sapna', 'karol bagh', '14257852', 'Female', '2010-02-18', 'Default\\mypic', 1000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `addlocality`
--

CREATE TABLE `addlocality` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `size` varchar(10) NOT NULL,
  `assigned` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addlocality`
--

INSERT INTO `addlocality` (`id`, `name`, `address`, `size`, `assigned`) VALUES
(1, 'aaa', 'asdasas', 'LARGE', 1),
(2, 'kabira', 'kabira avenue', 'MEDIUM', 1);

-- --------------------------------------------------------

--
-- Table structure for table `addsweeper`
--

CREATE TABLE `addsweeper` (
  `sweeper_id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` date NOT NULL,
  `image` varchar(100) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `assigned` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addsweeper`
--

INSERT INTO `addsweeper` (`sweeper_id`, `name`, `address`, `phone`, `gender`, `dob`, `image`, `Salary`, `assigned`) VALUES
(1, 'ssssas', 'faded', '12345678', 'Male', '2017-01-06', 'Default\\mypic', 100, 1),
(2, 'ram', 'ggggg', '45471122', 'Male', '2014-02-26', 'Default\\mypic', 100, 1),
(3, 'mohan', 'ggggfff', '4547114', 'Male', '2014-02-18', 'Default\\mypic', 100, 1),
(4, 'sumit', 'sofipind', '145278', 'Male', '2017-01-29', 'Default\\mypic', 100, 1);

-- --------------------------------------------------------

--
-- Table structure for table `admintable`
--

CREATE TABLE `admintable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admintable`
--

INSERT INTO `admintable` (`username`, `password`) VALUES
('yuvraj', '123');

-- --------------------------------------------------------

--
-- Table structure for table `assign`
--

CREATE TABLE `assign` (
  `assign_id` int(11) NOT NULL,
  `locality_id` int(11) NOT NULL,
  `bus_id` varchar(11) NOT NULL,
  `driver_id` int(11) NOT NULL,
  `collector_id` int(11) NOT NULL,
  `extra` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assign`
--

INSERT INTO `assign` (`assign_id`, `locality_id`, `bus_id`, `driver_id`, `collector_id`, `extra`) VALUES
(1, 1, 'abc123', 1, 1, NULL),
(2, 2, 'abc123', 1, 3, NULL),
(3, 2, 'abc123', 1, 3, NULL),
(4, 1, 'AVCBDE1', 1, 1, NULL),
(5, 1, 'abc123', 1, 1, NULL),
(6, 2, 'abc123', 1, 1, NULL),
(7, 1, '124555', 1, 4, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` int(10) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(6) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `sweeperassigned` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`id`, `date`, `time`, `address`, `phone`, `sweeperassigned`) VALUES
(1, '2017-02-08', '14:15', 'nbbvggg', '4587123', '2'),
(2, '2017-02-09', '0:0', '22222', '45781255', '1'),
(3, '2017-02-16', '0:0', 'aqsdasd', '24576577', '2,'),
(4, '2017-02-10', '0:0', 'adsa', 'aaaaa', '3,'),
(5, '2017-02-17', '0:0', 'sdasdas', 'aaaa', '3,'),
(6, '2017-02-10', '0:0', 'asda', 'aasda', '1,2,3,'),
(7, '2017-02-06', '4:2', 'mhvb', '9854654655', '4,');

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE `employeetable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`username`, `password`) VALUES
('ram12', '123'),
('yuvraj1', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addbus`
--
ALTER TABLE `addbus`
  ADD PRIMARY KEY (`licence`);

--
-- Indexes for table `addcollector`
--
ALTER TABLE `addcollector`
  ADD PRIMARY KEY (`collector_id`);

--
-- Indexes for table `adddriver`
--
ALTER TABLE `adddriver`
  ADD PRIMARY KEY (`driver_id`);

--
-- Indexes for table `addlocality`
--
ALTER TABLE `addlocality`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `addsweeper`
--
ALTER TABLE `addsweeper`
  ADD PRIMARY KEY (`sweeper_id`);

--
-- Indexes for table `assign`
--
ALTER TABLE `assign`
  ADD PRIMARY KEY (`assign_id`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addcollector`
--
ALTER TABLE `addcollector`
  MODIFY `collector_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `adddriver`
--
ALTER TABLE `adddriver`
  MODIFY `driver_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `addlocality`
--
ALTER TABLE `addlocality`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `addsweeper`
--
ALTER TABLE `addsweeper`
  MODIFY `sweeper_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `assign`
--
ALTER TABLE `assign`
  MODIFY `assign_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
