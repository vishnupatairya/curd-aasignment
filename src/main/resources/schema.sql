
create table contact
(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(100) DEFAULT NULL,
  phone_number VARCHAR(11) DEFAULT NULL,
  status VARCHAR(20) DEFAULT NULL
);

