-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2023 at 03:06 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gudang_paket`
--

-- --------------------------------------------------------

--
-- Table structure for table `courier`
--

CREATE TABLE `courier` (
  `courier_id` int(5) NOT NULL,
  `courier_name` varchar(30) NOT NULL,
  `courier_phone` varchar(15) NOT NULL,
  `courier_email` varchar(50) NOT NULL,
  `courier_vehicle_type` varchar(10) NOT NULL,
  `courier_location` varchar(20) NOT NULL,
  `courier_capacity` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `courier`
--

INSERT INTO `courier` (`courier_id`, `courier_name`, `courier_phone`, `courier_email`, `courier_vehicle_type`, `courier_location`, `courier_capacity`) VALUES
(1234, 'YYY', '64237', 'GHSAHJAGDF', 'Motor', 'PKL', 20),
(1236, 'mbuh', 'T14251426', 'HSGASHSX', 'Motor', 'DHFDSFH', 50);

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE `delivery` (
  `delivery_id` varchar(10) NOT NULL,
  `courier_id` int(5) NOT NULL,
  `packet_id` varchar(10) NOT NULL,
  `delivery_date` varchar(30) NOT NULL,
  `delivery_status` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`delivery_id`, `courier_id`, `packet_id`, `delivery_date`, `delivery_status`) VALUES
('11', 1236, 'JJ1234', '767676', 'Terkirim'),
('YADG12', 1234, '1', '2023-07-03', 'Terkirim');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(10) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `conpassword` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `conpassword`) VALUES
('ADMIN001', 'ard', 'ard123', 'ard123');

-- --------------------------------------------------------

--
-- Table structure for table `packet`
--

CREATE TABLE `packet` (
  `packet_id` varchar(10) NOT NULL,
  `packet_weight` float NOT NULL,
  `packet_dimensions` varchar(30) NOT NULL,
  `packet_description` varchar(300) NOT NULL,
  `sender_name` varchar(30) NOT NULL,
  `sender_phone` varchar(15) NOT NULL,
  `sender_address` varchar(300) NOT NULL,
  `receiver_name` varchar(30) NOT NULL,
  `receiver_phone` varchar(15) NOT NULL,
  `receiver_address` varchar(300) NOT NULL,
  `packet_status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `packet`
--

INSERT INTO `packet` (`packet_id`, `packet_weight`, `packet_dimensions`, `packet_description`, `sender_name`, `sender_phone`, `sender_address`, `receiver_name`, `receiver_phone`, `receiver_address`, `packet_status`) VALUES
('1', 1, '1', '1', '1', '1', '1', '1', '1', '1', 'Belum Dikirim'),
('JJ1234', 20, '20 x 30 x 40', 'Isinya Baju', 'Arda', '085640775539', 'Rowoyoso', 'Budi', '085338746727', 'Semarang', 'Belum Dikirim');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courier`
--
ALTER TABLE `courier`
  ADD PRIMARY KEY (`courier_id`);

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`delivery_id`),
  ADD UNIQUE KEY `packet` (`packet_id`),
  ADD KEY `courier_id` (`courier_id`) USING BTREE;

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `packet`
--
ALTER TABLE `packet`
  ADD PRIMARY KEY (`packet_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `delivery`
--
ALTER TABLE `delivery`
  ADD CONSTRAINT `fk_delivery_courier` FOREIGN KEY (`courier_id`) REFERENCES `courier` (`courier_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_delivery_packet` FOREIGN KEY (`packet_id`) REFERENCES `packet` (`packet_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
