package com.java.jpa.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Table(name="student")
@Entity
@Data
public class PhieuNhap {

	private int ma;
	private Date ngayLap;
	private NhaCC nhaCC;
	private List<MatHang> danhSachNhap;
	private float tongTien;
	private boolean thanhToan;
	private int nhaCCMa;

}