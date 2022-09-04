USE compartilhamento_amigos;

DROP TABLE filmes IF EXISTS;

CREATE TABLE filmes (
    identificador INT AUTO_INCREMENT PRIMARY KEY,
    título VARCHAR(30) NOT NULL,
    gênero VARCHAR(20),
    tipo VARCHAR(20),
    data_de_lançamento DATE,
    classificação INT,
    duração INT,
    nome_do_diretor VARCHAR(30),
    data_de_criação TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_de_atualização TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);