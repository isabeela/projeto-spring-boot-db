CREATE TABLE IF NOT EXISTS lista (
     id serial PRIMARY KEY,
     livro  varchar(30),
     autor  varchar(30),
     site   varchar (70),
     preco  varchar (40)
);



CREATE TABLE IF NOT EXISTS proximas (
     id     serial PRIMARY KEY,
     livro  varchar(70),
     autor  varchar(50),
     genero_livro genero
);