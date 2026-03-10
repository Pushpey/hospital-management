package com.pushpey.demorest4.services;

import com.pushpey.demorest4.models.Appointment;
import com.pushpey.demorest4.models.Doctor;
import com.pushpey.demorest4.models.Patient;
import com.pushpey.demorest4.repositries.AppointmentRepository;
import com.pushpey.demorest4.repositries.DoctorRepository;
import com.pushpey.demorest4.repositries.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository repo1 ;
    private final PatientRepository repo2;
    private final DoctorRepository repo3;

    public AppointmentService(AppointmentRepository repo1,
                              PatientRepository repo2,
                              DoctorRepository repo3 ){
        this.repo1 = repo1;
        this.repo2 = repo2 ;
        this.repo3 = repo3 ;
    }
    public Appointment bookAppointment(Long patientId , Long doctorId){
        Patient patient = repo2.findById(patientId).orElseThrow(() ->new RuntimeException("patient not found"));
        Doctor doctor = repo3.findById(doctorId).orElseThrow(() ->new RuntimeException("Doctor not found "));
        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        return repo1.save(appointment);
    }


//    private AppointmentService(AppointmentRepository repo){
//        this.repo1 = repo ;
//    }
//
//    public Appointment create(Appointment appointment){
//        return repo1.save(appointment);
//    }

    public List<Appointment> getAll(){
        return repo1.findAll();
    }

    public Appointment getById(Long id){
        return repo1.findById(id).orElseThrow(() ->new RuntimeException("Appointment not found"));
    }

    public void delete(Long id ){repo1.deleteById(id);}
}
