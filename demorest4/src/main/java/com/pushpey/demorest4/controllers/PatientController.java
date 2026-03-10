package com.pushpey.demorest4.controllers;

import com.pushpey.demorest4.models.Patient;
import com.pushpey.demorest4.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
      private final PatientService patientService;
      public PatientController(PatientService patientService){
          this.patientService = patientService;
      }

      @PostMapping
      public Patient create(@RequestBody Patient patient){
          return patientService.create(patient);
      }
      @GetMapping
      public List<Patient> getAll(){
          return patientService.getAll();
      }
      @GetMapping("/{id}")
      public Patient getById(@PathVariable Long id ){
          return patientService.getById(id);
      }

      @PutMapping("/{id}")
      public Patient update(@PathVariable Long id , @RequestBody Patient patient){
          return patientService.update(id , patient);

      }

      @DeleteMapping("/{id}")
      public void delete(@PathVariable Long id){
          patientService.delete(id);
      }

}
