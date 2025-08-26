CREATE DATABASE gt050525_be;
USE gt050525_be;

-- Тип данных 
-- varchar(max_count) 
-- char(fixed_count)

-- Ограниченния/атрибуты 
-- primary key - not null + unique
-- not null - значение в поле не может быть незаполненным
-- unique - значения в поле должны быть уникальные
-- check(условие) - соответствует какому-либо условию
-- auto_increment - авто заполнения поля целыми числами
-- default - значение по умолчанию
 
CREATE TABLE test_table1 (
   id INT PRIMARY KEY AUTO_INCREMENT,
   first_name VARCHAR(128) NOT NULL,
   last_name VARCHAR(128) NOT NULL,
   user_name VARCHAR(128) UNIQUE,
   age INT  CHECK(age > 16) NOT NULL
);

-- Создать таблицу students
-- id целое число, уникальное значение, не null, автозаполнение 
-- firstname varchar not null
-- lastname varchar not null
-- class integer от 1 до 10 (вкл)
-- subject_name varchar not null
-- mark integer от 0 до 5 (вкл)
-- school_no integer по умолч. 0
-- checked char(1) значение Y либо N

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(128) NOT NULL,
    lastname VARCHAR(128) NOT NULL,
    class INT CHECK (class BETWEEN 1 AND 10),
    subject_name VARCHAR(128) NOT NULL,
    mark INT CHECK (mark BETWEEN 0 AND 5),
    school_no INT DEFAULT 0,
    checked CHAR(1) CHECK (checked IN ('Y' , 'N'))
);

--  Создать таблицу staff с полями:
-- • id – целое число - первичный ключ с автозаполнением 
-- • firstname - строка максимум 60 символов не null
-- • lastname - строка максимум 100 символов не null
-- • position - строка максимум 100 символов
-- • age - целое число - от 0 до 110(вкл.)
-- • has_child – строка с одним символом - либо Y, либо N
-- • username - строка максимум 100 символов - уникальное значение не null

CREATE TABLE staff (
    id INT PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(60) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    position VARCHAR(100),
    age INT CHECK (age BETWEEN 0 AND 110),
    has_child CHAR(1) CHECK (has_child IN ('Y' , 'N')),
    username VARCHAR(100) NOT NULL UNIQUE
);
-- Ошибки при заполнении таблицы 
INSERT INTO staff
VALUES ('John', 'Smith', 'Manager', 25, 'N', 'jsmith1');
-- Error Code: 1136. Column count doesn't match value count at row 1	0.016 sec

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 25, 'N', 'jsmith1');

INSERT INTO staff (lastname, position, age, has_child, username)
VALUES ('Smith', 'Manager', 25, 'N', 'jsmith1');
-- Error Code: 1364. Field 'firstname' doesn't have a default value	0.000 sec

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 250, 'N', 'jsmith1');
-- Error Code: 3819. Check constraint 'staff_chk_1' is violated.

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 25, 'М', 'jsmith1');
-- Error Code: 3819. Check constraint 'staff_chk_2' is violated.

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 25, 'N', 'jsmith1');
-- Error Code: 1062. Duplicate entry 'jsmith1' for key 'staff.username'

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('JohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohn', 'Smith', 'Manager', 25, 'N', 'jsmith2');
-- Error Code: 1406. Data too long for column 'firstname' at row 1

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 25, 'NN', 'jsmith2');
-- Error Code: 1406. Data too long for column 'has_child' at row 1

INSERT INTO staff (first_name, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 25, 'N', 'jsmith1');
-- Error Code: 1054. Unknown column 'first_name' in 'field list'

INSERT INTO staf (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 25, 'N', 'jsmith1');
-- Error Code: 1146. Table 'gt050525_be.staf' doesn't exist

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', NULL, 'Manager', '25', 'N', 'jsmith4');
-- Error Code: 1048. Column 'lastname' cannot be null

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', 'twenty-five', 'N', 'jsmith1');
-- Error Code: 1366. Incorrect integer value: 'twenty-five' for column 'age' at row 1

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 5, 25, 'N', 'jsmith2');

INSERT INTO staff (firstname, lastname, position, age, has_child, username)
VALUES ('John', 'Smith', 'Manager', '25', 'N', 'jsmith3');

SELECT * FROM staff;

-- Удаление таблицы 
-- DROP TABLE название_таблицы;
-- DROP TABLE IF EXISTS название_таблицы;

-- Удаление бд
-- DROP DATABASE название_бд;
-- DROP DATABASE IF EXISTS название_бд;

-- СОЗДАНИЕ БД С ПРОВЕРКОЙ НА НАЛИЧИЕ
-- CREATE DATABASE IF NOT EXISTS название_бд;

-- Изменение таблиц и столбцов 

-- ALTER TABLE название таблицы 
-- ADD COLUMN new_column_name data_type [constraint] - добавление нового столбца (по умолч. в конец)
-- DROP COLUMN dropped_column_name - удаление столбца
-- MODIFY COLUMN modified_column_name new_data_type - изменение типа данных столбца
-- RENAME COLUMN current_column_name TO new_column_name - переименование столбца
-- CHANGE COLUMN current_column_name new_column_name new_data_type - переименование и именение типа столбца

-- first
-- after column_name
-- before column_name

SELECT 
    *
FROM
    students;

-- Добавить столбец age тип - целое число.
ALTER TABLE students
ADD COLUMN age INT;

-- Удалить поле age
ALTER TABLE students
DROP COLUMN age;

-- Добавить поле age тип - int. Вставить после lastname.
ALTER TABLE students
ADD COLUMN age INT AFTER lastname;

-- Изменить тип поля age на decimal(5, 2)
ALTER TABLE students
MODIFY COLUMN age DECIMAL(5, 2);

