package com.pushpey.demorest4.repositries;

import com.pushpey.demorest4.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
