create database bd_proyecto;

use bd_proyecto;

create table tb_sexo(
	id_sexo int not null primary key auto_increment,
    nom_sexo varchar(200)
);

create table tb_distrito(
	id_distrito int not null primary key auto_increment,
    nom_distrito varchar(100)
);

create table tb_cargo(
	id_cargo int not null primary key auto_increment,
    nom_cargo varchar(30)
); 

create table tb_empleado(
	id_empleado int not null primary key auto_increment,
    nom_empleado varchar(200) not null,
    apl_empleado varchar(200) not null,
    edad_empleado int not null,
    id_sexo int not null,
    dni_empleado varchar(8) not null,
    dir_empleado varchar(20) not null,
    id_distrito int not null,
    id_cargo int not null,
    foreign key(id_sexo) references tb_sexo(id_sexo),
    foreign key(id_distrito) references tb_distrito(id_distrito),
    foreign key(id_cargo) references tb_cargo(id_cargo)
);

create table tb_cliente(
	id_cliente int not null primary key auto_increment,
    noap_cliente varchar(300) not null,
    edad_cliente int not null,
    id_sexo int not null,
    dni_cliente varchar(8) not null,
    dir_cliente varchar(20) not null,
    id_distrito int not null,
    tlf_cliente char(9) not null,
    foreign key(id_sexo) references tb_sexo(id_sexo),
    foreign key(id_distrito) references tb_distrito(id_distrito)
);

create table tb_categoria(
	id_categoria int not null primary key auto_increment,
    nom_categoria varchar(30) not null
);

create table tb_proveedor(
	id_proveedor int not null primary key auto_increment,
    nom_proveedor varchar(40)
);

create table tb_producto (
    id_prod int not null primary key auto_increment,
    nom_prod varchar(30) not null,
    des_prod varchar(200) not null,
    pre_prod decimal(10,2) not null,
    fcr_prod date not null, /*fecha de recibido*/
    fpv_prod date not null, /*fecha de posible venciemiento*/
    cant_prod int not null,
    id_categoria int not null,
    id_proveedor int not null,
    foreign key(id_categoria) references tb_categoria(id_categoria),
	foreign key(id_proveedor) references tb_proveedor(id_proveedor)
);
    

/*registros*/

insert into tb_sexo values(null, 'Masculino'),
						  (null, 'Femenino');
    
insert into tb_distrito values
	(null, 'Breña'),
	(null, 'Ancón'),
	(null, 'Ate'),
	(null, 'Barranco'),
	(null, 'Carabayllo'),
	(null, 'Cercado de Lima'),
	(null, 'Chaclacayo'),
	(null, 'Chorrillos'),
	(null, 'Cieneguilla'),
	(null, 'Comas'),
	(null, 'El Agustino'),
	(null, 'Independencia'),
	(null, 'Jesús María'),
	(null, 'La Molina'),
	(null, 'La Victoria'),
	(null, 'Lince'),
	(null, 'Los Olivos'),
	(null, 'Lurigancho'),
	(null, 'Lurín'),
	(null, 'Magdalena del Mar'),
	(null, 'Miraflores'),
	(null, 'Pachacámac'),
	(null, 'Pucusana'),
	(null, 'Pueblo Libre'),
	(null, 'Puente Piedra'),
	(null, 'Punta Hermosa'),
	(null, 'Punta Negra'),
	(null, 'Rímac'),
	(null, 'San Bartolo'),
	(null, 'San Borja'),
	(null, 'San Isidro'),
	(null, 'San Juan de Lurigancho'),
	(null, 'San Juan de Miraflores'),
	(null, 'San Luis'),
	(null, 'San Martín de Porres'),
	(null, 'San Miguel'),
	(null, 'Santa Anita'),
	(null, 'Santa María del Mar'),
	(null, 'Santa Rosa'),
	(null, 'Santiago de Surco'),
	(null, 'Surquillo'),
	(null, 'Villa El Salvador'),
	(null, 'Villa María del Triunfo');

insert into tb_cargo values(null, 'Administrador'),
						   (null, 'Jefe'),
                           (null, 'Empleado');
    insert into tb_empleado values(null, 'Paula', 'Coral G.', 23, 2, '57578579', 'Surco Zona Pituca', 40 ,2) ;
