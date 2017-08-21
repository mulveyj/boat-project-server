CREATE TABLE `sailboat` (
  `boat_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `vessel_name` VARCHAR(255) NOT NULL,
  `builder` VARCHAR(255) NOT NULL,
  `length_over_all` INT(10) NOT NULL,
  `img_url` VARCHAR(255),
  `vessel_class` VARCHAR(255),
  `construction` VARCHAR(255),
  `main_reefs` INT(10),
  `spinnaker` VARCHAR(255),
  `headsail_one` VARCHAR(255),
  `headsail_two` VARCHAR(255),
  `headsail_three` VARCHAR(255),
  PRIMARY KEY (`boat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;