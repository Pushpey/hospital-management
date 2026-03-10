package com.pushpey.demorest4.controllers;

import com.pushpey.demorest4.models.Doctor;
import com.pushpey.demorest4.models.Patient;
import com.pushpey.demorest4.repositries.DoctorRepository;
import com.pushpey.demorest4.services.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;
    public DoctorController(DoctorService doctorService ){
        this.doctorService = doctorService ;
    }
    @PostMapping
    public Doctor create(@RequestBody Doctor doctor){
        return doctorService.create(doctor);
    }

    @GetMapping
    public List<Doctor> getAll(){
        return doctorService.getAll();
    }
    @GetMapping("/{id}")
    public Doctor getById(@PathVariable Long id ){
        return doctorService.getById(id);
    }


}
