drop database if exists bank;
create database bank;
use bank;

create table customer(
customer_number int primary key,
fullname varchar(45),
address varchar(45),
email varchar(45),
sdt int
);

create table accounts(
account_number int primary key,
customer_number int,
account_type varchar(45),
`date` date,
balance int,
foreign key (customer_number) references customer (customer_number)
);

create table transactions(
tran_number int primary key,
account_number int,
`date` date,
amounts int,
descriptions varchar(45),
foreign key (account_number) references accounts (account_number)
);

