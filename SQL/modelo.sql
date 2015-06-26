START TRANSACTION WITH CONSISTENT SNAPSHOT;

DROP TABLE IF EXISTS personas CASCADE;
DROP TABLE IF EXISTS comunas CASCADE;
DROP TABLE IF EXISTS provincias CASCADE;
DROP TABLE IF EXISTS regiones CASCADE;


--
-- Name: regiones
--
CREATE TABLE regiones (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255) NOT NULL,
    corfo varchar(255) NOT NULL,
    codigo varchar(5) NOT NULL,
    numero int NOT NULL,
    UNIQUE (nombre),
    UNIQUE (codigo),
    UNIQUE (numero),
    PRIMARY KEY (id)
);


--
-- Name: provincias
--
CREATE TABLE provincias (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255) NOT NULL,
    region_id int NOT NULL,
    FOREIGN KEY (region_id) REFERENCES regiones(id) ON UPDATE CASCADE ON DELETE CASCADE,
    UNIQUE (nombre, region_id),
    PRIMARY KEY (id)
);


--
-- Name: comunas
--
CREATE TABLE comunas (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255) NOT NULL,
    provincia_id int NOT NULL,
    FOREIGN KEY (provincia_id) REFERENCES provincias(id) ON UPDATE CASCADE ON DELETE CASCADE,
    UNIQUE (nombre, provincia_id),
    PRIMARY KEY (id)
);


--
-- Name: personas
--
CREATE TABLE personas (
    id int NOT NULL,
    nombres varchar(255) NOT NULL,
    apellidos varchar(255) NOT NULL,
    direccion varchar(255) NOT NULL,
    comuna_id int NOT NULL,
    FOREIGN KEY (comuna_id) REFERENCES comunas(id) ON UPDATE CASCADE ON DELETE CASCADE,
    UNIQUE(nombres,apellidos),
    PRIMARY KEY (id)
);



COMMIT;