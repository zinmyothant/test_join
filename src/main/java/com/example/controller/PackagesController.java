package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dao.PackagesRepository;
import com.example.dto.packages;

@Controller
public class PackagesController {
@Autowired
public PackagesRepository packageRepository;
@GetMapping("/pack")
public String show(ModelMap map) {
	map.addAttribute("pack", new packages());
	return "P001";
}

@PostMapping("/addPack")
public String add(packages pack) {
	packageRepository.save(pack);
	return "S001";
}
}
