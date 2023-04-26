-- usuarios--
INSERT INTO `kita`.`usuarios` (`nombre`, `nombre_usuario`, `contrasenia`, `rol`, `telefono`, `email`) VALUES ('Pedro Alcantara Cid', 'pedroalcantara', '123456', 'padre', '675675675', 'pedroalcantara@gmail.com');
INSERT INTO `kita`.`usuarios` (`nombre`, `nombre_usuario`, `contrasenia`, `rol`, `telefono`, `email`) VALUES ('Maria Aceves Claro', 'mariaaceves', '123456', 'profesor', '745745745', 'mariaaceves@gmail.com');
INSERT INTO `kita`.`usuarios` (`nombre`, `nombre_usuario`, `contrasenia`, `rol`, `telefono`, `email`) VALUES ('Laura Daza Machado', 'lauradaza', '123456', 'director', '678543234', 'lauradaza@outlook.com');
INSERT INTO `kita`.`usuarios` (`nombre`, `nombre_usuario`, `contrasenia`, `rol`, `telefono`, `email`) VALUES ('Juan Pelaez Rivas', 'juanpelaez', '123456', 'profesor_admin', '785982321', 'juanpelaez@hotmail.com');
-- grupos --
INSERT INTO `kita`.`grupos` (`nombre`) VALUES ('Azul');
INSERT INTO `kita`.`grupos` (`nombre`) VALUES ('Rojo');
INSERT INTO `kita`.`grupos` (`nombre`) VALUES ('Verde');
INSERT INTO `kita`.`grupos` (`nombre`) VALUES ('Amarillo');
-- profesor --
INSERT INTO `kita`.`profesores` (`dni`, `fecha_alta`, `fecha_nac`, `nombre_grupo`, `usuarios_id_prof`) VALUES ('45367254G', '2018-03-23', '1986-03-24', 'Verde', '12');
INSERT INTO `kita`.`profesores` (`dni`, `fecha_alta`, `fecha_nac`, `nombre_grupo`, `usuarios_id_prof`) VALUES ('35276534D', '2019-06-20', '1982-05-17', 'Rojo', '14');
-- alumno --
INSERT INTO `kita`.`alumnos` (`nombre`, `alergias`, `auto_salidas`, `auto_fotos`, `comedor`, `fecha_nac`, `nombre_grupo`) VALUES ('Juan Perez Soler', 'Lactosa', '0', '1', '1', '2020-07-12', 'Verde');
INSERT INTO `kita`.`alumnos` (`nombre`, `auto_salidas`, `auto_fotos`, `comedor`, `fecha_nac`, `nombre_grupo`) VALUES ('Maria Ponce Rodriguez', '1', '1', '1', '2020-04-24', 'Rojo');
INSERT INTO `kita`.`alumnos` (`nombre`, `observaciones`, `auto_salidas`, `auto_fotos`, `comedor`, `fecha_nac`, `nombre_grupo`) VALUES ('Luis Romero Abad', 'Duerme poco', '0', '0', '1', '2019-05-15', 'Amarillo');
INSERT INTO `kita`.`alumnos` (`nombre`, `alergias`, `auto_salidas`, `auto_fotos`, `comedor`, `fecha_nac`, `nombre_grupo`) VALUES ('Elena Abril Chico', 'Paracetamol', '1', '0', '0', '2019-02-05', 'Azul');
-- padres --
INSERT INTO `kita`.`padres` (`alumno_id`, `usuarios_id_pad`) VALUES ('6', '11');
-- comedor --
INSERT INTO `kita`.`comedor` (`fecha`, `snack`, `desayuno`, `plato_principal`, `postre`) VALUES ('2022-12-05', 'Fruta', 'Cereales con leche, fruta', 'Macarrones con tomate', 'Yogur');
-- calendario --
INSERT INTO `kita`.`calendario` (`dia_id`, `evento`) VALUES ('2022-05-12', 'Visita del belén del ayuntamiento');
-- información --
INSERT INTO `kita`.`informacion` (`informacion`) VALUES ('Brote de mano, boca, pie');
-- informes --
INSERT INTO `kita`.`informes` (`alumno_id_inf`, `deposicion`, `suenio`, `comida`, `bebida`, `fecha`) VALUES ('5', '1', '00:30', '1', '1', '2022-05-12');