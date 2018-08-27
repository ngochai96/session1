package com.java.jpa.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Table(name="student")
@Entity
@Data
public class HoaDonNhapHang {

	private int ma;
	private PhieuNhap phieuNhap;
	private NhanVien nhanVien;
	private Date ngayTra;
	private float tienTra;
	private String chuThich;
	private int nhanVienNguoiID;
	private int phieuNhapMa;

}