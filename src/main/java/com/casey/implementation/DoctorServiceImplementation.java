package com.casey.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casey.bean.DoctorDTO;
import com.casey.repository.DoctorRepo;
import com.casey.service.DoctorService;

@Service
public class DoctorServiceImplementation implements DoctorService {

	@Autowired
	DoctorRepo doctorRepo;

	public List<DoctorDTO> getAllDoctorData() {
		List<DoctorDTO> data = doctorRepo.findAll();
		return data;
	}

}
