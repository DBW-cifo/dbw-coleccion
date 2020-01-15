create database coleccion; use coleccion;
create table euros (
idmoneda INT AUTO_INCREMENT PRIMARY KEY,
valor_nominal decimal(10,2) DEFAULT NULL,
pais varchar(3) DEFAULT NULL,
año varchar(4) DEFAULT NULL,
ceca varchar(1) DEFAULT NULL,
existe varchar(1) DEFAULT NULL,
tengo varchar(1) DEFAULT NULL,
valor_mercado decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB;

create table filatelias (
idfilatelia INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
direccion VARCHAR(40) NOT NULL
) ENGINE=InnoDB;

create table euros_filatelias (
ideuros_filatelia int auto_increment primary key, 
idmoneda int DEFAULT NULL,
idfilatelia int DEFAULT NULL,
precio_filatelia decimal(10,2) not null
)ENGINE=InnoDB;

alter table euros_filatelias add FOREIGN KEY fk_moneda (idmoneda) REFERENCES euros(idmoneda) ON DELETE restrict
ON UPDATE cascade;
alter table euros_filatelias add FOREIGN KEY fk_filatelia (idfilatelia) REFERENCES filatelias(idfilatelia) ON DELETE restrict
ON UPDATE cascade;

insert into euros (valor_nominal,
				   pais,
                   año,
                   ceca,
                   existe,
                   tengo,
                   valor_mercado)
            values (0.01,"ESP","1999","E","S","S",10.0),
				   (1.0,"CHI","2000"," ","N","N",12.0);

insert into filatelias (nombre,
                        direccion) 
				values ("FILA1","plaza"),
			           ("FILA2","calle");
                   
insert into euros_filatelias (
							idmoneda,
                            idfilatelia,
                            precio_filatelia)
			                values (1,1,20),
                                   (2,2,30);
                   
select filatelias.nombre filatelias, euros.valor_nominal euros, precio_filatelia from filatelias
join euros_filatelias on filatelias.idfilatelia=euros_filatelias.idfilatelia
join euros_filatelias on euros.idmoneda        =euros_filatelias.idmoneda;