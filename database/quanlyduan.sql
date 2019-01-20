-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 19, 2019 lúc 05:48 AM
-- Phiên bản máy phục vụ: 10.1.30-MariaDB
-- Phiên bản PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlyduan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danh_muc_du_an`
--

CREATE TABLE `danh_muc_du_an` (
  `ma_du_an` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ma_tieu_thuc` varchar(11) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danh_muc_tieu_thuc`
--

CREATE TABLE `danh_muc_tieu_thuc` (
  `ma_tieu_thuc` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ten_tieu_thuc` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `danh_muc_tieu_thuc`
--

INSERT INTO `danh_muc_tieu_thuc` (`ma_tieu_thuc`, `ten_tieu_thuc`) VALUES
('CD01', 'Giám Đốc'),
('CD02', 'Phó Giám Đốc'),
('CD03', 'Trưởng Phòng'),
('CD04', 'Phó Phòng'),
('CD05', 'Nhân Viên'),
('LHD01', 'Hợp đồng lao động không xác định thời hạn'),
('LHD02', 'Hợp đồng lao động có thời hạn'),
('LHD03', 'Hợp đồng lao động thời vụ'),
('TTNV01', 'Đang làm việc'),
('TTNV02', 'Đi công tác'),
('TTNV03', 'Nghỉ phép'),
('TTNV04', 'Nghỉ sinh sản');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khach_hang`
--

CREATE TABLE `khach_hang` (
  `ma_khach_hang` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ten_khach_hang` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `dia_chi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sdt_khach_hang` int(10) NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ma_so_thue` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `so_tai_khoan` int(13) NOT NULL,
  `ghi_chu` varchar(500) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_vien`
--

CREATE TABLE `nhan_vien` (
  `ma_nhan_vien` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ho_ten` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `gioi_tinh` varchar(6) COLLATE utf8_unicode_ci NOT NULL,
  `so_chung_minh_thu` int(13) NOT NULL,
  `dia_chi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `hinh_anh` text COLLATE utf8_unicode_ci NOT NULL,
  `ma_phong_ban` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ma_chuc_danh` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ma_loai_hop_dong` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ngay_bat_dau_hop_dong` date NOT NULL,
  `ngay_ket_thuc_hop_dong` date NOT NULL,
  `ma_trang_thai` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `pass_word` varchar(16) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhan_vien`
--

INSERT INTO `nhan_vien` (`ma_nhan_vien`, `ho_ten`, `gioi_tinh`, `so_chung_minh_thu`, `dia_chi`, `hinh_anh`, `ma_phong_ban`, `ma_chuc_danh`, `ma_loai_hop_dong`, `ngay_bat_dau_hop_dong`, `ngay_ket_thuc_hop_dong`, `ma_trang_thai`, `pass_word`) VALUES
('NV001', 'Trần Chấn', 'Nam', 2147483647, '06/13 Nguyễn Trải', '', 'PKT', 'CD05', 'LHD02', '0000-00-00', '0000-00-00', 'TTNV03', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong_ban`
--

CREATE TABLE `phong_ban` (
  `ma_phong_ban` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `ten_phong_ban` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phong_ban`
--

INSERT INTO `phong_ban` (`ma_phong_ban`, `ten_phong_ban`) VALUES
('PDA1', 'Phòng Dự Án số 1'),
('PDA2', 'Phòng Dự Án số 2'),
('PDA3', 'Phòng Dự Án số 3'),
('PGD', 'Phòng Giám Đốc'),
('PKT', 'Phòng Kế Toán'),
('PNS', 'Phòng Nhân Sự');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `danh_muc_tieu_thuc`
--
ALTER TABLE `danh_muc_tieu_thuc`
  ADD PRIMARY KEY (`ma_tieu_thuc`);

--
-- Chỉ mục cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD PRIMARY KEY (`ma_nhan_vien`);

--
-- Chỉ mục cho bảng `phong_ban`
--
ALTER TABLE `phong_ban`
  ADD PRIMARY KEY (`ma_phong_ban`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
