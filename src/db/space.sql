CREATE TABLE space (
   id INT PRIMARY KEY SERIAL DEFAULT VALUE,
   disk_quotamb INT ,
   memory_quotamb BOOLEAN NOT NULL,
   name VARCHAR(255)
);
