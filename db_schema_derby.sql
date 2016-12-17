CREATE TABLE professeurs (
    id NUMERIC PRIMARY KEY,
    cin VARCHAR(10) NOT NULL UNIQUE,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    email VARCHAR(50),
    telephone VARCHAR(14),
    departement VARCHAR(30)
);


create sequence professeurs_s
start with 100
increment by 1;