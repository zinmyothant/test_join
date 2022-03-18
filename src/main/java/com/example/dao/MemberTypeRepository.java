package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bean.MemberType;
import com.example.dto.MemberTypeDTO;
import com.example.response.GuestResponse;

public interface MemberTypeRepository extends JpaRepository<MemberTypeDTO, Integer>{

	
}
