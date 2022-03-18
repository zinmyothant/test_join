package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.Guest;
import com.example.dao.GuestRepository;
import com.example.dto.GuestDTO;
import com.example.dto.MemberTypeDTO;
import com.example.service.GuestService;
import com.example.service.MemberTypeService;

@Controller
public class GuestController {
	@Autowired
	public GuestRepository guestService;
	@Autowired
	public MemberTypeService memberService;
@GetMapping(value = "/guest")
public ModelAndView addGuest(ModelMap map) {
	List<MemberTypeDTO> list=memberService.findAll();
	map.addAttribute("mList", list);
	return new ModelAndView("G001","bean",new Guest());
}
	@PostMapping(value = "/guestadd")
	public String save(GuestDTO bean) {
		
		guestService.save(bean);
		
		return "S001";
	}
	@GetMapping(value="/joininfo")
	public String info(ModelMap map) {
		List<GuestDTO> list=guestService.findAll();
		map.addAttribute("mList", list);
		return "G004";
	}
}
