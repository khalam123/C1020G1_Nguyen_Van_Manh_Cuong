create database bai2_tao_csdl;
use bai2_tao_csdl;
-- tạo bảng và sử dụng từ khoái default
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

-- xoá bảng
DROP TABLE customers;
-- chỉnh sửa bảng
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id;
--  sửa kiểu dữ liệu của cột
    ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  
-- xoá cột 
ALTER TABLE contacts
  DROP COLUMN contact_type;
  
-- đổi tên cột
ALTER TABLE contacts
  CHANGE COLUMN contact_type ctype
    varchar(20) NOT NULL;
    
-- đổi tên bảng
ALTER TABLE contacts
  RENAME TO people;