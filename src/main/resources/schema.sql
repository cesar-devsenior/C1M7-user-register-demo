create table users (
    username varchar(20),
    password varchar(32) not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(150) not null,
    phone varchar(15),
    city varchar(100),
    hire_date timestamp not null,
    constraint users_pk primary key (username)
);