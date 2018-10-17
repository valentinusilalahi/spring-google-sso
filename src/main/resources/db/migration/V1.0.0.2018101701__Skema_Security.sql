CREATE TABLE s_permission (
	id VARCHAR(255) NOT NULL,
	permission_label VARCHAR(255) NOT NULL,
	permission_value VARCHAR(255) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (permission_label)
);

CREATE TABLE s_role_permission (
  id_role       VARCHAR(255) NOT NULL,
  id_permission VARCHAR(255) NOT NULL,
  PRIMARY KEY (id_role, id_permission),
  FOREIGN KEY (id_permission) REFERENCES s_permission (id),
  FOREIGN KEY (id_role) REFERENCES s_role (id)
);

CREATE TABLE role (
	id VARCHAR(255) NOT NULL,
	description VARCHAR(255) DEFAULT NULL,
	name VARCHAR(255) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (name)
);

CREATE TABLE s_user (
  id VARCHAR (36),
  username VARCHAR (100) NOT NULL,
  id_role VARCHAR (36) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_role) REFERENCES s_role(id),
  UNIQUE (username)
);

CREATE TABLE s_user_password (
	id_user VARCHAR(36) NOT NULL,
	password VARCHAR(255) NOT NULL,
	PRIMARY KEY (id_user),
	FOREIGN KEY (id_user) REFERENCES s_user (id)
);