-- Переименовать поле age на user_age
ALTER TABLE students
RENAME COLUMN age to user_age;

-- Переименовать user_age на age и изменить тип на int.
ALTER TABLE students
CHANGE COLUMN user_age age INT;

-- Добавить поля username (varchar(128)) и password (varchar(128)). 
-- Удалить поле school_no. 
-- Переименовать поля firstname на first_name, lastname на last_name.

ALTER TABLE students
ADD COLUMN username VARCHAR(128),
ADD COLUMN password VARCHAR(128),
DROP COLUMN school_no,
RENAME COLUMN firstname TO first_name,
RENAME COLUMN lastname TO last_name;

-- Создать таблицу students1 с полями
-- fname строка(60) (не null)
-- lastname строка(100) (не null)
-- avg_mark целое число (от 0 до 5 вкл.)
-- gender строка(128)

CREATE TABLE students1 (
    fname VARCHAR(60) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    avg_mark INT CHECK (avg_mark BETWEEN 0 AND 5),
    gender VARCHAR(128)
);

-- Добавить поле id integer primary key auto_increment в начало таблицы
-- Добавить поле age (тип целое число) после lastname
-- Поменять тип у gender на char(1)
-- Переименовать поле fname на firstname


ALTER TABLE students1
ADD COLUMN id INT PRIMARY KEY AUTO_INCREMENT FIRST;

ALTER TABLE students1
ADD COLUMN age INT AFTER lastname;

ALTER TABLE students1
MODIFY gender CHAR(1);

ALTER TABLE students1
CHANGE fname firstname VARCHAR(60) NOT NULL;

DROP TABLE staff;
DROP TABLE students;
DROP TABLE students1;
DROP TABLE test_table1;

CREATE TABLE employees(
 	employee_id INT PRIMARY KEY AUTO_INCREMENT,
 	first_name VARCHAR(128) NOT NULL,
 	last_name VARCHAR(128) NOT NULL,
 	email VARCHAR(128) NOT NULL,
 	salary INT, 
	department VARCHAR(128) NOT NULL
 );
 
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Steven","King",	"SKING", 24000, "Sales");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Neena" , "Kochhar" , "NKOCHHAR" , 17000 , "Sales");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Lex" , "De Haan" , "LDEHAAN" , 17000 , "Sales");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Alexander" , "Hunold" , "AHUNOLD" , 9000 , "Finance");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Bruce" , "Ernst" , "BERNST" , 6000 , "Finance");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Valli" , "Pataballa" , "VPATABAL" , 4800 , "Finance");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Diana" , "Lorentz" , "DIANALO" , 8800 , "Finance");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Nancy" , "Greenberg" , "NGREENBE" , 12008 , "Shipping");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Daniel" , "Faviet" , "DFAVIET" , 9000 , "Shipping");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Jose Manuel" , "Urman" , "JMURMAN" , 7800 , "Shipping");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Luis" , "Popp" , "LPOPP" , 6900 , "Shipping");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Den" , "Raphaely" , "DRAPHEAL" , 11000 , "Marketing");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Alexander" , "Khoo" , "AKHOO" , 3100 , "Marketing");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Shelli" , "Baida" , "SBAIDA" , 2900 , "Marketing");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Sigal" , "Tobias" , "STOBIAS" , 2800 , "Marketing");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Matthew" , "Weiss" , "MWEISS" , 8000 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Adam" , "Fripp" , "AFRIPP" , 8200 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Payam" , "Kaufling" , "PKAUFLIN" , 7900 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Shanta" , "Vollman" , "SVOLLMAN" , 6500 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Kevin" , "Mourgos" , "KMOURGOS" , 5800 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Julia" , "Nayer" , "JNAYER" , 3200 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Adam" , "Markle" , "SMARKLE" , 2200 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Laura" , "Bissot" , "LBISSOT" , 3300 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Mozhe" , "Atkinson" , "MATKINSO" , 2800 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Joshua" , "Patel" , "JPATEL" , 2500 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Trenna" , "Rajs" , "TRAJS" , 3500 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("John" , "Russell" , "JRUSSEL" , 14000 , "IT");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Karen" , "Partners" , "KPARTNER" , 13500 , "IT");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Alberto" , "Errazuriz" , "AERRAZUR" , 12000 , "IT");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Gerald" , "Cambrault" , "GCAMBRAU" , 11000 , "IT");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Eleni" , "Zlotkey" , "EZLOTKEY" , 10500 , "IT");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Adam" , "Vargas" , "PVARGAS" , 2500 , "Human Resources");
INSERT INTO employees(first_name, last_name, email, salary, department) VALUES("Laura" , "Errazuriz" , "AERRAZUR" , 12000 , "IT");

SELECT 
    *
FROM
    employees;

-- Вывести сотрудников, которые получают больше 10000.
SELECT 
    *
FROM
    employees
WHERE
    salary > 10000;

-- Вывести имена и фамилии сотрудников, которые работают в департаменте IT и получают больше 10000.
SELECT 
    first_name, last_name
FROM
    employees
WHERE
    department = 'IT' AND salary > 10000;

-- Обновление данных 

-- UPDATE table_name1
-- SET column_name1 = new_value, column_name2 = new_value
-- [WHERE условие];

-- Изменить департамент сотрудника "Steven", "King" на "IT".
UPDATE employees 
SET 
    department = 'IT'
WHERE
    first_name = 'Steven'
        AND last_name = 'King';
-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  
-- To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.

-- Откл. безопасного режима обновления данных 
SET sql_safe_updates = 0;

-- Вкл. безопасного режима обновления данных 
SET sql_safe_updates = 1;

UPDATE employees 
SET 
    department = 'IT'
WHERE
    first_name = 'Steven'
        AND last_name = 'King';








































































