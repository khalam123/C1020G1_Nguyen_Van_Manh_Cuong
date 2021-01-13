-- câu lệnh hiện thị tất cả các dòng có tên là Huong
select *
from sinh_vien
where ten = 'Huong';
-- câu lệnh lấy ra tổng số tiền của Huong
select ten, sum(so_tien)
from sinh_vien
where ten = 'Huong';
-- câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp
select distinct sinh_vien.ten
from sinh_vien;