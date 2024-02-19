CREATE TABLE IF NOT EXISTS tipo_documento (
  id_tipo_documento SERIAL PRIMARY KEY,
  cod_tipo VARCHAR(45) NOT NULL,
  desc_tipo VARCHAR(45) NOT NULL,
  estado INT NOT NULL,
  usua_crea VARCHAR(45),
  date_create TIMESTAMP,
  usua_modif VARCHAR(45),
  date_modif TIMESTAMP,
  usua_delet VARCHAR(45),
  date_delet TIMESTAMP
);

INSERT INTO tipo_documento (cod_tipo, desc_tipo, estado, usua_crea, date_create)
VALUES ('DNI', 'Documento Nacional de Identidad', 1, 'ADMIN', NOW());
INSERT INTO tipo_documento (cod_tipo, desc_tipo, estado, usua_crea, date_create)
VALUES ('CARNETEXT', 'CARNET DE EXTRANJERIA', 1, 'ADMIN', NOW());
INSERT INTO tipo_documento (cod_tipo, desc_tipo, estado, usua_crea, date_create)
VALUES ('PASAPORTE', 'PASAPORTE', 1, 'ADMIN', NOW());

CREATE TABLE IF NOT EXISTS tipo_persona (
  id_tipo_persona SERIAL PRIMARY KEY,
  cod_tipo VARCHAR(45) NOT NULL,
  desc_tipo VARCHAR(45) NOT NULL,
  estado INT NOT NULL,
  usua_crea VARCHAR(45),
  date_create TIMESTAMP,
  usua_modif VARCHAR(45),
  date_modif TIMESTAMP,
  usua_delet VARCHAR(45),
  date_delet TIMESTAMP
);

INSERT INTO tipo_persona (cod_tipo, desc_tipo, estado, usua_crea, date_create)
VALUES ('DOCENTE', 'DOCENTE', 1, 'ADMIN', NOW());
INSERT INTO tipo_persona (cod_tipo, desc_tipo, estado, usua_crea, date_create)
VALUES ('ALUMNO', 'ALUMNO', 1, 'ADMIN', NOW());
INSERT INTO tipo_persona (cod_tipo, desc_tipo, estado, usua_crea, date_create)
VALUES ('ADMINISTRATIVO', 'ADMINISTRATIVO', 1, 'ADMIN', NOW());


CREATE TABLE IF NOT EXISTS persona (
  id_persona SERIAL PRIMARY KEY,
  num_docu VARCHAR(15) NOT NULL,
  nombres VARCHAR(150) NOT NULL,
  ape_pat VARCHAR(150) NOT NULL,
  ape_mat VARCHAR(150) NOT NULL,
  estado INT NOT NULL,
  usua_crea VARCHAR(45),
  date_create TIMESTAMP,
  usua_modif VARCHAR(45),
  date_modif TIMESTAMP,
  usua_delet VARCHAR(45),
  date_delet TIMESTAMP,
  tipo_documento_id INT NOT NULL,
  tipo_persona_id INT NOT NULL,
  FOREIGN KEY (tipo_persona_id) REFERENCES tipo_persona (id_tipo_persona) ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY (tipo_documento_id) REFERENCES tipo_documento (id_tipo_documento) ON DELETE NO ACTION ON UPDATE NO ACTION
);