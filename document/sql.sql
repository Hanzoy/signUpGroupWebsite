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
                           `isDispensing` tinyint(1) DEFAULT '1',
                           `code` int(5) NOT NULL,
                           PRIMARY KEY (`stuId`,`code`),
                           KEY `major约束` (`major`),
                           KEY `secondWill约束` (`secondWill`),
                           KEY `firstWill约束` (`firstWill`),
                           CONSTRAINT `firstWill约束` FOREIGN KEY (`firstWill`) REFERENCES `will` (`willId`) ON DELETE NO ACTION ON UPDATE CASCADE,
                           CONSTRAINT `major约束` FOREIGN KEY (`major`) REFERENCES `major` (`majorId`) ON DELETE NO ACTION ON UPDATE CASCADE,
                           CONSTRAINT `secondWill约束` FOREIGN KEY (`secondWill`) REFERENCES `will` (`willId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
;

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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `user` (
                        `id` int(8) NOT NULL AUTO_INCREMENT,
                        `username` varchar(8) NOT NULL,
                        `password` varchar(16) NOT NULL,
                        `role` tinyint(1) NOT NULL DEFAULT '0',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;