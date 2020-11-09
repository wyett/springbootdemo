set names utf8mb4;

--
create database doubleeleven;
--

use doubleeleven;
--
-- tables
--

create table commodity(
id bigint unsigned not null auto_increment,
commodity_name varchar(32) not null,
commodity_type tinyint,
online_time datetime(3),
offline_time datetime(3),
status tinyint comment '1: online, 0:offline',
price float,
remain_count int,
primary key(id)
)engine=innodb;