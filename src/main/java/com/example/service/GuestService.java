package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.GuestRepository;
import com.example.dto.GuestDTO;
import com.example.dto.MemberTypeDTO;
@Service
public class GuestService {
	@Autowired
	public GuestRepository guestRepository;
	public void save(GuestDTO dto) {
		guestRepository.save(dto);
	}
	public List<GuestDTO> findAll(){
		return guestRepository.findAll();
	}

}
