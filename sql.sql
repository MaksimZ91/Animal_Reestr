CREATE DATABASE IF NOT EXISTS Frinds_Of_man;
USE Frinds_Of_man;

DROP TABLE IF EXISTS pack_animals;
CREATE TABLE  pack_animals
(
 pack_animals_class_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_class VARCHAR(255),
 animal_type_id INT -- 1 - вьючныйе, 2 - домашние
);

DROP TABLE IF EXISTS horse;
CREATE TABLE  horse
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(255),
 comands  VARCHAR(255),
 date_of_birth DATE,
 animal_class_id INT,
 animal_type_id INT
);

DROP TABLE IF EXISTS camels;
CREATE TABLE  camels
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(255),
 comands  VARCHAR(255),
 date_of_birth DATE,
 animal_class_id INT,
 animal_type_id INT
);

DROP TABLE IF EXISTS donkeys;
CREATE TABLE  donkeys
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(255),
 comands  VARCHAR(255),
 date_of_birth DATE,
 animal_class_id INT,
 animal_type_id INT
);

DROP TABLE IF EXISTS home_animals;
CREATE TABLE  home_animals
(
 home_animals_class_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_class VARCHAR(255),
 animal_type_id INT
);

DROP TABLE IF EXISTS dogs;
CREATE TABLE  dogs
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(255),
 comands  VARCHAR(255),
 date_of_birth DATE,
 animal_class_id INT,
 animal_type_id INT
);

DROP TABLE IF EXISTS cats;
CREATE TABLE  cats
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(255),
 comands  VARCHAR(255),
 date_of_birth DATE,
 animal_class_id INT,
 animal_type_id INT
);

DROP TABLE IF EXISTS homyaks;
CREATE TABLE  homyaks
(
 animal_id INT AUTO_INCREMENT PRIMARY KEY,
 animal_name VARCHAR(255),
 comands  VARCHAR(255),
 date_of_birth DATE,
 animal_class_id INT,
 animal_type_id INT
);

INSERT pack_animals (animal_class, animal_type_id)
VALUES
("Лошадь",1),
("Верблюд",1),
("Осел", 1);

INSERT home_animals (animal_class, animal_type_id)
VALUES
("Собака",2),
("Кошка",2),
("Хомяк",2);

INSERT horse (animal_name, comands, date_of_birth, animal_class_id, animal_type_id)
VALUES
("Плотва", "Респавниться на крыше", "2019-08-11", 1, 1),
("Стелка", "Галоп", "2022-12-13", 1,1),
("Геркусел", "Спать", "2022-07-01", 1,1);

INSERT camels (animal_name, comands, date_of_birth, animal_class_id, animal_type_id )
VALUES
("Степан", "Респавниться на крыше", "2020-08-11", 2,1),
("Георгий", "Галоп", "2023-01-13", 2,1);

INSERT donkeys (animal_name, comands, date_of_birth, animal_class_id, animal_type_id )
VALUES
("ИА", "Искать хвост", "2020-09-27", 3,1);

INSERT cats (animal_name, comands, date_of_birth, animal_class_id, animal_type_id )
VALUES
("Мурзик", "Точить когти", "2018-06-12", 2, 2),
("Муська", "Бесить Мурзика", "2019-05-09", 2,2),
("Бегемот", "починять примус", "2015-06-16", 2,2);

INSERT dogs (animal_name, comands, date_of_birth, animal_class_id, animal_type_id )
VALUES
("Белка", "охранять дом", "2021-01-11", 1, 2),
("Мухтар", "Искать кости", "2021-06-11", 1,2);

INSERT homyaks (animal_name, comands, date_of_birth, animal_class_id, animal_type_id )
VALUES
("Белый", "крутить колесо", "2023-01-17", 3, 2);

DELETE FROM pack_animals 
WHERE animal_class="Верблюд";
DROP TABLE camels;


SELECT * FROM horse
UNION
SELECT * FROM donkeys;


CREATE TABLE yong_animals AS
SELECT animal_name, comands, date_of_birth, animal_class_id, animal_type_id, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS month
 FROM horse
WHERE (YEAR(CURRENT_DATE)-YEAR(date_of_birth))-(DATE_FORMAT(CURRENT_DATE,'%m%d')<DATE_FORMAT(date_of_birth,'%m%d')) BEtWEEN 1 AND 3
UNION
SELECT animal_name, comands, date_of_birth, animal_class_id, animal_type_id, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS month
FROM donkeys   
WHERE (YEAR(CURRENT_DATE)-YEAR(date_of_birth))-(DATE_FORMAT(CURRENT_DATE,'%m%d')<DATE_FORMAT(date_of_birth,'%m%d')) BEtWEEN 1 AND 3    
UNION
SELECT animal_name, comands, date_of_birth, animal_class_id, animal_type_id, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS month
 FROM cats
WHERE (YEAR(CURRENT_DATE)-YEAR(date_of_birth))-(DATE_FORMAT(CURRENT_DATE,'%m%d')<DATE_FORMAT(date_of_birth,'%m%d')) BEtWEEN 1 AND 3
UNION
SELECT animal_name, comands, date_of_birth, animal_class_id, animal_type_id, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS month
FROM dogs  
WHERE (YEAR(CURRENT_DATE)-YEAR(date_of_birth))-(DATE_FORMAT(CURRENT_DATE,'%m%d')<DATE_FORMAT(date_of_birth,'%m%d')) BEtWEEN 1 AND 3
UNION
SELECT animal_name, comands, date_of_birth, animal_class_id, animal_type_id, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS month
FROM homyaks
WHERE (YEAR(CURRENT_DATE)-YEAR(date_of_birth))-(DATE_FORMAT(CURRENT_DATE,'%m%d')<DATE_FORMAT(date_of_birth,'%m%d')) BEtWEEN 1 AND 3;


SELECT h.animal_name, h.comands, h.date_of_birth, h.animal_type_id, ya.month, pa.animal_class, pa.pack_animals_class_id
FROM horse as h
LEFT JOIN pack_animals pa ON pa.pack_animals_class_id = h.animal_class_id
LEFT JOIN yong_animals ya ON ya.animal_name = h.animal_name
UNION   
SELECT dk.animal_name, dk.comands, dk.date_of_birth, dk.animal_type_id, ya.month, pa.animal_class, pa.pack_animals_class_id
FROM donkeys as dk
LEFT JOIN pack_animals pa ON pa.pack_animals_class_id = dk.animal_class_id  
LEFT JOIN yong_animals ya ON ya.animal_name = dk.animal_name
UNION   
SELECT d.animal_name, d.comands, d.date_of_birth, d.animal_type_id, ya.month, ha.animal_class, ha.home_animals_class_id
FROM dogs as d
LEFT JOIN home_animals ha ON ha.home_animals_class_id = d.animal_class_id   
LEFT JOIN yong_animals ya ON ya.animal_name = d.animal_name
UNION  
SELECT c.animal_name, c.comands, c.date_of_birth, c.animal_type_id, ya.month, ha.animal_class, ha.home_animals_class_id	
FROM cats as c
LEFT JOIN home_animals ha ON ha.home_animals_class_id = c.animal_class_id 
LEFT JOIN yong_animals ya ON ya.animal_name = c.animal_name  
UNION   
SELECT  hom.animal_name, hom.comands, hom.date_of_birth, hom.animal_type_id, ya.month, ha.animal_class, ha.home_animals_class_id
FROM homyaks as hom
LEFT JOIN home_animals ha ON ha.home_animals_class_id = hom.animal_class_id 
LEFT JOIN yong_animals ya ON ya.animal_name = hom.animal_name  

        

      




















