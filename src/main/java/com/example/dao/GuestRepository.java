package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bean.Guest;
import com.example.dto.GuestDTO;
import com.example.response.GuestResponse;

public interface GuestRepository extends JpaRepository<GuestDTO, Integer>{
//	@Query("SELECT m.name,g.discount,g.memberType FROM GuestDTO g JOIN g.member m")
//	public List<GuestResponse> joinInfo();
}