insert into tb_empleado values(null, 'Francisco Antonio', 'Vargas Donayre', 20, 1, '73338875', 'Av. Venezuela 855', 1, 2),
							  (null, 'Carlos', 'González', 30, 2, '11111111', 'Av. Tacna 123', 2, 1),
							  (null, 'María', 'López', 35, 2, '22222222', 'Calle Arequipa 456', 3, 1),
                              (null, 'Luis', 'Díaz', 25, 1, '75395185', 'Jr. Huancavelica 789', 4, 3),
                              (null, 'Ana', 'Martínez', 28, 1, '46821537', 'Av. La Marina 101', 5, 3),
                              (null, 'Javier', 'Gómez', 22, 2, '15948732', 'Calle Lima 202', 6, 3),
                              (null, 'Elena', 'Ramírez', 26, 2, '62478951', 'Av. Brasil 303', 7, 3),
                              (null, 'Pedro', 'Pérez', 31, 1, '75321469', 'Jr. Puno 404', 8, 3),
                              (null, 'Rosa', 'Hernández', 27, 1, '36987451', 'Av. Grau 505', 9, 3),
                              (null, 'Miguel', 'Torres', 29, 2, '95175382', 'Calle Cuzco 606', 10, 3),
                              (null, 'Karen', 'Sánchez', 24, 2, '58741236', 'Jr. Ica 707', 11, 3);
                              
                              
insert into tb_cliente values
	(null, 'Juan Carlos Gutiérrez', 28, 1, '87654321', 'Av. Abancay 123', 13, '987654321'),
	(null, 'Luz María Rodríguez', 35, 2, '76543210', 'Calle Lima 456', 8, '912345678'),
	(null, 'José Luis Pérez', 22, 1, '98765432', 'Jr. Huancavelica 789', 4, '998877665'),
	(null, 'Karla Gabriela Huamaní', 31, 2, '12345678', 'Av. Tacna 987', 17, '945678321'),
	(null, 'Ricardo Antonio Quispe', 26, 1, '54321678', 'Jr. Ica 567', 11, '976543210'),
	(null, 'Martha Elena Gonzales', 40, 2, '87654321', 'Av. Grau 876', 9, '923456789'),
	(null, 'César Augusto Torres', 27, 1, '23456789', 'Calle Arequipa 234', 5, '934567890'),
	(null, 'Sofía Alejandra Palomino', 33, 2, '65432109', 'Av. Venezuela 345', 1, '955678901'),
	(null, 'Martín Alonso Castillo', 29, 1, '89012345', 'Av. La Marina 678', 6, '933221100'),
	(null, 'Ana Paula Salazar', 24, 2, '56789012', 'Jr. Puno 890', 8, '912345678'),
	(null, 'Pedro Luis Díaz', 37, 1, '10987654', 'Av. Brasil 567', 7, '977654321'),
	(null, 'Karina Isabel Medina', 30, 2, '56789012', 'Av. Grau 123', 10, '966789012'),
	(null, 'Juan Manuel Cárdenas', 25, 1, '21098765', 'Calle Cuzco 456', 14, '945678321'),
	(null, 'Valeria Sofía Jiménez', 28, 2, '43210987', 'Jr. Ica 789', 16, '988776655'),
	(null, 'Carlos Alberto López', 32, 1, '89012345', 'Av. Tacna 234', 12, '923456789'),
	(null, 'Lucía Esther Torres', 26, 2, '56789012', 'Calle Lima 567', 15, '966543210'),
	(null, 'Hugo Antonio Salinas', 29, 1, '54321098', 'Av. Venezuela 678', 3, '955678901'),
	(null, 'Evelyn Vanessa Castro', 23, 2, '87654321', 'Av. La Marina 890', 2, '933221100'),
	(null, 'Jorge Luis Alvarado', 34, 1, '10987654', 'Jr. Puno 123', 19, '977654321'),
	(null, 'Liliana Patricia Rojas', 27, 2, '43210987', 'Av. Grau 456', 20, '988776655');
                              
