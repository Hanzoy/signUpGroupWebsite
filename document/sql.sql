CREATE TABLE `student` (
                           `stuId` varchar(8) NOT NULL,
                           `stdName` varchar(26) NOT NULL,
                           `major` int(2) NOT NULL,
                           `classNum` varchar(10) NOT NULL,
                           `stdQQ` varchar(16) NOT NULL,
                           `stdPhone` varchar(11) NOT NULL,
                           `firstWill` int(2) NOT NULL,
                           `secondWill` int(2) DEFAULT NULL,
                           `firstReason` text,
                           `secondReason` text,
                           `isDispensing` tinyint(1) NOT NULL DEFAULT '1',
                           PRIMARY KEY (`stuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `major` (
                         `majorId` int(10) NOT NULL,
                         `majorName` varchar(16) NOT NULL,
                         PRIMARY KEY (`majorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `will` (
                        `willId` int(10) NOT NULL AUTO_INCREMENT,
                        `organization` varchar(32) NOT NULL,
                        `branch` varchar(32) NOT NULL,
                        PRIMARY KEY (`willId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

