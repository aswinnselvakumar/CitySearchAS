select * from city_info;
select * from person_info;


DROP TABLE IF EXISTS CITY_INFO;


CREATE TABLE CITY_INFO(
city_id SERIAL NOT NULL,
city_name char(50) NOT NULL,
city_short_name char(3),
city_state char(50) NOT NULL,
city_country char(50) NOT NULL,
PRIMARY KEY (city_name,city_country)
);

DROP TABLE IF EXISTS PERSON_INFO;

CREATE TABLE PERSON_INFO(
person_id SERIAL PRIMARY KEY NOT NULL,
city_id INT NOT NULL,
person_name char(50)
);



select * from application.person_info;