CREATE DATABASE learn ; -- create datebase
USE learn; -- work with database "learn" 
-- make a command
CREATE TABLE products (
id integer,
title varchar(128),
price integer,
discount decimal(2,1)
) ; -- create Table with info 
-- description about Table : id - name of line , integer type of line and more 
-- decimal - it is double .
-- varchar - it is String .

-- SELECT - get info from DataBase(will be no changes)  

SELECT -- 
* -- work with Lines 
FROM products  ; -- Name of Table 

select * from products; 

-- INSERT - Give info for DataBase
-- EXAMPLE 
INSERT INTO products(id, title, price, discount) VALUES(1,'bike',5000 , 0.9);
INSERT INTO products(id, title, price, discount) VALUES(2,'skates',1000 , 1.8);
INSERT INTO products(id, title, price, discount) VALUES(3,'motorbike',1500 , 1.9);
INSERT INTO products(id, title, price, discount) VALUES(4,'board',2000 , 1.9);
-- for  training , but i can not this use .
-- TRUNCATE TABLE products; -- delete all DataBase(CAN USE ONLY FOR TEST TABLE)
-- DELETE - It is possible to return the database , but only with DataBase Manager .
-- SET SQL_SAFE_UPDATES = 0 ; -- OFF SAFE MOD  
-- SET SQL_SAFE_UPDATES = 1 ; -- ON SAFE MOD
SELECT 
title,
price 
FROM products;
-- AS - alias - 
SELECT 
title as product_name, -- i can (CHANGE) name of Line , but only for to string .
price
FROM products;

-- Limit -- give LIMIT , wenn working with new , big database 
SELECT 
title as product_name ,
price as total
FROM products
LIMIT 1 ;

-- WHERE - filter .'if'
-- = , < , > , >= ,<= , AND , OR 
SELECT 
*
FROM products 
WHERE price > 1000 ; 

SELECT 
*
FROM products
WHERE title = 'motorbike' ;
-- BETWEEN , NOT BETWEEN - give Range
SELECT 
*
FROM products
WHERE price BETWEEN 1500 and 6000;

SELECT 
*
FROM products
WHERE price NOT BETWEEN 1500 and 6000;

SELECT
*
FROM products
WHERE price > 1000 and discount >= 1.1 ;

SELECT
*
FROM products
WHERE price < 1100 OR discount >= 1.5 ;
-- ------------------------------------------------
-- sort big list 
-- IN , NOT IN 
SELECT 
*
FROM products
WHERE id = 2 or id = 3 or id = 4;

SELECT 
*
FROM products
WHERE id IN (2,3,4);

SELECT 
*
FROM products
WHERE id NOT IN (2,3,4);

/*
SELECT 
Write line name or ' * ' for all
FROM 'nameTable'
WHERE -  GET condition 
LIMIT - GET 'Limit_filter'
*/





