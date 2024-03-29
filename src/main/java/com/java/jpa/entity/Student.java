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
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3911723978261033451L;
	@Id
    @GeneratedValue
    private Long id;
 
    @Column
    private String name;
}
