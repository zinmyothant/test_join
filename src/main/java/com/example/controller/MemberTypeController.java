package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.MemberType;
import com.example.dao.GuestRepository;
import com.example.dao.MemberTypeRepository;
import com.example.dto.MemberTypeDTO;
import com.example.response.GuestResponse;
import com.example.service.MemberTypeService;

@Controller
public class MemberTypeController {
	@Autowired
	public MemberTypeService service;
	@Autowired
	public MemberTypeRepository member;
	@Autowired
	public GuestRepository guest;
@GetMapping(name="/")
public ModelAndView member() {
	return new ModelAndView("M001","bean",new MemberType());
}
@PostMapping(value="/memadd")
public String memberAdd(@ModelAttribute("bean") MemberType bean,ModelMap map) {
	MemberTypeDTO dto=new MemberTypeDTO();
	List<MemberTypeDTO> list=new ArrayList<MemberTypeDTO>();
	dto.setMemtype_name(bean.getMemtype_name());
	dto.setMemtype_discount(bean.getMemtype_discount());
	
	service.save(dto);
	
	return "S001";
}
@GetMapping(value="/memAll")
public String memberAll(ModelMap map) {
	
	List<MemberTypeDTO> list=new ArrayList<MemberTypeDTO>();
	list=service.findAll();
	map.addAttribute("list", list);
	System.out.println(list);
	return "W001";
}

}
