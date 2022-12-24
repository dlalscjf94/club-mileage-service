-- Adminer 4.8.1 MySQL 8.0.31 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
                         `id` binary(16) NOT NULL,
                         `mod_date` datetime(6) DEFAULT NULL,
                         `reg_date` datetime(6) DEFAULT NULL,
                         `filename` varchar(255) NOT NULL,
                         `review_id` binary(16) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `place`;
CREATE TABLE `place` (
                         `id` binary(16) NOT NULL,
                         `mod_date` datetime(6) DEFAULT NULL,
                         `reg_date` datetime(6) DEFAULT NULL,
                         `name` varchar(255) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `point`;
CREATE TABLE `point` (
                         `id` bigint NOT NULL AUTO_INCREMENT,
                         `mod_date` datetime(6) DEFAULT NULL,
                         `reg_date` datetime(6) DEFAULT NULL,
                         `amount` bigint NOT NULL,
                         `review_id` binary(16) NOT NULL,
                         `user_id` binary(16) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
                          `id` binary(16) NOT NULL,
                          `mod_date` datetime(6) DEFAULT NULL,
                          `reg_date` datetime(6) DEFAULT NULL,
                          `content` varchar(255) DEFAULT NULL,
                          `place_id` binary(16) NOT NULL,
                          `user_id` binary(16) NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
                         `id` binary(16) NOT NULL,
                         `mod_date` datetime(6) DEFAULT NULL,
                         `reg_date` datetime(6) DEFAULT NULL,
                         `name` varchar(255) NOT NULL,
                         `password` varchar(255) NOT NULL,
                         `tel` varchar(255) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- 2022-12-23 18:08:02