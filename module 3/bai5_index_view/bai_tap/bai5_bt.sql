drop database if exists demo;
create database demo;
use demo;
create table products(
	id int primary key auto_increment,
    product_code int,
    product_name varchar(45),
    product_price double,
    product_amount int,
    product_description varchar(45),
    product_status varchar(45)
);

create unique index idx_pro_code on products(product_code);

explain select *
from products
where product_code = 'abc';

create index idx_name_price on products(product_name, product_price);

create view view_products
as
select products.product_code, products.product_name, products.product_price, products.product_status
from products;

select * from view_products;

insert into view_products(product_code, product_name, product_price, product_status)
values(2,'cdf',20,'not ok');

drop view view_products;

delimiter //
CREATE PROCEDURE get_product ()
	BEGIN
		select products.*
        from products;
   	END;
    // delimiter ;
    
call get_product;

delimiter // 
create procedure insert_product (product_code int, product_name varchar(45), product_price double,product_amount int, product_description varchar(45), product_status varchar(45))
	begin
		insert into products(product_code,
            product_name,
            product_price,
            product_amount,
            product_description,
            product_status)
        values(
			product_code,
            product_name,
            product_price,
            product_amount,
            product_description,
            product_status
        );
	end;
// delimiter ;

call insert_product (3,'acb',25,5,'ok','ok');

delimiter //
create procedure update_product(id int,product_code int, product_name varchar(45), product_price double,product_amount int, product_description varchar(45), product_status varchar(45))
	begin
		update products set 
			product_code = product_code,
            product_name = product_name,
            product_price = product_price,
            product_amount = product_amount,
            product_description = product_description,
            product_status = product_status
        where products.id = id;
    end;
// delimiter ;
call update_product(2,4,'ack',25,5,'ok','ok');

delimiter //
create procedure delete_product(id int)
	begin
		delete from products where products.id = id;
	end ;
// delimiter ;

call delete_product(3);
