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
public class ChiTietPhieuNhap {

	private int ma;
	private Integer matHang;
	private int soLuong;
	private float giaNhap;
	private int matHangMa;
	private int phieuNhapMa;

}