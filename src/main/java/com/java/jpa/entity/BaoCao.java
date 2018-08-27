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
public class BaoCao {

	private String ma;
	private NhanVien nhanVien;
	private String ngayLap;
	private String nguoiDanhGia;

}