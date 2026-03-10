package com.pushpey.demorest4.services;

import com.pushpey.demorest4.models.Patient;
import com.pushpey.demorest4.repositries.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository repo ;
    private PatientService(PatientRepository repo){
        this.repo = repo ;
    }
    public Patient create(Patient patient){
        return repo.save(patient);
    }
    public List<Patient> getAll(){
        return repo.findAll();
    }
    public Patient getById(Long id ){
        return repo.findById(id).orElseThrow(() ->new RuntimeException("Patient"));
    }
    public Patient update(Long id , Patient updated){
        Patient patient = getById(id);
        patient.setName(updated.getName());
        patient.setAge(updated.getAge());
        patient.setDisease(updated.getDisease());
        patient.setPhone(updated.getPhone());
        return repo.save(patient);

    }
    public void delete(Long id ){
        repo.deleteById(id);
    }

}
