package com.casey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casey.bean.DoctorDTO;

@Repository
public interface DoctorRepo extends CrudRepository<DoctorDTO, Long> {

	List<DoctorDTO> findAll();

}