insert into tb_categoria (nom_categoria) values
('Frutas'),
('Verduras'),
('Carnes'),
('Lácteos'),
('Panadería'),
('Bebidas'),
('Aseo'),
('Cuidado personal'),
('Electrónicos'),
('Hogar');

insert into tb_proveedor (nom_proveedor) values
('Agroindustrias del Sur'), ('Camposol'), ('Danper'),
('Corporación Pesquera Inca'), ('Supertex'), ('Inversiones La Rioja'),
('Gloria'), ('Laive'), ('Pura Vida'),
('Bimbo'), ('Grupo Viz'), ('Molitalia'),
('Inca Kola'), ('Pilsen Callao'), ('Backus'),
('Protisa'), ('Kimberly-Clark'), ('Procter & Gamble'),
('Belcorp'), ('Yanbal'), ('Unique'),
('Inca Power'), ('Hiraoka'), ('Saga Falabella'),
('Saga Falabella'), ('Ripley'), ('Tottus');

insert into tb_producto (nom_prod, des_prod, pre_prod, fcr_prod, fpv_prod, cant_prod, id_categoria, id_proveedor)
values
('Uvas', 'Uvas frescas de la región de Ica', 3.20, '2023-11-17', '2023-11-28', 80, 1, 1),
('Papas', 'Papas amarillas de la sierra peruana', 1.60, '2023-11-17', '2023-11-23', 120, 2, 2),
('Carne de Res', 'Filete de carne de res de primera calidad', 12.50, '2023-11-17', '2023-12-10', 60, 3, 3),
('Yogurt Natural', 'Yogurt natural sin azúcar', 2.80, '2023-11-17', '2023-11-28', 90, 4, 7),
('Pan Francés', 'Pan francés artesanal', 1.75, '2023-11-17', '2023-11-22', 150, 5, 10),
('Cerveza Cusqueña', 'Cerveza artesanal de la región de Cusco', 3.99, '2023-11-17', '2023-12-20', 100, 6, 13),
('Jabón de Tocador', 'Jabón de tocador con fragancia floral', 1.75, '2023-11-17', '2024-01-10', 120, 7, 15),
('Acondicionador', 'Acondicionador para cabello suave y manejable', 4.50, '2023-11-17', '2024-02-01', 50, 8, 16),
('Tablet', 'Tablet de última generación', 800.00, '2023-11-17', '2024-02-15', 15, 9, 19),
('Mesa de Comedor', 'Mesa de comedor moderna y espaciosa', 1200.00, '2023-11-17', '2023-12-31', 8, 10, 23),
('Duraznos', 'Duraznos frescos de la región de Junín', 4.00, '2023-11-17', '2023-11-25', 70, 1, 1),
('Cebollas', 'Cebollas rojas de la región de Huánuco', 2.00, '2023-11-17', '2023-11-20', 100, 2, 2),
('Pescado Fresco', 'Pescado fresco del mar peruano', 9.50, '2023-11-17', '2023-11-29', 40, 3, 4),
('Yogurt de Frutas', 'Yogurt con trozos de frutas', 3.50, '2023-11-17', '2023-11-30', 80, 4, 8),
('Croissants', 'Croissants recién horneados', 2.25, '2023-11-17', '2023-11-22', 120, 5, 11),
('Pisco', 'Pisco peruano de alta calidad', 25.00, '2023-11-17', '2023-12-10', 30, 6, 14),
('Shampoo Anticaspa', 'Shampoo anticaspa para un cuero cabelludo saludable', 6.50, '2023-11-17', '2024-01-05', 60, 8, 17),
('Teléfono Inteligente', 'Teléfono inteligente de última generación', 1000.00, '2023-11-17', '2024-03-01', 12, 9, 20),
('Silla de Oficina', 'Silla ergonómica para oficina', 350.00, '2023-11-17', '2023-12-31', 10, 10, 24),
('Mangos', 'Mangos frescos de la región de Piura', 2.75, '2023-11-17', '2023-11-27', 90, 1, 1),
('Zanahorias', 'Zanahorias frescas de la región de Lambayeque', 1.20, '2023-11-17', '2023-11-24', 130, 2, 2);


  

-- Verificar los registros insertados
select * from tb_cliente;



select * from tb_empleado;