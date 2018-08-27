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
public class ChiTietHoaDon {

	private int ma;
	private MatHang matHang;
	private int soluong;
	private String giaBan;

}