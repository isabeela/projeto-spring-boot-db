CREATE TABLE IF NOT EXISTS lista (
     id serial PRIMARY KEY,
     livro  varchar(30),
     autor  varchar(30),
     site   varchar (70),
     preco  varchar (40)
);


CREATE TYPE genero AS ENUM('Aventura', 'Auto-Ajuda', 'Biografia', 'Conto',
'Didático/Educaional', 'Distopia', 'Drama', 'Fantasia', 'Ficção', 'Poema/Poesia', 
'Policial', 'Romance', 'Suspense', 'Terror');

CREATE TABLE IF NOT EXISTS proximas (
     id     serial PRIMARY KEY,
     livro  varchar(70),
     autor  varchar(50),
     genero_livro genero
);