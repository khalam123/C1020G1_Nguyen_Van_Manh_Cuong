package com.example.demo.repository;

import com.example.demo.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GiaoDichRepository extends JpaRepository<GiaoDich, Integer> {
    @Query(value = "select * " +
            "from GiaoDich g " +
            "where concat(g.maGiaoDich,g.ngayGiaoDich,c.loaiDV) like %?1%",
            nativeQuery = true)
    Page<GiaoDich> findAllInputText(String keyword, Pageable pageable);
}
