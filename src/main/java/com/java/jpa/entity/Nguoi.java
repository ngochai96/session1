package com.java.jpa.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Nguoi implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8862372150493698387L;
	@Id
    @GeneratedValue
	private int ma;
	private String hoTen;
	private String gioiTinh;
	private String cmt;
	private Date ngaySinh;
	private String gmail;
	private String diaChi;

}