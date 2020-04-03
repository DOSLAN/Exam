
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `firstName` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `lastName` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `emailAddress` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `jobTitle` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `mobilePhone` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `city` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `webPage` text CHARACTER SET utf8 COLLATE utf8_general_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `customers` (`id`, `firstName`, `lastName`, `emailAddress`, `jobTitle`, `mobilePhone`, `city`, `webPage`) VALUES
(1, 'Doslan', 'Zheksheev', 'doslan130400@gmail.com', 'student', '+996703291036', 'Karakol', '@iaau.edu.kg');

ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

