# Информация о проекте
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.

### Задание 1.
Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).
![task_1](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/5bef9f95-be8d-4905-99e4-3d7b473cc86f)
### Задание 2.
Создать директорию, переместить файл туда.
![task_2](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/dd30f659-52dd-4244-97f3-eea12b19c303)
### Задание 3.
Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.
![task_3](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/b302a5d3-de51-437f-9c7f-cff0b6b7783a)
### Задание 4.
Установить и удалить deb-пакет с помощью dpkg.
![task_4](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/f8e09327-28dd-48bd-82e0-6a7103d51767)
![task_4 1](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/e19c2621-6159-4fcc-be16-63baaaca289a)
![task_4 2](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/5af7d584-0913-47f6-848b-de722a0849d7)
### Задание 5.
Выложить историю команд в терминале ubuntu
![task_5](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/8ea96d4b-53a5-4fb0-b632-23700afd5b80)
![task_5 1](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/7c302e63-ff03-431d-8a23-35e234130ba2)
### Задание 6.
арисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).
![6](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/d0cf1dd8-0f43-4c9e-8f5f-6ffe39b8a183)
### Задание 7.
В подключенном MySQL репозитории создать базу данных “Друзья
человека”
![7](https://github.com/MaksimZ91/Animal_Reestr/assets/72209139/ff5d7c4b-ecee-4150-b53d-ccc01b9d6f93)
```sql
CREATE DATABASE IF NOT EXISTS Frinds_Of_man;
USE Frinds_Of_man;
```
### Задание 8.
Создать таблицы с иерархией из диаграммы в БД
```sql
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
```
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.
13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
14.1 Завести новое животное
14.2 определять животное в правильный класс
14.3 увидеть список команд, которое выполняет животное
14.4 обучить животное новым командам
14.5 Реализовать навигацию по меню
15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.
