package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Beans;

public interface BeansDao extends JpaRepository<Beans, Integer> {

}
