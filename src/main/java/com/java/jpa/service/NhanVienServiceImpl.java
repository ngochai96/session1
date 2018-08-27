package com.java.jpa.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.java.jpa.dao.NhanVienRepositoryIml;
import com.java.jpa.entity.NhanVien;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	@Inject
	private NhanVienRepositoryIml studentDao;

	@Override
	public NhanVien findById(long id) {
		return studentDao.findById(id);
	}

}
