package com.pushpey.demorest4.repositries;

import com.pushpey.demorest4.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment , Long> {
}
