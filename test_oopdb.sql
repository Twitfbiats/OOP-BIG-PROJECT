-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 07, 2023 lúc 04:58 PM
-- Phiên bản máy phục vụ: 10.4.25-MariaDB
-- Phiên bản PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `test_oopdb`
--
CREATE DATABASE IF NOT EXISTS `test_oopdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `test_oopdb`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `address`
--

CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `location` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `address`
--

INSERT INTO `address` (`id`, `location`) VALUES
(1, 'Ha Noi'),
(2, 'HCM'),
(3, 'An Giang'),
(4, 'Ca Mau');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone_number` int(11) NOT NULL,
  `address` int(11) NOT NULL,
  `role` enum('Sender','Receiver','Nobody') COLLATE utf8mb4_unicode_ci DEFAULT 'Nobody'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `customer`
--

INSERT INTO `customer` (`id`, `name`, `phone_number`, `address`, `role`) VALUES
(1, 'Nguyen Van Sender', 968600131, 1, 'Sender'),
(2, 'Nguyen Van Receiver', 974235612, 2, 'Receiver'),
(3, 'Nguyen Tran Phuc', 926789921, 3, 'Sender'),
(4, 'Vu Duc Dam', 238640023, 4, 'Receiver');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `package`
--

CREATE TABLE `package` (
  `id` int(11) NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weight` float NOT NULL,
  `sender` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `from_where` int(11) NOT NULL,
  `to_where` int(11) NOT NULL,
  `distance` float NOT NULL,
  `fee` float NOT NULL,
  `transport_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `send_date` datetime NOT NULL,
  `receive_date_estimation` datetime NOT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `package`
--

INSERT INTO `package` (`id`, `description`, `weight`, `sender`, `receiver`, `from_where`, `to_where`, `distance`, `fee`, `transport_type`, `send_date`, `receive_date_estimation`, `status`) VALUES
(1, 'Áo len nam cổ lọ màu mới nhất - Áo len nam', 10, 1, 2, 1, 2, 1000, 500, 'Air Transportation', '2023-01-03 16:00:00', '2023-01-05 16:00:00', 'Done'),
(2, 'Áo polo local brand By Unispace tay lỡ form rộng unisex nam nữ cotton Mountains', 15, 3, 4, 3, 4, 201.1, 100, 'Train Transportation', '2023-01-04 19:30:00', '2023-01-05 19:30:00', 'Done'),
(3, 'Áo len nam cổ lọ màu mới nhất - Áo len nam', 10, 1, 2, 1, 2, 1000, 500, 'Air Transportation', '2023-01-05 16:00:00', '2023-01-07 16:00:00', 'Done'),
(4, 'Áo polo local brand By Unispace tay lỡ form rộng unisex nam nữ cotton Mountains', 15, 3, 4, 3, 4, 201.1, 100, 'Train Transportation', '2023-01-05 19:30:00', '2023-01-06 19:30:00', 'Done'),
(5, 'Áo len nam cổ lọ màu mới nhất - Áo len nam', 10, 1, 2, 1, 2, 1000, 500, 'Air Transportation', '2023-01-07 16:00:00', '2023-01-09 16:00:00', 'Done'),
(6, 'Áo polo local brand By Unispace tay lỡ form rộng unisex nam nữ cotton Mountains', 15, 3, 4, 3, 4, 201.1, 100, 'Train Transportation', '2023-01-06 19:30:00', '2023-01-07 19:30:00', 'Done'),
(7, 'Áo len nam cổ lọ màu mới nhất - Áo len nam', 10, 1, 2, 1, 2, 1000, 500, 'Air Transportation', '2023-01-09 16:00:00', '2023-01-11 16:00:00', 'Done'),
(8, 'Áo polo local brand By Unispace tay lỡ form rộng unisex nam nữ cotton Mountains', 15, 3, 4, 3, 4, 201.1, 100, 'Train Transportation', '2023-01-07 19:30:00', '2023-01-08 19:30:00', 'Done'),
(9, 'Áo len nam cổ lọ màu mới nhất - Áo len nam', 10, 1, 2, 1, 2, 1000, 500, 'Air Transportation', '2023-01-11 16:00:00', '2023-01-13 16:00:00', 'Done'),
(10, 'Áo polo local brand By Unispace tay lỡ form rộng unisex nam nữ cotton Mountains', 15, 3, 4, 3, 4, 201.1, 100, 'Train Transportation', '2023-01-08 19:30:00', '2023-01-09 19:30:00', 'Done'),
(11, 'Áo len nam cổ lọ màu mới nhất - Áo len nam', 10, 1, 2, 1, 2, 1000, 500, 'Air Transportation', '2023-01-13 16:00:00', '2023-01-15 16:00:00', 'Done');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `address` (`address`);

--
-- Chỉ mục cho bảng `package`
--
ALTER TABLE `package`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sender` (`sender`),
  ADD KEY `receiver` (`receiver`),
  ADD KEY `from_where` (`from_where`),
  ADD KEY `to_where` (`to_where`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`address`) REFERENCES `address` (`id`);

--
-- Các ràng buộc cho bảng `package`
--
ALTER TABLE `package`
  ADD CONSTRAINT `package_ibfk_1` FOREIGN KEY (`sender`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `package_ibfk_2` FOREIGN KEY (`receiver`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `package_ibfk_3` FOREIGN KEY (`from_where`) REFERENCES `address` (`id`),
  ADD CONSTRAINT `package_ibfk_4` FOREIGN KEY (`to_where`) REFERENCES `address` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
