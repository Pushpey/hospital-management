package com.pushpey.demorest4.services;

import com.pushpey.demorest4.models.Doctor;
import com.pushpey.demorest4.repositries.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository repo ;
    private DoctorService(DoctorRepository repo){
        this.repo = repo ;
    }
    public Doctor create(Doctor doctor){
        return repo.save(doctor);
    }
    public List<Doctor> getAll(){return repo.findAll();}
    public Doctor getById(Long id ){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Doctor"));
    }

}
