CREATE TABLE professeurs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cin VARCHAR(10) NOT NULL UNIQUE,
    nom VARCHAR(30) NOT NULL,
    prenom VARCHAR(30) NOT NULL,
    email VARCHAR(50),
    telephone VARCHAR(14),
    departement VARCHAR(30)
);
