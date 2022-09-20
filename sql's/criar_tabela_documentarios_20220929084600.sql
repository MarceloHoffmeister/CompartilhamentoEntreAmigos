USE compartilhamento_amigos;

DROP TABLE IF EXISTS documentarios;

CREATE TABLE documentarios (
    programa_id INT NOT NULL,
    valor INT NOT NULL,
    propriedade_intelectual BOOLEAN NOT NULL,
    data_de_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_de_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (programa_id) REFERENCES programas(identificador)
);