
    create table tb_palpites (
       id bigint not null auto_increment,
        id_participante bigint,
        id_time bigint,
        primary key (id)
    ) engine=InnoDB;

    create table tb_participante (
       id bigint not null auto_increment,
        email varchar(255),
        idade varchar(255),
        idioma varchar(255),
        nome varchar(255),
        palpite_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table tb_time (
       id bigint not null auto_increment,
        grupo varchar(255),
        img varchar(255),
        nome_palpite varchar(255),
        primary key (id)
    ) engine=InnoDB;

    alter table tb_palpites 
       add constraint FKqgkll0kg1qp7qn19tucvkhasc 
       foreign key (id_participante) 
       references tb_participante (id);

    alter table tb_palpites 
       add constraint FK5konpqwealo2e3qhwvoxeypoa 
       foreign key (id_time) 
       references tb_time (id);

    alter table tb_participante 
       add constraint FKbhx2u6n7l7ie8dyu8uygkb23w 
       foreign key (palpite_id) 
       references tb_palpites (id);
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES ('imagem', 'flamengo','A');
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES	('imagem','Catar','A');
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES	('imagem','Equador','A');
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES	('imagem','Senegal','A');
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES	('imagem','França','D');
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES	('imagem', 'Tunísia','D');
INSERT INTO tb_time (img,nome_palpite,grupo) VALUES	('imagem', 'Dinamarca','D');
INSERT INTO tb_participante (email,idade,idioma,nome) VALUES ('joão@gmail.com' , '25', 'PortuguesBrasileiro' , 'João');
INSERT INTO tb_participante (email,idade,idioma,nome) VALUES ('joão@gmail.com' , '20', 'Espanhol' , 'João');
INSERT INTO tb_palpites (id_participante, id_time) VALUES(1,1);
INSERT INTO tb_palpites (id_participante, id_time) VALUES(2,1);
