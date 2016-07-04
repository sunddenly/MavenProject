CREATE DATABASE 'maven' CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'jxy'@'%' IDENTIFIED BY '123456';#后面的表示密码ssm
GRANT ALL PRIVILEGES ON maven.* TO 'jxy'@'%';
FLUSH PRIVILEGES;
use maven;
create table IF NOT EXISTS t_user(
	id int(10) auto_increment primary key,
	username varchar(20),
	password varchar(20),
	nickname varchar(20)
);