package com.ef.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ef.model.Pen;
import com.ef.repository.PenRepository;

@Service
public class PenService {
	@Autowired
	PenRepository penrepo;
	
	public void saveOrUpdate(Pen pen) {
		penrepo.save(pen);
	}

	public Pen getPenById(int id) {
		return penrepo.findById(id).get();
	}
}
