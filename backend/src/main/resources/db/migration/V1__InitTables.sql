 create table student (
    id BIGSERIAL PRIMARY KEY,
    has_scholarship BOOLEAN,
    birthday TIMESTAMP,
    credit_number VARCHAR(20),
    email VARCHAR(64) not null,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    password VARCHAR(20),
    position VARCHAR(32),
    check (position in ('STUDENT','HEADMAN'))
);




