package com.casey.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casey.bean.PatientDTO;
import com.casey.repository.PatientRepository;
import com.casey.service.AdminService;

@Service
public class AdminServiceImplementation implements AdminService {

	@Autowired // spring DI , inheriting the class without creating an instance here..
	PatientRepository patientRepo;

	public List<PatientDTO> getAllPatientData() {
		List<PatientDTO> data = patientRepo.findAll();
		return data;
	}

}
