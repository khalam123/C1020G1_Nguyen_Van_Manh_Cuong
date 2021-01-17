-- task 2
select * from nhan_vien
where (substring_index(ho_ten, ' ', -1) like 'H%' or substring_index(ho_ten,' ',-1) like'T%' or substring_index(ho_ten,' ',-1)  like 'K%') and length(ho_ten) <=15 ;
-- task 3
select * from khach_hang
where dia_chi = 'da nang' or dia_chi = 'quang tri' and
 round(datediff(curdate(), ngay_sinh) / 365, 0) between 18 and 50;
-- task 4
select 
	khach_hang.*, 
    count(hop_dong.id_khach_hang) as so_lan_dat_phong 
from khach_hang
join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join loai_khach on khach_hang.id_loai_khach_hang = loai_khach.id_loai_khach_hang
where loai_khach.ten_loai_khach like 'diamond'
group by khach_hang.id_khach_hang;
-- task 5
create view thong_ke as
select 
    khach_hang.id_khach_hang,
    khach_hang.ho_va_ten,
    loai_khach.ten_loai_khach,
    hop_dong.id_hop_dong,
    dich_vu.ten_dich_vu,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    (dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) as tong_tien
from
    khach_hang
        left join loai_khach on khach_hang.id_loai_khach_hang = loai_khach.id_loai_khach_hang
        left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
        left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
        left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
        left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem;
	
-- task 6
select 
	dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
from dich_vu
 join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where not exists (
select hop_dong.id_dich_vu from hop_dong where (hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-03-31')
 and hop_dong.id_dich_vu = dich_vu.id_dich_vu );
 
-- task 7
select 
	dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
from dich_vu
 join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where exists(
	select hop_dong.id_dich_vu from hop_dong where (hop_dong.ngay_lam_hop_dong between '2018-01-01' and '2018-12-31')
    and hop_dong.id_dich_vu = dich_vu.id_dich_vu);
    
-- task 8
	-- cach 1:
select *
from khach_hang
group by ho_va_ten;
	-- cach 2
select distinct khach_hang.ho_va_ten from khach_hang;
	-- cach 3
select ho_va_ten
from khach_hang
union
select ho_va_ten
from khach_hang;


-- task 9	
select month(hop_dong.ngay_lam_hop_dong), count(month(hop_dong.ngay_lam_hop_dong)) as 'so_lan_dat_phong'
from hop_dong
where year(hop_dong.ngay_lam_hop_dong)= '2019'
group by 'month';

-- task 10
select 
	hop_dong.id_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    hop_dong.tien_dat_coc, 
    count(hop_dong_chi_tiet.id_hop_dong) as 'so_luong_dich_vu_di_kem'
from hop_dong
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by hop_dong_chi_tiet.id_hop_dong;

-- task 11

select 
	dich_vu_di_kem.*
from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join loai_khach on khach_hang.id_loai_khach_hang = loai_khach.id_loai_khach_hang
where 
	loai_khach.ten_loai_khach = 'Diamond' and (khach_hang.dia_chi = 'Vinh' or khach_hang.dia_chi ='Quang Ngai');

-- task 12
select 
	hop_dong.id_hop_dong,
    hop_dong.tien_dat_coc,
    nhan_vien.ho_ten as ten_nhan_vien,
    khach_hang.ho_va_ten as ten_khach_hang,
    khach_hang.so_dien_thoai,
    dich_vu.ten_dich_vu,
    count(hop_dong_chi_tiet.id_dich_vu_di_kem) as 'so_luong_dich_vu_di_kem'
from hop_dong
join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong	
where not exists(select hop_dong.id_hop_dong where month(hop_dong.ngay_lam_hop_dong) between 01 and 06)
and exists (select hop_dong.id_hop_dong where month(hop_dong.ngay_lam_hop_dong) between 10 and 12);

-- task 13

create temporary table temp
select dich_vu_di_kem.ten_dich_vu_di_kem as ten_dich_vu_di_kem, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
from hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem;
select * from temp;
create temporary table temp1
select max(temp.so_lan_su_dung) as max_so_lan_su_dung from temp;
select * from temp1;

select temp.ten_dich_vu_di_kem, temp.so_lan_su_dung from temp
join temp1 on temp.so_lan_su_dung = temp1.max_so_lan_su_dung;

drop temporary table temp;
drop temporary table temp1;

-- task 14

select 
	hop_dong.id_hop_dong, 
    loai_dich_vu.ten_loai_dich_vu,
    dich_vu_di_kem.ten_dich_vu_di_kem,
    count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
from hop_dong
 join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
 join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
 join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
 join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
 group by dich_vu_di_kem.ten_dich_vu_di_kem having so_lan_su_dung = 1;
 
-- task 15

select 
	nhan_vien.id_nhan_vien,
    nhan_vien.ho_ten, 
    nhan_vien.sdt, 
    nhan_vien.dia_chi, 
    trinh_do.trinh_do,
    bo_phan.ten_bo_phan,
    count(hop_dong.id_nhan_vien) as so_lan_tao_hop_dong
from nhan_vien
 join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
 join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
 join hop_dong on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
where hop_dong.ngay_lam_hop_dong between '2018-01-01' and 2019-12-31
group by nhan_vien.ho_ten
having so_lan_tao_hop_dong;
    
-- task 16
delete from nhan_vien where nhan_vien.id_nhan_vien not in(
select id_nhan_vien from 
(
select distinct hop_dong.id_nhan_vien
from hop_dong
 join nhan_vien on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien 
 where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019) as tmp);

-- task 17

update khach_hang
set khach_hang.id_loai_khach_hang = 4001
where khach_hang.id_khach_hang in (
	select tk.id_khach_hang
    from thong_ke tk
    where tk.ten_loai_khach = 'Platinium' and tk.tong_tien > (10000000 / 25000)
);
drop view if exists thong_ke;
-- task 18

delete from khach_hang where exists(
select hop_dong.id_hop_dong
from hop_dong
where (year(hop_dong.ngay_lam_hop_dong) < 2016) and hop_dong.id_khach_hang = khach_hang.id_khach_hang);

-- task 19

update dich_vu_di_kem
set gia = gia * 2
where id_dich_vu_di_kem in (
	select id_dich_vu_di_kem
    from thong_ke tk
    group by tk.id_dich_vu_di_kem
    having sum(tk.so_luong) > 10
);
drop view if exists thong_ke;
-- task 20

select 
	id_nhan_vien as 'id',
    ho_ten,
    email,
    sdt,
    ngay_sinh,	
    dia_chi
from nhan_vien
union all
select
	id_khach_hang,
    ho_va_ten ,
    email ,
    so_dien_thoai,
    ngay_sinh,
    dia_chi
from khach_hang;

-- task 21

create view v_nhan_vien as
select nhan_vien.*
from nhan_vien
join hop_dong on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
where nhan_vien.dia_chi = 'Hai Chau' and hop_dong.ngay_lam_hop_dong = '2019-12-12';

-- task 22
-- create view v_nhan_vien_1 as
-- select dia_chi
-- from v_nhan_vien
-- where 
update v_nhan_vien set dia_chi = 'Lien Chieu';

-- task 23

delimiter //
create procedure sp_1(id_khach_hang int)
begin
delete from khach_hang where khach_hang.id_khach_hang = id_khach_hang;
end;
// delimiter ;
call sp_1 (7009);

-- task 24


 