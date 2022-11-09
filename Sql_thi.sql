
CREATE TABLE classrom (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(200) NULL,
  PRIMARY KEY (id));

CREATE TABLE hocvien (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(200) NULL,
  birth DATE NULL,
  adress VARCHAR(200) NULL,
  phone VARCHAR(12) NULL,
  email VARCHAR(200) NULL,
  class_id INT NULL,
  PRIMARY KEY (id),
 status varchar(255) default 'on',
  FOREIGN KEY (class_id)REFERENCES classrom(id)
  );
