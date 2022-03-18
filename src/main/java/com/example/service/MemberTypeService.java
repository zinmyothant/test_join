package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberTypeRepository;
import com.example.dto.MemberTypeDTO;

@Service
public class MemberTypeService{
@Autowired
public MemberTypeRepository memberTypeRepository;
public void save(MemberTypeDTO dto) {
	memberTypeRepository.save(dto);
}
public List<MemberTypeDTO> findAll(){
	return memberTypeRepository.findAll();
}
}
