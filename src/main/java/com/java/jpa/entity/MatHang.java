package com.java.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Table(name="student")
@Entity
@Data
public class MatHang {

	private int ma;
	private String sanpham;
	private float giaBan;
	private Integer giaNhap;
	private String phanLoai;
	private String tinhTrang;
	private String donVi;
	private String nhaSanXuat;
	private String xuatXu;
	private Integer danhMuc;
	private String moTa;

}