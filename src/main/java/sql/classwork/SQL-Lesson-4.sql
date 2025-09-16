create table employees(
 	employee_id int primary key auto_increment,
 	first_name varchar(128) not null,
 	last_name varchar(128) not null,
 	email varchar(128) not null,
 	salary int, 
	department varchar(128) not null
 );
 
insert into employees(first_name, last_name, email, salary, department) values("Steven","King",	"SKING", 24000, "Sales");
insert into employees(first_name, last_name, email, salary, department) values("Neena" , "Kochhar" , "NKOCHHAR" , 17000 , "Sales");
insert into employees(first_name, last_name, email, salary, department) values("Lex" , "De Haan" , "LDEHAAN" , 17000 , "Sales");
insert into employees(first_name, last_name, email, salary, department) values("Alexander" , "Hunold" , "AHUNOLD" , 9000 , "Finance");
insert into employees(first_name, last_name, email, salary, department) values("Bruce" , "Ernst" , "BERNST" , 6000 , "Finance");
insert into employees(first_name, last_name, email, salary, department) values("Valli" , "Pataballa" , "VPATABAL" , 4800 , "Finance");
insert into employees(first_name, last_name, email, salary, department) values("Diana" , "Lorentz" , "DIANALO" , 8800 , "Finance");
insert into employees(first_name, last_name, email, salary, department) values("Nancy" , "Greenberg" , "NGREENBE" , 12008 , "Shipping");
insert into employees(first_name, last_name, email, salary, department) values("Daniel" , "Faviet" , "DFAVIET" , 9000 , "Shipping");
insert into employees(first_name, last_name, email, salary, department) values("Jose Manuel" , "Urman" , "JMURMAN" , 7800 , "Shipping");
insert into employees(first_name, last_name, email, salary, department) values("Luis" , "Popp" , "LPOPP" , 6900 , "Shipping");
insert into employees(first_name, last_name, email, salary, department) values("Den" , "Raphaely" , "DRAPHEAL" , 11000 , "Marketing");
insert into employees(first_name, last_name, email, salary, department) values("Alexander" , "Khoo" , "AKHOO" , 3100 , "Marketing");
insert into employees(first_name, last_name, email, salary, department) values("Shelli" , "Baida" , "SBAIDA" , 2900 , "Marketing");
insert into employees(first_name, last_name, email, salary, department) values("Sigal" , "Tobias" , "STOBIAS" , 2800 , "Marketing");
insert into employees(first_name, last_name, email, salary, department) values("Matthew" , "Weiss" , "MWEISS" , 8000 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Adam" , "Fripp" , "AFRIPP" , 8200 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Payam" , "Kaufling" , "PKAUFLIN" , 7900 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Shanta" , "Vollman" , "SVOLLMAN" , 6500 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Kevin" , "Mourgos" , "KMOURGOS" , 5800 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Julia" , "Nayer" , "JNAYER" , 3200 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Adam" , "Markle" , "SMARKLE" , 2200 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Laura" , "Bissot" , "LBISSOT" , 3300 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Mozhe" , "Atkinson" , "MATKINSO" , 2800 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Joshua" , "Patel" , "JPATEL" , 2500 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Trenna" , "Rajs" , "TRAJS" , 3500 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("John" , "Russell" , "JRUSSEL" , 14000 , "IT");
insert into employees(first_name, last_name, email, salary, department) values("Karen" , "Partners" , "KPARTNER" , 13500 , "IT");
insert into employees(first_name, last_name, email, salary, department) values("Alberto" , "Errazuriz" , "AERRAZUR" , 12000 , "IT");
insert into employees(first_name, last_name, email, salary, department) values("Gerald" , "Cambrault" , "GCAMBRAU" , 11000 , "IT");
insert into employees(first_name, last_name, email, salary, department) values("Eleni" , "Zlotkey" , "EZLOTKEY" , 10500 , "IT");
insert into employees(first_name, last_name, email, salary, department) values("Adam" , "Vargas" , "PVARGAS" , 2500 , "Human Resources");
insert into employees(first_name, last_name, email, salary, department) values("Laura" , "Errazuriz" , "AERRAZUR" , 12000 , "IT");

SELECT * FROM employees;

SET sql_safe_updates = 0;

-- Для сотурдников 'Diana' 'Lorentz', 'Bruce' 'Ernst' и 'Lex' 'De Haan' изменить значение 
-- зарплаты на NULL.

UPDATE employees 
SET 
    salary = NULL
WHERE
    (first_name = 'Diana'
        AND last_name = 'Lorentz')
        OR (first_name = 'Bruce'
        AND last_name = 'Ernst')
        OR (first_name = 'Lex'
        AND last_name = 'De Haan');

SELECT 
    employee_id,
    first_name,
    last_name,
    department,
    salary,
    CASE 
        WHEN department = 'Sales' OR department = 'Human Resources'THEN salary * 1.20
        WHEN department = 'Finance' THEN salary * 1.15
        WHEN department = 'Shipping' THEN salary * 1.10
        WHEN department = 'Marketing' THEN salary * 1.25
        WHEN department = 'IT' THEN salary * 1.35
        ELSE salary
    END AS new_salary
FROM employees;

-- Написать запрос, который выведет имя, фамилию и зарплату каждого сотрудника.
-- Если зарплата NULL, замените ее на 5000.     

SELECT 
    first_name,
    last_name,
    CASE
        WHEN salary IS NULL THEN 5000
        ELSE salary
    END AS salary
FROM
    employees;

SELECT 
    first_name, last_name, COALESCE(salary, 5000) AS salary
FROM
    employees;

SELECT 
    first_name, last_name, IFNULL(salary, 5000) AS salary
FROM
    employees;

SELECT 
    first_name,
    last_name,
    IF(salary IS NULL, 5000, salary) AS salary
FROM
    employees;


SELECT 
    first_name,
    last_name,
    salary,
    CASE 
        WHEN salary > 12000 THEN 'Yes'
        ELSE 'Not'
    END AS flag
FROM employees
WHERE department = 'IT';

SELECT 
    first_name,
    last_name,
    salary,
    IF(salary > 12000, 'Yes', 'Not') AS flag
FROM employees
WHERE department = 'IT';


-- Вертикальное соединение 
-- UNION/UNION ALL
-- Оператор UNION позволяет обединить две однотипных выборки. 
-- Эти выборки могут быть из разных таблиц или из одной и той же таблицы.

-- select column1, column2, column3 from table1
-- union/union all
-- select column1, column2, column3 from table2

-- select * from table1
-- union/union all
-- select * from table2

CREATE TABLE user_bremen (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(128),
    last_name VARCHAR(128),
    age INT,
    phone VARCHAR(128),
    email VARCHAR(128)
);


CREATE TABLE user_berlin (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(128),
    last_name VARCHAR(128),
    age INT,
    email VARCHAR(128)
);

TRUNCATE TABLE user_bremen;

INSERT INTO user_bremen (first_name, last_name, age, email, phone)
VALUES ('John', 'Smith', 34, 'jsmith@gmail.com', '+1234890765'),
        ('Linda', 'Jonson', 23, 'ljonson@gmail.com', '+37412345676'),
	    ('Barbarra', 'Thomas', 45, 'bthomas@gmail.com', '+13427774568'),
	    ('Ben', 'King', 54, 'bking@gmail.com', '+1009456888'),
	    ('Lucas', 'Jameson', 36, 'lujameson@gmail.com', '+1789098567');

INSERT INTO user_berlin (first_name, last_name, age, email)
VALUES ('Carol', 'Robson', 35, 'crobson@gmail.com'),
		('Bob', 'Brown', 54, 'bbrown@gmail.com'),
        ('Barbarra', 'Thomas', 45, 'bthomas@gmail.com'),
        ('Mellissa', 'Wans', 20, 'mwans@gmail.com'),
        ('Laura', 'Smith', 34, 'lsmith@gmail.com');

SELECT * FROM user_berlin;
SELECT * FROM user_bremen;

SELECT * FROM user_berlin
 union
SELECT * FROM user_bremen;
-- Error Code: 1222. The used SELECT statements have a different number of columns

SELECT first_name, last_name, age, email
FROM user_bremen 
UNION SELECT first_name, last_name, age, email
FROM user_berlin;

SELECT first_name, last_name, age, email
FROM user_bremen 
UNION ALL SELECT first_name, last_name, age, email
FROM user_berlin;


-- Вывести имена, фамилии, возраст, эл. адресса и телефонные номера пользователей из двух магазинов. 
-- Если телефонный номер не указан, вывести null

SELECT first_name, last_name, age, email, NULL AS phone
FROM user_berlin 
UNION SELECT first_name, last_name, age, email, phone
FROM user_bremen;

-- Плохая практика

select first_name, last_name, age
from user_berlin
union
select first_name, last_name, salary
from employees;

select first_name, age
from user_berlin
union 
select first_name, email
from user_bremen;

select first_name, email
from user_berlin
union 
select first_name, age
from user_bremen;

-- Из таблицы user_berlin вывести пользователей, которым больше 30, соеденить с таблцей user_bremen, 
-- где пользователи которым меньше 30, и добавить  всех сотрудников из employees.
select first_name, last_name, age
from user_berlin
where age > 30
union
select first_name, last_name, age
from user_bremen
where age < 30
union
select first_name, last_name, 0 as age
from employees;

-- Вывести сотрудников из employees которые получают больше 10000 или которые работают в IT
select * from employees
where salary > 10000
union all
select * from employees
where department = 'IT';

select * from employees
where salary > 10000 or department = 'IT';

SELECT first_name, last_name, phone, 'USA' AS tel_number_code
FROM user_bremen
WHERE phone LIKE '+1%'

UNION

SELECT first_name, last_name, phone, 'Armenia' AS tel_number_code
FROM user_bremen
WHERE phone LIKE '+374%';

SELECT first_name, last_name, phone,
    CASE
        WHEN phone LIKE '+1%' THEN 'USA'
        WHEN phone LIKE '+374%' THEN 'Armenia'
        ELSE 'Unknown'
    END AS tel_number_code
FROM user_bremen;

-- 1. Создать и заполнить таблицы products1 и products2.

create table products1(
	id int primary key,
    name varchar(50),
    quantity int check(quantity > 0 and quantity < 10),
    in_stock char(1) check(in_stock in ('Y', 'N'))
);

create table products2(
	id int primary key,
    name varchar(50),
    quantity int check(quantity > 0 and quantity < 10),
    price int check(price > 0),
    in_stock char(1) check(in_stock in ('Y', 'N'))
);

insert into products1
values (1, 'Велосипед', 2, 'Y'), 
		(2, 'Скейт', 4, 'Y'), 
		(3, 'Самокат', 2, 'Y'), 
		(4, 'Сноуборд', 7, 'N'), 
		(5, 'Санки', 1, 'Y'), 
		(6, 'Коньки', 3, 'N'), 
		(7, 'Ролики', 5, 'Y');

insert into products2 
values (1, 'Тюбинг', 5, 1000, 'Y'), 
		(2, 'Санки', 2, 1500, 'Y'), 
		(3, 'Снегокат', 2, 900, 'Y'), 
		(4, 'Сноуборд', 7, 700, 'N'), 
		(5, 'Клюшка', 8, 300, 'Y'), 
		(6, 'Коньки', 3, 350, 'N'), 
		(7, 'Форма', 9, 450, 'Y');
        

-- 2. Вывести названия товаров из обеих таблиц без дубликатов.
SELECT name FROM products1
UNION
SELECT name FROM products2;

-- 3. Вывести названия товаров из обеих таблиц, включая дубликаты.
SELECT name FROM products1
UNION ALL
SELECT name FROM products2;

-- 4. Объединить данные из двух таблиц, указав price, где это возможно, где нет - указать null.
SELECT id, name, quantity, NULL AS price, in_stock
FROM products1
UNION ALL
SELECT id, name, quantity, price, in_stock
FROM products2;

-- 5. Вывести все товары из обеих таблиц и добавить дополнительное поле source,
-- которое будет содержать 'P1' для товаров из products1 и 'P2' для товаров из products2.
-- Вывести название и source.
SELECT name, 'P1' AS source
FROM products1
UNION ALL
SELECT name, 'P2' AS source
FROM products2;



































































































