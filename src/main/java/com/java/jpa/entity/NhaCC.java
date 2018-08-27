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
public class NhaCC {

	private int ma;
	private String ten;
	private String diaChi;
	private String sdt;
	private Date ngayThanhLap;
	private String nguoiDaiDien;

}