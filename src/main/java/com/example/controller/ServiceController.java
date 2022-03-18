package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dao.PackagesRepository;
import com.example.dao.ServiceRepository;
import com.example.dto.packages;
import com.example.dto.service;

@Controller
public class ServiceController {
@Autowired
public ServiceRepository serviceRepository;
@Autowired
public PackagesRepository packagesRepository;
@GetMapping("/show")
public String show(ModelMap map) {
	List<service>list=serviceRepository.findAll();
	map.addAttribute("sList", list);
	return "Ser001";
}
@GetMapping("/service")
public String add(ModelMap map) {
	List<packages> list=packagesRepository.findAll();
	map.addAttribute("pList", list);
	map.addAttribute("ser", new service());
	return "SER002";
}
@PostMapping("/new")
public String addser(service service) {
	serviceRepository.save(service);
	return "S001";
}
}
