USE compartilhamento_amigos;

DROP TABLE IF EXISTS filmes;

CREATE TABLE filmes (
    identificador INT AUTO_INCREMENT PRIMARY KEY,
    título VARCHAR(30) NOT NULL,
    gênero VARCHAR(20),
    nome_do_diretor VARCHAR(30),
    data_de_criação TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_de_atualização TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);