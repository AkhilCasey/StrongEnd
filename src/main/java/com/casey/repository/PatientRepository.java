package com.casey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casey.bean.PatientDTO;

@Repository
public interface PatientRepository extends CrudRepository<PatientDTO, Long> {

	List<PatientDTO> findAll();
}
