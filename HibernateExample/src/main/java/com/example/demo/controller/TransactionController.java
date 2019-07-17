package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.BeansDao;
import com.example.demo.model.Beans;

@Controller
public class TransactionController {

	@Autowired
	BeansDao dao;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addBeans")
	public String addBeans(Beans b) {
		dao.save(b);
		return "home.jsp";
	}
}
