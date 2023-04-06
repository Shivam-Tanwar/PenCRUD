package com.ef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ef.model.Pen;
import com.ef.service.PenService;

@RestController
public class PenController {
	@Autowired
	PenService penservice;
	
	@PostMapping("/pen")
	private int savePen(@RequestBody Pen pen) {
		penservice.saveOrUpdate(pen);
		return pen.getId();
	}
    @GetMapping("/pen/{id}")
    private Pen getPen(@PathVariable("id")int id) {
    	return penservice.getPenById(id);
    }
}
