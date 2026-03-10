package com.pushpey.demorest4.repositries;

import com.pushpey.demorest4.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
