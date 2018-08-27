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
public class NhanVien extends Nguoi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2006262620079840341L;
	private String taiKhoan;
	private String maiKhau;
	private Integer quyen;
	private Integer chucVu;

}