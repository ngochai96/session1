package com.java.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.java.jpa.entity.NhanVien;
@Repository
public class NhanVienRepositoryIml implements NhanVienRepository{
	@PersistenceContext
	private EntityManager em;
	@Override
	public NhanVien findById(long id) {
		return em.find(NhanVien.class, id);
	}

}
