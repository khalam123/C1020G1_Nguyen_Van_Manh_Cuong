-- task 2
select * from nhan_vien
where (substring_index(ho_ten, ' ', -1) like 'H%' or substring_index(ho_ten,' ',-1) like'T%' or substring_index(ho_ten,' ',-1)  like 'K%') and length(ho_ten) <=15 ;
-- task 3
select * from khach_hang
where dia_chi = 'da nang' or dia_chi = 'quang tri' and
 round(datediff(curdate(), ngay_sinh) / 365, 0) between 18 and 50;
-- task 4
select khach_hang.*, count(hop_dong.id_khach_hang) as so_lan_dat_phong from khach_hang
join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join loai_khach on khach_hang.id_loai_khach_hang = loai_khach.id_loai_khach_hang
where loai_khach.ten_loai_khach like 'diamond'
group by khach_hang.id_khach_hang;
-- task 5
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


-- task 9
-- task 10
-- task 11
-- task 12
-- task 13
-- task 14
-- task 15
-- task 16
-- task 17
-- task 18
-- task 19
-- task 20

 