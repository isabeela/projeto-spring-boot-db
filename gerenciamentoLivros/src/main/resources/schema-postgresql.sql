




CREATE TABLE IF NOT EXISTS proximas (
     id     serial PRIMARY KEY,
     livro  varchar(70),
     autor  varchar(50),
     genero varchar (20)
);



CREATE TABLE IF NOT EXISTS listas (
	 id     serial PRIMARY KEY,
     livro  varchar(70),
     autor  varchar(50),
     genero varchar (20),
     site   varchar (300),
     preco  varchar (40)
);

CREATE TABLE IF NOT EXISTS emprestimo (
	 id     serial PRIMARY KEY,
     livro  varchar(70),
     autor  varchar(50),
     genero varchar (20),
     pessoa  varchar (300),
     data  varchar (40)
);


