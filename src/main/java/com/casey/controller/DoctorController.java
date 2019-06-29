package com.casey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casey.bean.DoctorDTO;
import com.casey.bean.PatientDTO;
import com.casey.implementation.AdminServiceImplementation;
import com.casey.implementation.DoctorServiceImplementation;
import com.casey.utils.StatusResponse;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	// all data doctor wants to be here..

	@Autowired
	DoctorServiceImplementation doctorServiceImpl;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public StatusResponse getAllDoctorData() {
		List<DoctorDTO> data = doctorServiceImpl.getAllDoctorData();
		StatusResponse status = new StatusResponse(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST, "fail", null);
		if (data != null) {
			status = new StatusResponse(HttpStatus.OK, HttpStatus.OK, "success", data);
		}
		return status;
	}

	@RequestMapping(value = "/getOne", method = RequestMethod.GET)
	public StatusResponse getOneDoctor(@RequestParam("id") Integer id) {
		List<DoctorDTO> data = doctorServiceImpl.getById(id);
		StatusResponse status = new StatusResponse(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST, "fail", null);
		if (data != null) {
			status = new StatusResponse(HttpStatus.OK, HttpStatus.OK, "success", data);
		}
		return status;
	}
}
