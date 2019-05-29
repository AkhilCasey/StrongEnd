package com.casey.repository;

import org.springframework.data.repository.CrudRepository;

import com.casey.bean.DoctorPrescription;

public interface DoctorRepo extends CrudRepository<DoctorPrescription, Long>{

}
