package com.csys.myproject.repository.param;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.myproject.domain.param.Admission;

public interface AdmissionRepository extends JpaRepository<Admission,String> {

	//Admission findOne(Admission admission);


}
