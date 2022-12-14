USE compartilhamento_amigos;

DROP TABLE IF EXISTS programas;

CREATE TABLE programas (
    identificador INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(30) NOT NULL,
    genero INT NOT NULL,
    diretor VARCHAR(30),
    data_de_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_de_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);