package com.java.jpa.dao;

import com.java.jpa.entity.NhanVien;

public interface NhanVienRepository {
	NhanVien findById(long id);
}
