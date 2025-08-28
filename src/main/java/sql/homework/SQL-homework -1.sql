-- Таблица students:

CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128) NOT NULL,
    age INT,
    grade VARCHAR(10),
    city VARCHAR(128)
);

INSERT INTO students(first_name, last_name, age, grade, city) VALUES
("Anna", "Petrova", 20, "A", "Berlin"),
("Ivan", "Sidorov", 22, "B", "Munich"),
("Maria", "Ivanova", 19, "C", "Hamburg"),
("Dmitry", "Smirnov", 21, "A", "Berlin"),
("Olga", "Kuznetsova", 23, "B", "Cologne"),
("Nikolay", "Popov", 20, "C", "Frankfurt"),
("Elena", "Volkova", 22, "A", "Berlin"),
("Sergey", "Morozov", 19, "B", "Stuttgart"),
("Irina", "Sokolova", 21, "C", "Dresden"),
("Pavel", "Lebedev", 20, "A", "Leipzig");

-- Задания:

-- 1. Найдите самого старшего студента.
SELECT *
FROM students
ORDER BY age DESC
LIMIT 1;

-- 2. Найдите самого младшего студента.
SELECT *
FROM students
ORDER BY age ASC
LIMIT 1;

-- 3. Выведите первых двух студентов из города Berlin, отсортировав по возрасту.
SELECT *
FROM students
WHERE city = "Berlin"
ORDER BY age ASC
LIMIT 2;

-- 4. Выведите трёх студентов, которым больше 20 лет, но пропустите первых двух из списка.
SELECT *
FROM students
WHERE age > 20
LIMIT 2, 3;

-- 5. Выведите список уникальных городов, в которых живут студенты.
SELECT DISTINCT city
FROM students;

-- 6. Выведите имена и фамилии студентов, отсортировав их по возрасту по возрастанию.
SELECT first_name, last_name
FROM students 
ORDER BY age ASC;

-- 7. Выведите студентов с оценкой "A", отсортировав по фамилии.
SELECT *
FROM students 
WHERE grade = "A"
ORDER BY last_name ASC;

-- 8. Выведите студентов младше 21 года, отсортировав их по имени по алфавиту.
SELECT *
FROM students 
WHERE age < 21
ORDER BY first_name ASC;

-- 9. Измените фамилию студента Maria Ivanova на Petrova.
SET sql_safe_updates = 0;

UPDATE students
SET first_name = "Maria", last_name = "Ivanova"
WHERE first_name = "Maria" AND last_name = "Petova";

-- 10. Всем студентам из города Berlin увеличьте возраст на 1 год.
UPDATE students
SET  age = age + 1
WHERE city = "Berlin";

-- 11. Переведите студента Ivan Sidorov в группу с оценкой "A".
UPDATE students
SET grade = 'A'
WHERE first_name = 'Ivan'
  AND last_name = 'Sidorov';

-- 12. Всем студентам с оценкой "C" измените оценку на "B".
UPDATE students
SET grade = 'B'
WHERE grade = 'C';

-- 13. Удалите студента Pavel Lebedev.
DELETE FROM students
WHERE first_name = 'Pavel' AND last_name = 'Lebedev';

-- 14. Удалите всех студентов из города Hamburg.
DELETE FROM students
WHERE city = 'Hamburg';

-- 15. Очистите таблицу students.
TRUNCATE TABLE students;



