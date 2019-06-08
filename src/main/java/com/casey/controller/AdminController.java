package com.casey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.casey.bean.PatientDTO;
import com.casey.repository.PatientRepository;
import com.casey.utils.StatusResponse;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired // spring DI , inheriting the class without creating an instance here..
	PatientRepository patientRepo;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public StatusResponse getAllPatientData() {
		// boolean status = patientRepo.findAll();
		List<PatientDTO> data = patientRepo.findAll();
		StatusResponse status = new StatusResponse(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST, "fail", null);
		if (data != null) {
			status = new StatusResponse(HttpStatus.OK, HttpStatus.OK, "success", data);
		}
		return status;
	}

}
