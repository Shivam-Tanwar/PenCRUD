package com.ef.repository;

import org.springframework.data.repository.CrudRepository;

import com.ef.model.Pen;

public interface PenRepository extends CrudRepository<Pen, Integer> {

}
