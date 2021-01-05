/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author mirza
 */
public class SQL {
    
//    -- phpMyAdmin SQL Dump
//-- version 5.0.2
//-- https://www.phpmyadmin.net/
//--
//-- Host: localhost
//-- Generation Time: Jan 05, 2021 at 01:29 PM
//-- Server version: 10.4.13-MariaDB
//-- PHP Version: 7.4.7
//
//SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
//START TRANSACTION;
//SET time_zone = "+00:00";
//
//
///*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
///*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
///*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
///*!40101 SET NAMES utf8mb4 */;
//
//--
//-- Database: `5f_penjualan`
//--
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `barang`
//--
//
//CREATE TABLE `barang` (
//  `id` int(11) NOT NULL,
//  `nama_barang` varchar(200) NOT NULL,
//  `harga_barang` double NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `pembelian`
//--
//
//CREATE TABLE `pembelian` (
//  `id` int(11) NOT NULL,
//  `tanggal_beli` date NOT NULL,
//  `id_pengguna` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `pembelian_detail`
//--
//
//CREATE TABLE `pembelian_detail` (
//  `id` int(11) NOT NULL,
//  `id_pembelian` int(11) NOT NULL,
//  `id_barang` int(11) NOT NULL,
//  `harga_beli` double NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `pengguna`
//--
//
//CREATE TABLE `pengguna` (
//  `id` int(11) NOT NULL,
//  `username` varchar(200) NOT NULL,
//  `password` varchar(200) NOT NULL,
//  `id_pertanyaan` int(11) NOT NULL,
//  `jawaban` varchar(200) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//--
//-- Dumping data for table `pengguna`
//--
//
//INSERT INTO `pengguna` (`id`, `username`, `password`, `id_pertanyaan`, `jawaban`) VALUES
//(1, 'user', '03c1d8c243c5b558b4957a9e9f50d1fe', 1, 'j');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `penjualan`
//--
//
//CREATE TABLE `penjualan` (
//  `id` int(11) NOT NULL,
//  `tanggal_jual` date NOT NULL,
//  `id_pengguna` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `penjualan_detail`
//--
//
//CREATE TABLE `penjualan_detail` (
//  `id` int(11) NOT NULL,
//  `id_penjualan` int(11) NOT NULL,
//  `id_barang` int(11) NOT NULL,
//  `harga_jual` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `pertanyaan`
//--
//
//CREATE TABLE `pertanyaan` (
//  `id` int(11) NOT NULL,
//  `pertanyaan` varchar(200) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
//
//--
//-- Dumping data for table `pertanyaan`
//--
//
//INSERT INTO `pertanyaan` (`id`, `pertanyaan`) VALUES
//(1, 'Apa klub favoritmu?'),
//(2, 'Siapa teman baikmu waktu SMA?');
//
//--
//-- Indexes for dumped tables
//--
//
//--
//-- Indexes for table `barang`
//--
//ALTER TABLE `barang`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `pembelian`
//--
//ALTER TABLE `pembelian`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `pembelian_detail`
//--
//ALTER TABLE `pembelian_detail`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `pengguna`
//--
//ALTER TABLE `pengguna`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `penjualan`
//--
//ALTER TABLE `penjualan`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `penjualan_detail`
//--
//ALTER TABLE `penjualan_detail`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `pertanyaan`
//--
//ALTER TABLE `pertanyaan`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- AUTO_INCREMENT for dumped tables
//--
//
//--
//-- AUTO_INCREMENT for table `barang`
//--
//ALTER TABLE `barang`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `pembelian`
//--
//ALTER TABLE `pembelian`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `pembelian_detail`
//--
//ALTER TABLE `pembelian_detail`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `pengguna`
//--
//ALTER TABLE `pengguna`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
//
//--
//-- AUTO_INCREMENT for table `penjualan`
//--
//ALTER TABLE `penjualan`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `penjualan_detail`
//--
//ALTER TABLE `penjualan_detail`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `pertanyaan`
//--
//ALTER TABLE `pertanyaan`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
//COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

    
}
