-- Создание таблицы водителей
CREATE TABLE drivers (
    id SERIAL PRIMARY KEY, -- Уникальный идентификатор
    first_name VARCHAR(100) NOT NULL, -- Имя
    last_name VARCHAR(100) NOT NULL, -- Фамилия
    date_of_birth DATE NOT NULL, -- Дата рождения
    gender VARCHAR(10), -- Пол
    nationality VARCHAR(50), -- Гражданство
    photo TEXT, -- Фото (опционально)
    phone VARCHAR(20) NOT NULL, -- Номер телефона
    email VARCHAR(100), -- Электронная почта
    address TEXT, -- Адрес проживания
    passport_number VARCHAR(50), -- Номер паспорта
    passport_expiry_date DATE, -- Дата истечения паспорта
    driver_license_number VARCHAR(50) NOT NULL, -- Номер водительских прав
    driver_license_expiry_date DATE NOT NULL, -- Срок действия водительских прав
    adr_certificate BOOLEAN DEFAULT FALSE, -- Сертификат ADR (да/нет)
    adr_certificate_expiry_date DATE, -- Срок действия ADR
    work_permit BOOLEAN DEFAULT FALSE, -- Разрешение на работу (да/нет)
    visa_status VARCHAR(50), -- Статус визы
    visa_expiry_date DATE, -- Срок действия визы
    employment_date DATE NOT NULL, -- Дата начала работы
    employment_type VARCHAR(50), -- Тип занятости
    position VARCHAR(50), -- Должность
    status VARCHAR(50), -- Статус (например, "активен")
    current_location TEXT, -- Текущее местоположение
    current_shift_start DATE, -- Дата начала текущей каденции
    current_shift_end DATE, -- Дата окончания текущей каденции
    assigned_route_id INT, -- Привязанный маршрут
    total_days_in_field INT DEFAULT 0, -- Общее количество дней в рейсах
    incidents_count INT DEFAULT 0, -- Количество инцидентов
    last_incident_date DATE, -- Дата последнего инцидента
    penalties DECIMAL(10, 2) DEFAULT 0, -- Общая сумма штрафов
    total_kilometers_driven DECIMAL(10, 2) DEFAULT 0, -- Общие километры
    total_routes_completed INT DEFAULT 0, -- Количество маршрутов
    efficiency_rating DECIMAL(5, 2), -- Рейтинг эффективности
    medical_certificate_expiry_date DATE, -- Срок действия медицинской справки
    health_restrictions TEXT, -- Ограничения по здоровью
    notes TEXT -- Заметки
);

-- Создание таблицы инцидентов
CREATE TABLE incidents (
    id SERIAL PRIMARY KEY, -- Уникальный идентификатор инцидента
    driver_id INT NOT NULL, -- ID водителя
    date DATE NOT NULL, -- Дата инцидента
    type VARCHAR(50) NOT NULL, -- Тип инцидента
    description TEXT, -- Описание инцидента
    penalty_amount DECIMAL(10, 2), -- Сумма штрафа
    FOREIGN KEY (driver_id) REFERENCES drivers(id) ON DELETE CASCADE
);

-- Создание таблицы документов
CREATE TABLE documents (
    id SERIAL PRIMARY KEY, -- Уникальный идентификатор документа
    driver_id INT NOT NULL, -- ID водителя
    type VARCHAR(50) NOT NULL, -- Тип документа
    expiry_date DATE, -- Дата истечения срока
    file_path TEXT, -- Ссылка на файл
    FOREIGN KEY (driver_id) REFERENCES drivers(id) ON DELETE CASCADE
);

-- Создание таблицы маршрутов
CREATE TABLE routes (
    id SERIAL PRIMARY KEY, -- Уникальный идентификатор маршрута
    start_point TEXT NOT NULL, -- Начальная точка
    end_point TEXT NOT NULL, -- Конечная точка
    date DATE NOT NULL, -- Дата маршрута
    driver_id INT NOT NULL, -- Привязанный водитель
    vehicle_id INT NOT NULL, -- Привязанный автомобиль (дополнительная таблица vehicles)
    order_id INT, -- Привязанный заказ
    FOREIGN KEY (driver_id) REFERENCES drivers(id) ON DELETE SET NULL,
    FOREIGN KEY (vehicle_id) REFERENCES vehicles(id) ON DELETE SET NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE SET NULL
);

-- Создание таблицы автомобилей
CREATE TABLE vehicles (
    id SERIAL PRIMARY KEY, -- Уникальный идентификатор
    registration_number VARCHAR(50) NOT NULL, -- Регистрационный номер
    make VARCHAR(50), -- Марка автомобиля
    model VARCHAR(50), -- Модель
    status VARCHAR(50), -- Текущий статус
    current_location TEXT -- Текущее местоположение
);

-- Создание таблицы заказов
CREATE TABLE orders (
    id SERIAL PRIMARY KEY, -- Уникальный идентификатор заказа
    customer VARCHAR(100) NOT NULL, -- Заказчик
    cargo_description TEXT, -- Описание груза
    weight DECIMAL(10, 2), -- Вес груза
    pickup_location TEXT, -- Место забора груза
    delivery_location TEXT, -- Место доставки
    deadline DATE, -- Срок доставки
    status VARCHAR(50) -- Статус заказа
);

-- Таблица водителей
CREATE TABLE drivers (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    date_of_birth DATE,
    gender VARCHAR(10),
    nationality VARCHAR(50),
    phone VARCHAR(20),
    email VARCHAR(100)
);

-- Таблица маршрутов
CREATE TABLE routes (
    id SERIAL PRIMARY KEY,
    start_point TEXT,
    end_point TEXT,
    date DATE,
    driver_id INT,
    vehicle_id INT,
    FOREIGN KEY (driver_id) REFERENCES drivers(id)
);

-- Таблица инцидентов
CREATE TABLE incidents (
    id SERIAL PRIMARY KEY,
    driver_id INT,
    date DATE,
    type VARCHAR(50),
    description TEXT,
    FOREIGN KEY (driver_id) REFERENCES drivers(id)
);

